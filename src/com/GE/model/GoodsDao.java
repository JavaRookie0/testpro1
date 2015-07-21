package com.GE.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GoodsDao {

	public void saveGoods(Goods goods){
		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 数据库连接url
			String url = "jdbc:mysql://localhost:3306/db_database05";
			// 获取数据库连接
			Connection conn = DriverManager.getConnection(url, "root", "root");
			// sql语句
			String sql = "insert into tb_goods(name,price,description) values(?,?,?)";
			// 创建PreparedStatement对象
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对sql语句中参数赋值
			ps.setString(1, goods.getName());
			ps.setDouble(2, goods.getPrice());
			ps.setString(3, goods.getDescription());
			ps.executeUpdate();		// 更新操作
			ps.close();		// 关闭ps
			conn.close();	// 关闭conn
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

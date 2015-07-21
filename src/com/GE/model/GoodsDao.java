package com.GE.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GoodsDao {

	public void saveGoods(Goods goods){
		try {
			// ��������
			Class.forName("com.mysql.jdbc.Driver");
			// ���ݿ�����url
			String url = "jdbc:mysql://localhost:3306/db_database05";
			// ��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url, "root", "root");
			// sql���
			String sql = "insert into tb_goods(name,price,description) values(?,?,?)";
			// ����PreparedStatement����
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��sql����в�����ֵ
			ps.setString(1, goods.getName());
			ps.setDouble(2, goods.getPrice());
			ps.setString(3, goods.getDescription());
			ps.executeUpdate();		// ���²���
			ps.close();		// �ر�ps
			conn.close();	// �ر�conn
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

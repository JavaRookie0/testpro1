package com.GE.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.GE.model.Goods;
import com.GE.model.GoodsDao;

/**
 * Servlet implementation class GoodsServlet
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置response编码
		response.setContentType("text/html");
		response.setContentType("GBK");
		// 设置request编码
		request.setCharacterEncoding("GBK");
		// 获取输出流
		PrintWriter out = response.getWriter();
		// 获取商品信息
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String description = request.getParameter("description");

		Goods goods = new Goods(); // 实例化商品对象

		// 对商品对象赋值
		goods.setName(name);
		goods.setPrice(Double.valueOf(price));
		goods.setDescription(description);

		// 实例化GoodsDao
		GoodsDao goodsDao = new GoodsDao();
		goodsDao.saveGoods(goods);
		out.print("保存商品信息成功");
		out.flush();
		out.close();

	}

}

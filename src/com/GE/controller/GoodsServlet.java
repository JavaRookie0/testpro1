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
		// ����response����
		response.setContentType("text/html");
		response.setContentType("GBK");
		// ����request����
		request.setCharacterEncoding("GBK");
		// ��ȡ�����
		PrintWriter out = response.getWriter();
		// ��ȡ��Ʒ��Ϣ
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String description = request.getParameter("description");

		Goods goods = new Goods(); // ʵ������Ʒ����

		// ����Ʒ����ֵ
		goods.setName(name);
		goods.setPrice(Double.valueOf(price));
		goods.setDescription(description);

		// ʵ����GoodsDao
		GoodsDao goodsDao = new GoodsDao();
		goodsDao.saveGoods(goods);
		out.print("������Ʒ��Ϣ�ɹ�");
		out.flush();
		out.close();

	}

}

package edu.chengXian.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.chengXian.bean.bookorder;
import edu.chengXian.dao.bookorderDao;


public class DoOrder extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		String username=request.getParameter("username");
		String phone=request.getParameter("phone");
		String zipcode=request.getParameter("zipcode");
		String creditcard=request.getParameter("creditcard");
		double total=(double)request.getSession().getAttribute("price");
		bookorder order=new bookorder(username, phone, creditcard, zipcode, total);
		if(bookorderDao.me.addOrder(order)) {
			request.getSession().setAttribute("orderinfo", order);
			request.getRequestDispatcher("bye.jsp").forward(request, response);
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doGet(request,response);
	}
}

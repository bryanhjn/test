package edu.chengXian.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.chengXian.bean.titles;
import edu.chengXian.dao.titlesDao;

public class ToViewTitle extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		String isbn=request.getParameter("ISBN");
		response.setContentType("text/html;charset=utf-8");
		titles t=titlesDao.me.getTitle(isbn);
		request.getSession().setAttribute("choiceBook", t);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doGet(request,response);
	}
	
	
	
}

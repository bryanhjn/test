package edu.chengXian.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.chengXian.dao.titlesDao;


public class deleteTitle extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		String isbn=request.getParameter("ISBN");
		if(titlesDao.me.deleteTitle(isbn)) {
			response.sendRedirect("listBook.jsp");
		}
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doGet(request,response);
	}
}

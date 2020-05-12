package edu.chengXian.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.chengXian.bean.titles;

public class AddTitlesToCart extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		String isbn=request.getParameter("ISBN");
		List<titles> cart=new ArrayList<titles>();
		titles choicebook=(titles)request.getSession().getAttribute("choiceBook");
		if(request.getSession().getAttribute("Cart") != null) {
			cart=(List)request.getSession().getAttribute("Cart");
			boolean find=false;
			for(titles t : cart) {
				if(t.getIsbn().equals(choicebook.getIsbn())) {
					find=true;
					break;
				}
			}
			if(!find) {
				cart.add(choicebook);
				double price=(double)request.getSession().getAttribute("price");
				price+=choicebook.getPrice();
				request.getSession().setAttribute("price", price);
			}
			
		}else {
			cart.add(choicebook);
			request.getSession().setAttribute("Cart", cart);
			request.getSession().setAttribute("price", choicebook.getPrice());
		}
		request.getRequestDispatcher("viewCart.jsp").forward(request, response);
		
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doGet(request,response);
	}

}

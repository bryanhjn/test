<%@ page language="java" import="edu.chengXian.dao.titlesDao" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	<jsp:useBean id="book" class="edu.chengXian.bean.titles"></jsp:useBean>
	<jsp:setProperty property="*" name="book"/>
	<%
		if(request.getParameter("method").equals("modify")){
			if(titlesDao.me.modifyTitle(book)){
		response.sendRedirect("listBook.jsp");
			}
		}else if(request.getParameter("method").equals("add")){
			if(titlesDao.me.addTitle(book)){
		response.sendRedirect("listBook.jsp");
			}
		}
	%>
	
</body>
</html>
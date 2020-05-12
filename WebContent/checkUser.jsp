<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<jsp:useBean id="check" class="edu.chengXian.dao.userDao" />
	<%
	request.setCharacterEncoding("utf-8");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	if(check.login(username, password)){
		session.setAttribute("userinfo",username);
		session.setMaxInactiveInterval(3600);
		response.sendRedirect("main.jsp");
	}else{
		response.sendRedirect("index.html");
	}
	%>
</body>
</html>
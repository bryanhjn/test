<%@ page language="java" import="java.util.*,edu.chengXian.bean.titles" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	.title{
		font-size:45px;
	}
</style>
<link rel="stylesheet" href="/file/layui/css/layui.css">
</head>
<body>
	<div class="title" style="text-align:center;">浏览图书</div>
	<div style="width: 80%;margin: 30px auto;">
		<table lay-even class="layui-table">
			<tr>
				<th>书名</th>
				<th>版本</th>
				<th>年份</th>
				<th>价格</th>
				<th>ISBN</th>
				<th>操作</th>
			</tr>
			<jsp:useBean id="book" class="edu.chengXian.dao.titlesDao"></jsp:useBean>
			<%
				List<titles> books=book.getTitles();
			%>
			<%
				for(titles t : books){
			%>
			<tr>
				<td>《<%=t.getTitle() %>》</td>
				<td><%=t.getEditionNumber() %></td>
				<td><%=t.getCopyright()%></td>
				<td><%=t.getPrice() %></td>
				<td><%=t.getIsbn() %></td>
				<td><a href="editTitle.jsp?ISBN=<%=t.getIsbn() %>" class="layui-btn layui-btn-sm layui-btn-radius">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://localhost:8080/bookstores/deleteTitle?ISBN=<%= t.getIsbn() %>" class="layui-btn layui-btn-sm layui-btn-radius layui-btn-danger">删除</a></td>
			</tr>
			<%} %>
		</table>
	</div>
	<a href="addBook.jsp" class="layui-btn layui-btn-radius" style="margin: 10px 0px 60px 120px;">添加图书</a>
</body>
</html>
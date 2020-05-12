<%@ page language="java" import="java.util.*,edu.chengXian.bean.titles" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	body{
			width:100%;
			height:600px;
		    display: flex;
		    justify-content: center;
		    align-items: center;
		    flex-direction: column;
		}
</style>
<link rel="stylesheet" href="/file/layui/css/layui.css">
</head>
<body>
	<%
		List<titles> books=new ArrayList<titles>();
		boolean exist=false;
		if(request.getSession().getAttribute("Cart")!=null){
			books=(List<titles>)request.getSession().getAttribute("Cart");
			exist=true;
		}
	%>
	<div style="width: 80%;margin: 30px auto;">
		<table lay-even class="layui-table">
			<caption>购物车商品</caption>
			<tr>
				<th>书籍名称</th>
				<th>数量</th>
				<th>价格</th>
				<th>小计</th>
			</tr>
			<%
				if(exist){
				for(titles book : books){
			%>
			<tr>
				<td><%=book.getTitle() %></td>
				<td>1</td>
				<td><%=book.getPrice() %></td>
				<td><%=book.getPrice() %></td>
			</tr>
			<%
			} 
			%>
			<tr>
				<td colspan="4">总计：<%=request.getSession().getAttribute("price") %>
			</tr>
			<%}else{ %>
			<tr>
				<td colspan="4">购物车空</td>
			</tr>
			<%} %>
		</table>
	</div>
	<a href="viewBook.jsp" class="layui-btn layui-btn-lg layui-btn-radius" >继续购物</a>
	<%if(exist){ %>
		<div>
			<form action="order.html" method="get">
				<input type="submit" value="结账"/ class="layui-btn layui-btn-lg layui-btn-radius layui-btn-warm" style="margin-top:20px;">			
			</form>
		</div>
	<% }%>
</body>
</html>
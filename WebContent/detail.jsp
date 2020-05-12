<%@ page language="java" import="edu.chengXian.bean.titles" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
	.title{
		margin-top:15px;
		font-size:35px;
		text-align:center;
	}
	.cover{
		height:150px;
		width:100px;
		border:2px solid #ccc;
		margin-right:70px;
		margin-top:5px;
	}
	
	.content{
		display:flex;
		margin-top:50px;
		justify-content:center;
	}
</style>
<link rel="stylesheet" href="/file/layui/css/layui.css">
</head>
<body>
	<%
		titles book=(titles)request.getSession().getAttribute("choiceBook");
	%>
	<div class="title">《<%=book.getTitle() %>》</div>
	<div class="content">
		<div class="cover">
			<img alt="<%=book.getTitle() %>" src="<%=book.getImageFile() %>" />
		</div>
		<div>
			<table border="0 solid #ccc" cellspacing="0" cellpadding="5px">
				<tr>
					<td>图书编号
					</td>
					<td><%=book.getIsbn() %></td>
				</tr>
				<tr>
					<td>价格
					</td>
					<td><%=book.getPrice() %></td>
				</tr>
				<tr>
					<td>版本号
					</td>
					<td><%=book.getEditionNumber() %></td>
				</tr>
				<tr>
					<td>版权
					</td>
					<td><%=book.getCopyright() %></td>
				</tr>
				<tr>
					<form action="http://localhost:8080/bookstores/AddTitlesToCart" method="get">
						<td><input type="submit" class="layui-btn layui-btn-sm layui-btn-radius" value="加入购物车" style="margin: 20px 20px 0 0;"/></td>
					</form>
					<form action="viewCart.jsp" method="get">
						<td><input type="submit" class="layui-btn layui-btn-sm layui-btn-radius" value="查看购物车" style="margin: 20px 20px 0 0;" /></td>
					</form>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
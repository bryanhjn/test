<%@ page language="java" import="java.util.*,edu.chengXian.bean.titles,edu.chengXian.bean.bookorder" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="/file/layui/css/layui.css">
</head>
<body>
	<div>
		<div style="margin-left: 115px;margin-top:50px;">我们以收到您的订单，将会尽快为您发货。</div>
		<div style="width: 80%;margin: 30px auto;">
			<%
			List<titles> books=(List<titles>)request.getSession().getAttribute("Cart");
			
			%>
			<table lay-even class="layui-table">
				<caption>购物清单</caption>
				<tr>
					<th>书籍名称</th>
					<th>数量</th>
					<th>价格</th>
					<th>小计</th>
				</tr>
				<%for(titles book : books){ %>
				<tr>
					<td><%=book.getTitle() %></td>
					<td>1</td>
					<td><%=book.getPrice() %></td>
					<td><%=book.getPrice() %></td>
				</tr>
				<%} %>
				<tr>
					<td colspan="4">总计：<%=request.getSession().getAttribute("price") %>
				</tr>
			</table>
		</div>
		<br>
		<div style="margin-left: 115px;">
			<%bookorder order=(bookorder)request.getSession().getAttribute("orderinfo"); %>
			<div>客户信息</div>
			<div>收件人：<%=order.getUsername() %>先生/女士</div>
			<div>邮编：<%=order.getZipcode() %></div>
			<div>电话：<%=order.getPhone() %></div>
			<div>付款账号：<%=order.getCreditcard() %></div>
			<div>订单合计：<%=order.getTotal() %>元</div>
			<h3>欢迎下次光临！</h3>
			<%
			request.getSession().removeAttribute("Cart");
			request.getSession().setAttribute("price", 0);
			%>
		</div>
	</div>
</body>
</html>
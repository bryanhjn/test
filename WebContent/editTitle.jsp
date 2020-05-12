<%@ page language="java" import="edu.chengXian.bean.titles" contentType="text/html; charset=UTF-8"
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
	<jsp:useBean id="dao" class="edu.chengXian.dao.titlesDao" />
	<%
		titles book=dao.getTitle(request.getParameter("ISBN"));
		request.setCharacterEncoding("UTF-8");response.setCharacterEncoding("UTF-8");
	%>
	<div style="font-size:45px;margin-bottom:30px;">修改图书</div>
	<form action="save.jsp?method=modify" method="post" >
		<div>
			<table>
				<tr>
					<td>ISBN</td>
					<td>
						<input type="text" value="<%=book.getIsbn() %>" readonly name="isbn"/></td>
				</tr>
				<tr>
					<td>书名</td>
					<td>
						<input type="text" value="<%=book.getTitle() %>" name="title"/></td>
				</tr>
				<tr>
					<td>封面图</td>
					<td>
						<input type="text" value="<%=book.getImageFile() %>"name="imageFile"/></td>
				</tr>
				<tr>
					<td>版本号</td>
					<td>
						<input type="text" value="<%=book.getEditionNumber() %>"name="editionNumbet"/></td>
				</tr>
				<tr>
					<td>出版商ID</td>
					<td>
						<input type="text" value="<%=book.getPublisherId() %>"name="publisherId"/></td>
				</tr>
				<tr>
					<td>价格</td>
					<td>
						<input type="text" value="<%=book.getPrice() %>"name="price"/></td>
				</tr>
				<tr>
					<td>年份</td>
					<td>
						<input type="text" value="<%=book.getCopyright() %>"name="copyright"/></td>
				</tr>
			</table>
		</div>
		<div>
			<input type="submit" value="保存" class="layui-btn layui-btn-radius" style="margin: 35px 0 0 95px;"/>
		</div>
	</form>
</body>
</html>
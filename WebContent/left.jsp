<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	.title{
		color:#009688;
		font-size:20px;
		margin-top:30px;
	}
	.center{
		text-align:center;
	}
</style>
<link rel="stylesheet" href="/file/layui/css/layui.css">
</head>
<body style="background-color: #eeeeee;">
	<div style="text-align:center;line-height:40px;">
		<div>
			<div style="margin-top: 130px;">尊敬的<%=request.getSession().getAttribute("userinfo") %>，您好！</div>
		</div>
		<div>
			<div class="title">用户视图</div>
			<a href="viewBook.jsp" target="main" class="layui-btn layui-btn-normal">浏览图书</a>	
		</div>
		<div>
			<div class="title">管理员视图</div>
			<a href="listBook.jsp" target="main"  class="layui-btn layui-btn-normal">图书管理</a>
		</div>
	</div>
</body>
</html>
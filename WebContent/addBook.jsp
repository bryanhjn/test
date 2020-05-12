<%@ page language="java" import="edu.chengXian.bean.titles" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="font-size:75px;">添加图书</div>
	<form action="save.jsp?method=add" method="post">
		<div>
			<table>
				<tr>
					<td>Isbn号</td>
					<td>
						<input type="text"  name="isbn"/></td>
				</tr>
				<tr>
					<td>书名</td>
					<td>
						<input type="text"  name="title"/></td>
				</tr>
				<tr>
					<td>封面图像文件名称</td>
					<td>
						<input type="text" name="imageFile"/></td>
				</tr>
				<tr>
					<td>版本号</td>
					<td>
						<input type="text" name="editionNumbet"/></td>
				</tr>
				<tr>
					<td>出版商ID</td>
					<td>
						<input type="text" name="publisherId"/></td>
				</tr>
				<tr>
					<td>价格</td>
					<td>
						<input type="text" name="price"/></td>
				</tr>
				<tr>
					<td>版权</td>
					<td>
						<input type="text" name="copyright"/></td>
				</tr>
			</table>
		</div>
		<div>
			<input type="submit" value="保存" />
		</div>
	</form>
</body>
</html>
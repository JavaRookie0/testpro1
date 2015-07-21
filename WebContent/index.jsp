<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>

<body>
	<form action="GoodsServlet" method="post" onsubmit="return save(this);">
		<table border="1" align="center" width="300">
			<tr>
				<td align="center" colspan="2"><br>
				<h1>录入商品信息</h1></td>
			</tr>
			<tr>
				<td align="right">商品名称：</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="right">价 格：</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td align="right">商品描述：</td>
				<td><textarea name="description" cols="30" rows="3"></textarea></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="提 交">
					<input type="reset" value="重 置"></td>
			</tr>
		</table>
	</form>
</body>
</html>

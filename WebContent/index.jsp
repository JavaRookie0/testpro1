<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>

<body>
	<form action="GoodsServlet" method="post" onsubmit="return save(this);">
		<table border="1" align="center" width="300">
			<tr>
				<td align="center" colspan="2"><br>
				<h1>¼����Ʒ��Ϣ</h1></td>
			</tr>
			<tr>
				<td align="right">��Ʒ���ƣ�</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="right">�� ��</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td align="right">��Ʒ������</td>
				<td><textarea name="description" cols="30" rows="3"></textarea></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="�� ��">
					<input type="reset" value="�� ��"></td>
			</tr>
		</table>
	</form>
</body>
</html>

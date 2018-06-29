<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login" method="post">
	<center>
	<table>
		<caption>登陆</caption>
		<tr>
			<td>用户名：</td>
			<td><input name="username" type="text" value=""></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input name="password" type="password" value=""></td>
		</tr>
		<tr>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<td><input type="reset" value="重置"></td>
			<td><input type="submit" value="登陆"></td>
		</tr>
	</table>
	</center>
	</form>
</body>
</html>
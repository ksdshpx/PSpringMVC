<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Success Page.</h1>
	username:${requestScope.username}<br/>
	password:${requestScope.password}<br/>
	errorMsg:${requestScope.errorMsg}<br/>
</body>
</html>
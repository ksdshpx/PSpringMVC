<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringMVC测试</title>
</head>
<body>
	<a href="<c:url value='/hello'/>">Hello SpringMVC</a>
	<br/>
	<a href="<c:url value='/springmvc/testRequestMapping'/>">Test RequestMapping</a>
	<br/>
	<a href="<c:url value='/springmvc/testRequestMappingMethod'/>">Test RequestMapping Method</a>
	<form action="<c:url value='/springmvc/testRequestMappingMethod'/>">
		<input type="submit" value="提交"/>
	</form>
</body>
</html>
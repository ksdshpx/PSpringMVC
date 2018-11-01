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
	<br/>
	<a href="<c:url value='/springmvc/testRequestMappingParamsAndHeaders?username=tom&age=25'/>">Test RequestMapping ParamsAndHeaders</a>
	<br/>
	<a href="<c:url value='/springmvc/testPathVariable/Admin/1001'/>">Test PathVariable</a>
	<br/>
	<!-- 查询订单编号为1001的订单 -->
	<a href="<c:url value='/order/1001'/>">REST GET</a>
	<!-- 删除订单编号为1001的订单 -->
	<form action="<c:url value='/order/1001'/>" method="post">
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="REST DELETE"/>
	</form>
	<!-- 更新订单 -->
	<form action="<c:url value='/order'/>" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="REST PUT"/>
	</form>
	<!-- 新增订单 -->
	<form action="<c:url value='/order'/>" method="post">
		<input type="submit" value="REST POST"/>
	</form>
	<br/>
	<a href="<c:url value='/testRequestParam?username=zhangSan&age=88'/>">Test RequestParam</a>
	<br/>
	<a href="<c:url value='/testRequestHeader'/>">Test RequestHeader</a>
	<br/>
	<a href="<c:url value='/testCookieValue'/>">Test CookieValue</a>
	<br/>
	<form action="<c:url value='/testPojo'/>" method="post">
		用户名：<input type="text" name="username"/><br/>
		密码：<input type="password" name="password"/><br/>
		邮箱：<input type="text" name="email"/><br/>
		性别：男<input type="radio" name="gender" value="1"/>
			   女<input type="radio" name="gender" value="0"/><br/>
		省份：<input type="text" name="address.province"/><br/>
		城市：<input type="text" name="address.city"/>
		<input type="submit" value="Test Pojo"/>
	</form>
	<br/>
	<a href="<c:url value='/testServletAPI'/>">Test ServletAPI</a>
</body>
</html>
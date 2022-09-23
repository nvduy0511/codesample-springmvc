<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
	<title>HOME</title>
	<style>
		h1{
			color: red;
		}
	</style>
</head>

<body>
	<c:set scope="request" var="user" value="${sessionScope.user}" />
	<c:if test="${user eq null}">
		<c:redirect url="/account/login-or-register"/>
	</c:if>
	<div style="height: 400px">
		<h1>HOME  1</h1>
		<h1> ${user.fullName}</h1>
	</div>

</body>

</html>
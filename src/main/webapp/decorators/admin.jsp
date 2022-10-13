<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="<c:url value='/resources/css/cssAdmin/layout.css' />" type="text/css"/>
	<link href="<c:url value="/resources/css/cssAdmin/QLBTCode.css"/>" rel="stylesheet" type="text/css">
	<link href="<c:url value="/resources/css/cssAdmin/QLLT.css"/>" rel="stylesheet" type="text/css">
	<title>Layout</title>
</head>
<body id="body">
<div class="l-navbar" id="navbar">
	<div class="nav">
		<div>
			<a href="<c:url value="/admin/trang-chu/"/>" class="nav_logo">
				<img class="nav_logo-icon" src="<c:url value="/resources/images/logo_CodeSample.png"/>"/>
				<span class="nav_logo-text">CODE SAMPLE</span>
			</a>
			<div class="nav_toggle" id="nav_toggle">
				<i style="font-size: 13px;" class="fa-solid fa-chevron-right"></i>
			</div>

			<ul class="nav_list">
				<a href="<c:url value="/admin/trang-chu/"/>" class="nav_link ">
					<i class="fa-solid fa-list-check nav_icon"></i>
					<span class="nav_text">Thống kê</span>
				</a>
				<a href="<c:url value="/admin/QLBTCode/"/>" class="nav_link ">
					<i class="fa-solid fa-laptop-code nav_icon"></i>
					<span class="nav_text">Bài code</span>
				</a>
				<a href="<c:url value="/admin/QLLT/"/>" class="nav_link ">
					<i class="fa-solid fa-file-pen nav_icon"></i>
					<span class="nav_text">Môn học và lý thuyết</span>
				</a>
				<a href="<c:url value="/admin/QLUser/"/>" class="nav_link ">
					<i class="fa-solid fa-user nav_icon"></i>
					<span class="nav_text">Người dùng</span>
				</a>
<%--				@foreach (var item in role)--%>
<%--				{--%>

<%--				@if (item.IdRoles.Equals("super_admin"))--%>
<%--				{--%>
<%--				}--%>

<%--				}--%>
				<a href="<c:url value="/admin/QLFB/"/>" class="nav_link ">
					<i class="fa-solid fa-comments nav_icon"></i>
					<span class="nav_text">Feedback</span>
				</a>
			</ul>
		</div>
		<a href="<c:url value="/Login/admin/adminLogin/"/>" class="nav_link ">
			<i class="fa-solid fa-right-from-bracket nav_icon"></i>
			<span class="nav_text">Đăng xuất</span>
		</a>
	</div>
</div>
<div id="header">
	<div class="load-wrapp">
		<div class="load-6">
			<div class="letter-holder">
				<div class="l-1 letter">C</div>
				<div class="l-2 letter">o</div>
				<div class="l-3 letter">d</div>
				<div class="l-4 letter">e</div>
				<div class="l-5 letter">S</div>
				<div class="l-6 letter">a</div>
				<div class="l-7 letter">m</div>
				<div class="l-8 letter">p</div>
				<div class="l-9 letter">l</div>
				<div class="l-10 letter">e</div>
			</div>
		</div>
	</div>
	<div class="header_name_avatar">
		<i style="font-size: 30px;" class="fa-solid fa-circle-user"></i>
		<p style="margin: 0;">Admin CodeSample</p>
	</div>
</div>
<dec:body/>
<script src="<c:url value='/resources/js/jsAdmin/main.js'/>"></script>
<script src="<c:url value='/resources/lib/lib_Admin/ckeditor/ckeditor.js'/>"></script>
<script>
	CKEDITOR.replace('editor1');
</script>
</body>
</html>
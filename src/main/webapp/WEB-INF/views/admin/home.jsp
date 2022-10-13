<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <link href="<c:url value="/resources/css/cssAdmin/layout.css"/>" rel="stylesheet" type="text/css">
    <title>Home Admin</title>
</head>
<body id="body">
<div id="bodys">
    <div style="padding: 15px 10px;" class="body_tk">
        <div class="item">
            <div style="background-color: rgb(182 50 23);" class="cus_image">
                <i style="font-size: 30px;" class="fa-solid fa-circle-user"></i>
            </div>
            <div>
                <span style="font-weight:700; font-size:30px">${countUser}</span>
                <p class="title">Người dùng</p>
            </div>
        </div>
        <div style="background-color: rgb(34, 34, 192);" class="item">
            <div style="background-color: rgb(24, 24, 107);" class="cus_image">
                <i style="font-size: 30px;" class="fa-solid fa-book"></i>
            </div>
            <div>
                <span style="font-weight:700; font-size:30px">${countSubject}</span>
                <p class="title">Môn học</p>
            </div>
        </div>
        <div style="background-color: rgb(32, 197, 197);" class="item">
            <div style="background-color: rgb(31, 163, 163);" class="cus_image">
                <i style="font-size: 30px;" class="fa-solid fa-file-lines"></i>
            </div>
            <div>
                <span style="font-weight:700; font-size:30px">${countTheory}</span>
                <p class="title">Bài lý thuyết</p>
            </div>
        </div>
        <div style="background-color: rgb(113, 36, 186);" class="item">
            <div style="background-color: rgb(90, 34, 142);" class="cus_image">
                <i style="font-size: 30px;" class="fa-solid fa-file-code"></i>
            </div>
            <div>
                <span style="font-weight:700; font-size:30px">${countExercise}</span>
                <p class="title">Bài code</p>
            </div>
        </div>
    </div>
</div>
<script src="<c:url value="/resources/js/jsAdmin/main.js"/>"></script>
</body>
</html>
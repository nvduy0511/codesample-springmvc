<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/cssAdmin/login.css'/>">
    <link href="<c:url value='https://fonts.googleapis.com/css?family=Poppins:600&display=swap'/>" rel="stylesheet">
    <script src="<c:url value='https://kit.fontawesome.com/a81368914c.js'/>"></script>
    <title>Login</title>
</head>
<body>
    <img class="wave" src="<c:url value="/resources/images/wave.png"/>">
    <div class="container">
        <div class="img">
            <img src="<c:url value="/resources/images/bg.svg"/>">
        </div>
        <div class="login-content">
            <form action="<c:url value="/Login/admin/adminLogin/"/>" method="post">
                <img src="<c:url value="/resources/images/avatar.svg"/>">
                <h2 class="title">Welcome</h2>
                <div class="input-div one">
                    <div class="i">
                        <i class="fas fa-user"></i>
                    </div>
                    <div class="div">
                        <h5>Username</h5>
                        <input name="userName" type="text" class="input">
                    </div>
                </div>
                <div class="input-div pass">
                    <div class="i">
                        <i class="fas fa-lock"></i>
                    </div>
                    <div class="div">
                        <h5>Password</h5>
                        <input name="passWord" type="password" class="input">
                    </div>
                </div>
                <a href="">Forgot Password?</a>
                <input type="submit" class="btn" value="Login">
            </form>
        </div>
    </div>
<script type="text/javascript" src="<c:url value='/resources/js/jsAdmin/Login.js'/>"></script>
</body>
</html>

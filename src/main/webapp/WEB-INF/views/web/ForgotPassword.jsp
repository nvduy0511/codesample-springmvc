
<%@ include file="/common/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Forgot Password</title>
    <link href="<c:url value="/resources/css/forgotPassword.css"/>" rel="stylesheet" />
</head>
<body>
<div class="container">
    <div class="content">
        <div style="text-align:center ">
            <img style="height: 50px; margin: 20px;" src="<c:url value="/resources/images/logo_transparent.png"/>">
        </div>
        <form class="content-message" action="<c:url value="/account/forgot-password"/>" method="post">
            <h1>Bạn đã yêu cầu đặt lại mật khẩu của mình?</h1>
            <div class="line"></div>
            <p>Chúng tôi sẽ gửi mật khẩu mới qua email của bạn!</p>
            <input name="email" type="email" placeholder="Nhập email của bạn">
            <a href="<c:url value="/account/login-or-register"/>">Đăng nhập</a>
            <button>Đặt lại mật khẩu</button>
        </form>

    </div>

</div>
</body>
</html>

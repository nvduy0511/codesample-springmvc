<%--
  Created by IntelliJ IDEA.
  User: nvduy
  Date: 09/22/2022
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/common/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
    <link href="<c:url value="/resources/css/dangNhap.css"/>" rel="stylesheet"/>
</head>
<body>
<div class="container" id="container">
    <div class="container-content">
        <div class="form-container sign-up-container">
            <form id="form-register" action="<c:url value="/account/register"/>" method="post">
                <h1>Tạo mới tài khoản</h1>
                <div class="form-group">
                    <input name="name" id="name" class="form-control" type="text" placeholder="Name"/>
                    <span class="form-message"></span>
                </div>
                <div class="form-group">
                    <input name="email" id="email" class="form-control" type="email" placeholder="Email"/>
                    <span class="form-message"></span>
                </div>
                <div class="form-group">
                    <input name="pass" id="pass" class="form-control" type="password" placeholder="Password"/>
                    <span class="form-message"></span>
                </div>

                <button>Đăng ký</button>
            </form>
        </div>
        <div class="form-container sign-in-container">
            <form id="form-login" action="<c:url value="/account/login"/>" method="post">
                <h1>Đăng nhập</h1>
                <div class="form-group">
                    <input name="email" id="email-login" class="form-control" type="email" placeholder="Email"/>
                    <span class="form-message"></span>
                </div>
                <div class="form-group">
                    <input name="pass" id="pass-login" class="form-control" type="password" placeholder="Password"/>
                </div>
                <div style="display: flex; width: 100%;">
                    <input type="checkbox" id="remember" name="remember" value="true">
                    <label style="color: #333; font-size: 14px;" for="remember">Nhớ mật khẩu?</label>
                </div>

                <button style="margin-top:10px;" type="submit">Đăng nhập</button>
                <a href="<c:url value="/account/forgot-password"/>">Quên mật khẩu?</a>
                <span id="login-fail" class="form-message"></span>
            </form>
        </div>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Chào mừng trở lại!</h1>
                <p>Vui lòng đăng nhập bằng thông tin cá nhân của bạn</p>
                <button class="ghost" id="signIn">Đăng nhập</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Xin chào!</h1>
                <p>Nhập thông tin cá nhân của bạn và bắt đầu sử dụng website</p>
                <button class="ghost" id="signUp">Đăng ký</button>
            </div>
        </div>
    </div>
</div>
<script src="<c:url value="/resources/js/dangNhap.js"/>"></script>
<script src="<c:url value="/resources/js/validate.js"/>"></script>
<script>
    Validator({
        form: '#form-register',
        errorSelector: '.form-message',
        rules: [
            Validator.isRequired('#name', 'Vui lòng nhập tên đầy đủ của bạn'),
            Validator.isEmail('#email')
        ]
    });
    Validator({
        form: '#form-login',
        errorSelector: '.form-message',
        rules: [
            Validator.isRequired('#pass-login', 'Vui lòng nhập nhập mật khẩu'),
            Validator.isEmail('#email-login')
        ]

    });
</script>

<%--<script>--%>
<%--    var loginFail = document.querySelector("#login-fail");--%>
<%--    loginFail.innerText = "Sai tài khoản hoặc mật khẩu!\nVui lòng đăng nhập lại";--%>
<%--    loginFail.style.color = "red";--%>
<%--</script>--%>

</body>
</html>

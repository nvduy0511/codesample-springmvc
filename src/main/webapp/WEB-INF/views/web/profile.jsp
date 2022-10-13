<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>

<html>
<head>
<%--    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>--%>
    <link rel="stylesheet" href="<c:url value="/resources/css/profile.css" />" />

    <title>Profile</title>

<%--    <script>--%>
<%--        &lt;%&ndash;let value = ${check};&ndash;%&gt;--%>
<%--        // if(value === true){--%>
<%--        &lt;%&ndash;alert("${check}")&ndash;%&gt;--%>
<%--        let urlString = window.location.href;--%>
<%--        let paramString = urlString.split('?')[1];--%>
<%--        let queryString = new URLSearchParams(paramString);--%>
<%--        if(atob(paramString.split("=")[1]) === "1"){--%>
<%--            console.log("Sai mật khẩu")--%>
<%--            alert("Mật khẩu sai vui lòng nhập lại mật khẩu")--%>
<%--        } else if(paramString.split("=")[1] === "2"){--%>
<%--            alert("Mật khẩu mới và nhập lại mật khẩu mới không giống nhau vui lòng nhập lại")--%>
<%--        }--%>

<%--            console.log(paramString)--%>

<%--        // }--%>
<%--        // console.log(value)--%>
<%--    </script>--%>

</head>
<body>
<div class="edit">
<%--    @using (Html.BeginForm("Profile", "User", FormMethod.Post, new { @enctype = "multipart/form-data" }))--%>
<%--    {--%>
    <form method="post" modelAttribute="user" action="${user.id}" enctype="multipart/form-data" >

        <div class="header"  >

        <div class="avatar">

            <div class="avatar-user">
                <img id="avatar-image" src="<c:url value='${user.avatarUrl}' />" alt="Ảnh đại diện">

<%--                <form action="savefile/${user.id}" method="post" enctype="multipart/form-data" >--%>
                    <label class="upload">
                        <input type="file" for="ImageFile" accept="image/*" name="photo" id="uploadImage" />
                        <i class="fa-solid fa-cloud-arrow-up"></i>
                    </label>
<%--                </form>--%>
            </div>

            <div id="header-content-name">
                <h3>${user.userName}</h3>
                <h4>${user.email}</h4>
            </div>

        </div>
    </div>

        <div id="list-info">
<%--        <form method="post" modelAttribute="user" action="${user.id}" >--%>
        <div class="input">
            <label for="userName">Tên tài khoản</label>

            <input path="userName" type="text" name="UserName" id="userName"
                   value="${user.userName}"
            />
        </div>

        <div class="input">
            <label for="fullName">Họ và tên</label>
            <input path="fullName" type="text" name="FullName" id="fullName"
                   value="${user.fullName}"
            />
        </div>

        <div class="input">
            <label>Ngày sinh</label>
            <input path="birthDay" type="date" name="birthDay"
                value="${user.birthDay}"
            />

        </div>

        <div class="input">
            <label for="email">Đia chỉ email</label>
            <input path="email" type="email" name="Email" id="email"
                     value="${user.email}"/>
        </div>

        <div class="button">
            <p id="change-pass">Thay đổi mật khẩu</p>
            <button type="submit">Lưu</button>
        </div>
<%--        </form>--%>
    </div>
    </form>
</div>
<div class="backdrop">
    <div class="modal-change-pass">
        <form method="post" action="changePass/${user.id}" >
            <div class="content-pass">
                <h2>Thay đổi mật khẩu</h2>

                <div class="input-change">
                    <label for="pass">Mật khẩu cũ</label>
                    <input type="password" name="pass" id="pass">
                </div>

                <div class="input-change">
                    <label for="passAcept">Nhập mật khẩu mới</label>
                    <input type="password" name="newPass" id="passAcept">
                </div>

                <div class="input-change">
                    <label for="passNew">Nhập lại mật khẩu mới</label>
                    <input type="password" name="newPassAcp" id="passNew">
                </div>

                <div class="button">
                    <p onclick="closeChangePass()">Hủy</p>
                    <button type="submit">Lưu</button>
                </div>
            </div>
        </form>
    </div>

</div>

<script src="<c:url value="/resources/js/profile.js"/>"></script>



</body>

</html>

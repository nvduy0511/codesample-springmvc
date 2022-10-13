<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <title>Sửa thông tin môn học</title>
</head>
<body id="body">
<div id="bodys">
    <div class="edit">
        <div class="input">
            <form action="<c:url value="/admin/editMH/${Subject.id}"/>" method="post">
                <div class="tab">
                    <div class="tab_content">
                        <p style="text-align: center; font-weight: 700; font-size: 25px;">Sửa môn học</p>
                        <p>Tên môn học: <input class="input_BTCode" style="color: black" name="ten" value="${Subject.name}"/></p>
                        <p>Mô tả: <input class="input_BTCode" style="color: black" name="mota" value="${Subject.description}"/></p>
                        <input id="anh" type="file" name="Anh"><label class="chooseImg" for="anh">Chọn ảnh cho môn học</label>
                        <div class="input_button">
                            <button type="submit" class="button_addCode"><i class="fa-solid fa-plus"></i> Sửa</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>


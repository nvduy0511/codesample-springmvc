<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <title>Xóa môn học</title>
</head>
<body id="body">
<div id="bodys">
    <div class="table">
        <div class="input">
            <form action="<c:url value="/admin/deleteMH/${Subject.id}"/>" method="post">
                <div class="tab">
                    <div style="text-align:left" class="tab_content">
                        <p style="text-align: center; font-weight: 700;">Xóa môn học</p>
                        <p>Id môn học: ${Subject.id}</p>
                        <p>Tên môn học: ${Subject.name}</p>
                        <p>Mô tả: ${Subject.description}</p>
                        <div class="input_button">
                            <button type="submit" class="button_addCode"><i class="fa-solid fa-trash-can"></i> Xóa</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
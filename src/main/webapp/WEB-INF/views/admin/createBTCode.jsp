<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <title>Thêm mới bài tập code</title>
</head>
<body id="body">
<div id="bodys">
    <div class="table">
        <div class="input">
<%--            level, title, content, constraint, inputFormat, outputFormat, sampleInput, sampleOutput, status, tag--%>
            <form id="form-createBTCode" action="<c:url value="/admin/createBTCode/DoneCreate/"/>" method="post">
                <div class="tab">
                    <div class="tab_content">
                        <p style="text-align: center; font-weight: 700;">Bài tập code</p>
                        <p>Tiêu đề: <input class="input_BTCode" name="title"/></p>
                        <p>Đề bài: <input class="input_BTCode" name="content"/></p>
                        <p>Ràng buộc: <input class="input_BTCode" name="constraint"/></p>
                        <p>Độ khó: <input class="input_BTCode" name="level"/></p>
                        <p>Định dạng đầu vào: <input class="input_BTCode" name="inputFormat"/></p>
                        <p>Định dạng đầu ra: <input class="input_BTCode" name="outputFormat"/></p>
                        <p>Mẫu đầu vào: <input class="input_BTCode" name="sampleInput"/></p>
                        <p>Mẫu đầu ra: <input class="input_BTCode" name="sampleOutput"/></p>
                        <p>Trạng thái: <input class="input_BTCode" name="status"/></p>
                        <p>Tag: <input class="input_BTCode" name="tag"/></p>
                        <div class="input_button">
                            <button type="submit" class="button_addCode"><i class="fa-solid fa-plus"></i> Thêm</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <title>Chỉnh sửa thông tin bài tập code</title>
</head>
<body id="body">
<div id="bodys">
    <div class="table">
        <div class="input">
            <form action="<c:url value="/admin/editBTCode/${ex.id}"/>", method="post">
                <div class="tab">
                    <div class="tab_content">
                        <p style="text-align: center; font-weight: 700;">Sửa Bài tập code</p>
                        <p>Tiêu đề: <input class="input_BTCode" name="title" value="${ex.title}"/></p>
                        <p>Đề bài: <input class="input_BTCode" name="content" value="${ex.content}"/></p>
                        <p>Ràng buộc: <input class="input_BTCode" name="constraint" value="${ex.constraint}"/></p>
                        <p>Độ khó: <input class="input_BTCode" name="level" value="${ex.level}"/></p>
                        <p>Định dạng đầu vào: <input class="input_BTCode" name="inputFormat" value="${ex.inputFormat}"/></p>
                        <p>Định dạng đầu ra: <input class="input_BTCode" name="outputFormat" value="${ex.outputFormat}"/></p>
                        <p>Mẫu đầu vào: <input class="input_BTCode" name="sampleInput" value="${ex.sampleInput}"/></p>
                        <p>Mẫu đầu ra: <input class="input_BTCode" name="sampleOutput" value="${ex.sampleOutput}"/></p>
                        <p>Trạng thái: <input class="input_BTCode" name="status" value="${ex.status}"/></p>
                        <p>Tag: <input class="input_BTCode" name="tag" value="${ex.tag}"/></p>
                        <div class="input_button">
                            <button type="submit" class="button_addCode"><i class="fa-solid fa-pencil"></i> Sửa</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

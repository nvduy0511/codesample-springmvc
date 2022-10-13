<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body id="body">
<div id="bodys">
    <div class="edit">
        <form action="<c:url value="/admin/deleteLT/${Theory.id}"/>" method="post">
            <div class="ckedit">
                <div class="ckedit_child">
                    <p style="text-align: center; font-weight: 700; font-size: 25px;">Xóa bài lý thuyết</p>
                    <div class="input_ckedit">
                        <p style="text-align:left">Id bài: ${Theory.id}</p>
                        <p style="text-align:left">Id môn học: ${Theory.subject.id}</p>
                        <p style="text-align:left">Tiêu đề: ${Theory.title}</p>
                    </div>
                    <div class="form-group">
                        <div class="col-md-10">
                            <textarea name="editor1" id="editor1" class="form-control " row="200">${Theory.content}</textarea>
                        </div>
                    </div>
                    <div style="line-height: 60px;" class="input_button">
                        <button type="submit" class="button_addCode"><i class="fa-solid fa-trash-can"></i> Xóa</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>


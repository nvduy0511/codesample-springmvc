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
    <title>Quản lý bài tập code</title>
</head>
<body id="body">
    <div id="bodys">
        <form action="<c:url value="/admin/createBTCode/"/>" method="get">
            <button class="button_addCode"><i class="fa-solid fa-plus"></i> Thêm bài tập code</button>
        </form>
        <div class="table">
            <div class="cus_table">
                <!-- table bài code -->
                <div class="responsive-table">
                    <table id="table" class="custom_table">
                        <thead>
                        <tr>
                            <th>
                                Mã bài tập
                            </th>
                            <th>
                                Tiêu đề
                            </th>
                            <th>
                                Độ khó
                            </th>
                            <th></th>
                            <th></th>
                            <th></th>
                        </tr>
                        </thead>
                        <c:forEach var="item" items="${getAllExercise}">
                            <tbody>
                            <tr>
                                <td>${item.id}</td>
                                <td>
                                    <c:if test="${item.title.length() < 40}">
                                        ${item.title}
                                    </c:if>
                                    <c:if test="${item.title.length() > 40}">
                                        ${item.title.substring(0, 40)}<text>...</text>
                                    </c:if>
                                </td>
                                <td>${item.level}</td>
                                <td class="btn_even"><a style="color: black" href="<c:url value="/admin/editBTCode/${item.id}"/>"><i class="fa-solid fa-pencil"></i> Sửa</a></td>
                                <td class="btn_even"><a style="color: black" href="<c:url value="/admin/deleteBTCode/${item.id}"/>"><i class="fa-solid fa-trash-can"></i> Xóa</a></td>
                                <td class="btn_even"><a style="color: black" href="<c:url value="/admin/createTestCase/${item.id}"/>"><i class="fa-solid fa-plus"></i> Thêm test case</a></td>
                            </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
                <!-- table testcase của bài code -->
                <div class="responsive-table">
                    <table class="custom_table">
                        <thead>
                        <tr>
                            <th>
                                Mã bài tập
                            </th>
                            <th>
                                Mẫu đầu vào
                            </th>
                            <th>
                                Mẫu đầu ra
                            </th>
                            <th></th>
                            <th></th>
                        </tr>
                        </thead>
                        <c:forEach var="item" items="${getAllTestCase}">
                            <tbody>
                            <tr>
                                <td>${item.exercise.id}</td>
                                <td>
                                    <c:if test="${item.input.length() < 20}">
                                        ${item.input}
                                    </c:if>
                                    <c:if test="${item.input.length() > 20}">
                                        ${item.input.substring(0, 20)}<text>...</text>
                                    </c:if>
                                </td>
                                <td>
                                    <c:if test="${item.output.length() < 20}">
                                        ${item.output}
                                    </c:if>
                                    <c:if test="${item.output.length() > 20}">
                                        ${item.output.substring(0, 20)}<text>...</text>
                                    </c:if>
                                </td>
                                <td class="btn_even"><a style="color:black" href="<c:url value="/admin/editTestCase/${item.id}"/>"><i class="fa-solid fa-pencil"></i> Sửa</a></td>
                                <td class="btn_even"><a style="color: black" href="<c:url value="/admin/deleteTestCase/${item.id}"/>"><i class="fa-solid fa-trash-can"></i> Xóa</a></td>
                            </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <script src="<c:url value="/resources/js/jsAdmin/main.js"/>"></script>
</body>
</html>

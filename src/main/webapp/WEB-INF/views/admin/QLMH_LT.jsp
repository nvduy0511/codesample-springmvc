<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <title>Quản lý môn học và lý thuyết</title>
</head>
<body id="body">
<div id="bodys">
    <form action="<c:url value="/admin/createMH/"/>", method="get">
        <button class="button_addCode"><i class="fa-solid fa-plus"></i>Thêm môn học</button>
    </form>
    <div class="table">
        <div class="cus_table">
            <!-- table môn học -->
            <div class="responsive-table">
                <table id="table" class="custom_table">
                    <thead>
                    <tr>
                        <th>
                            Mã môn học
                        </th>
                        <th>
                            Tên môn học
                        </th>
                        <th>
                            Mô tả
                        </th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                    </thead>
                    <c:forEach var="item" items="${getAllSubject}">
                        <tbody>
                        <tr>
                            <td>${item.id}</td>
                            <td>
                                <c:if test="${item.name.length() < 15}">
                                    ${item.name}
                                </c:if>
                                <c:if test="${item.name.length() > 15}">
                                    ${item.name.substring(0, 15)}<text>...</text>
                                </c:if>
                            </td>
                            <td>
                                <c:if test="${item.description.length() < 15}">
                                    ${item.description}
                                </c:if>
                                <c:if test="${item.description.length() > 15}">
                                    ${item.description.substring(0, 15)}<text>...</text>
                                </c:if>
                            </td>
                            <td class="btn_even"><a style="color:black;" href="<c:url value="/admin/editMH/${item.id}"/>"><i class="fa-solid fa-pencil"></i> Sửa</a></td>
                            <td class="btn_even"><a style="color:black;" href="<c:url value="/admin/deleteMH/${item.id}"/>"><i class="fa-solid fa-trash-can"></i> Xóa</a></td>
                            <td class="btn_even"><a style="color:black;" href="<c:url value="/admin/createLT/${item.id}"/>"><i class="fa-solid fa-plus"></i> Thêm bài</a></td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>
            </div>
            <!-- table bài lý thuyết của môn học -->
            <div class="responsive-table">
                <table class="custom_table">
                    <thead>
                    <tr>
                        <th>
                            Mã bài lý thuyết
                        </th>
                        <th>
                            Id môn học
                        </th>
                        <th>
                            Tiêu đề bài lý thuyết
                        </th>
                        <th></th>
                        <th></th>
                    </tr>
                    </thead>
                    <c:forEach var="items" items="${getAllTheory}">
                        <tbody>
                        <tr>
                            <td>${items.id}</td>
                            <td>${items.subject.id}</td>
                            <td>
                                <c:if test="${items.title.length() < 20}">
                                    ${items.title}
                                </c:if>
                                <c:if test="${items.title.length() > 20}">
                                    ${items.title.substring(0, 20)}<text>...</text>
                                </c:if>
                            </td>
                            </td>
                            <td class="btn_even"><a style="color:black;" href="<c:url value="/admin/editLT/${items.id}"/>"><i class="fa-solid fa-pencil"></i> Sửa</a></td>
                            <td class="btn_even"><a style="color:black;" href="<c:url value="/admin/deleteLT/${items.id}"/>"><i class="fa-solid fa-trash-can"></i> Xóa</a></td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>


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
    <style>
        .menu-numpage {
            bottom: 0;
            width: 100%;
            display: flex;
            justify-content: left;
        }
        .menu-numpage > div > ul {
            display: flex;
            justify-content: space-around;
            background-color: white;
            border-radius: 5px;
        }
        .menu-numpage > div > ul > li {
            padding: 5px 10px;
            text-align: center;
            color: black;
            border-radius: 5px;
        }
    </style>
</head>
<body id="body">
<div id="bodys">
    <div class="table">
        <div style="grid-template-columns:auto" class="cus_table">
            <!-- table feedback -->
            <div class="responsive-table">
                <table id="table" class="custom_table">
                    <thead>
                    <tr>
                        <th>Mã</th>
                        <th>Số sao</th>
                        <th>Nội dung feedback</th>
                        <th>Id user feedback</th>
                        <th>Tên user</th>
                    </tr>
                    </thead>
                    <c:forEach var="item" items="${getAllFB}">
                        <tbody>
                        <tr>
                            <td>${item.id}</td>
                            <td>${item.star}</td>
                            <td>
                                <c:if test="${item.messages.length() < 80}">
                                    ${item.messages}
                                </c:if>
                                <c:if test="${item.messages.length() > 80}">
                                    ${item.messages.substring(0, 80)}<text>...</text>
                                </c:if>
                            </td>
                            <td>${item.user.id}</td>
                            <td>${item.user.userName}</td>
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
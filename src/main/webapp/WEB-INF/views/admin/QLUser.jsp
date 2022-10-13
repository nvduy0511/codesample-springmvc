<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
    <title>Quản lý user</title>
</head>
<body id="body">
<div id="bodys">
    <div class="table">
        <div style="grid-template-columns:auto" class="cus_table">
            <!-- table user -->
            <div class="responsive-table">
                <table id="table" class="custom_table">
                    <thead>
                    <tr>
                        <th>Mã user</th>
                        <th>Tài khoản</th>
                        <th>Họ tên</th>
                        <th>Email</th>
                        <th>Ngày sinh</th>
                    </tr>
                    </thead>
                    <c:forEach var="item" items="${getAllUser}">
                        <tbody>
                        <tr>
                            <td>${item.id}</td>
                            <td>${item.userName}</td>
                            <td>${item.fullName}</td>
                            <td>${item.email}</td>
                            <td>${item.birthDay}</td>
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





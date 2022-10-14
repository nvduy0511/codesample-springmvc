<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .Permission {
        display: flex;
        justify-content: center;
        flex-direction: column;
        text-align: center;
        height:100vh;
    }
    .button_addCode {
        outline: none;
        border: none;
        background-color: #33d3b3;
        border-radius: 5px;
        color: white;
        font-weight: bold;
        width: fit-content;
        height: 40px;
        font-size: 15px;
        cursor: pointer;
    }

    .button_addCode:hover {
        background-color: #096c58;
    }
</style>
<div class="Permission">
    <h1><i class="fa-solid fa-user-lock"></i> Bạn chưa đăng nhập quyền Admin</h1>
    <form action="<c:url value="/Login/admin/adminLogin/"/>" method="get">
        <br>
        <button class="button_addCode">Đăng nhập</button>
    </form>
</div>

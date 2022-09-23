<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>

<html>
<head>
    <link rel="stylesheet" href="<c:url value="/resources/css/theory.css" />" />

    <title>Lý thuyết</title>
</head>
<body>

<div id="content">

    <div class="heading">
<%--        <h1>@ViewBag.NameTheory</h1>--%>
        <span>
            Hiểu sâu hơn về cách hoạt động, tìm hiểu về IIFE, closure, reference types, this keyword, bind, call,
            apply, prototype, ...
        </span>
    </div>


    <div class="disciption">
        <h2>Bạn sẽ học dược những gì ?</h2>
        <ul class="list-disciption">
            <li>
                <i class="fa-solid fa-check"></i>
                <span>Được học kiến thức miễn phí với nội dung chất lượng hơn mất phí</span>
            </li>
            <li>
                <i class="fa-solid fa-check"></i>
                <span>Hiểu được cách tư duy nâng cao của các lập trình viên có kinh nghiệm</span>
            </li>

            <li>
                <i class="fa-solid fa-check"></i>
                <span>
                    Có nền tảng Javascript vững chắc để làm việc với mọi thư viện, framework viết bởi
                    Javascript
                </span>
            </li>
            <li>
                <i class="fa-solid fa-check"></i>
                <span>Các kiến thức nâng cao của Javascript giúp code trở nên tối ưu hơn</span>
            </li>
            <li>
                <i class="fa-solid fa-check"></i>
                <span>
                    Hiểu được các khái niệm khó như từ khóa this, phương thức bind, call, apply & xử lý bất đồng
                    bộ
                </span>
            </li>

            <li>
                <i class="fa-solid fa-check"></i>
                <span>Nâng cao cơ hội thành công khi phỏng vấn xin việc nhờ kiến thức chuyên môn vững chắc</span>
            </li>
        </ul>
    </div>


    <div class="list-section">

        <c:forEach var="item" items="${list}" >
            <a href="baihoc/${item.id}" class="item-section">
                <i class="fas fa-book"></i>
                <p>${item.getTitle()}</p>
            </a>

        </c:forEach>
    </div>
</div>
</body>
</html>

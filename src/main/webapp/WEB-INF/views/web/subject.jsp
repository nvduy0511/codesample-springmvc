<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Lý thuyết</title>


<%--    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>--%>
    <link rel="stylesheet" href="<c:url value="/resources/css/subject.css" />" />

</head>
<body>

<div class="content">
    <div class="content-control">

        <div class="content_control-search">
            <input name="searchText" type="text"  class="control-search" placeholder="Tìm kiếm lý thuyết" />
<%--            <a style="background-color: transparent; border: none;" type="submit">--%>
                <i class="fas fa-search"></i>
<%--            </a>--%>
        </div>

        <img class="baner" src="<c:url value='/resources/images/banner.png' />" alt="banner">
    </div>

    <div class="content-list_exercise">
        <h2>Kiến thức cơ sở</h2>
        <div class="list_exercise">
            <c:forEach var="item" items="${list}" >
<%--               ${item}--%>
                <div class="course">
                    <a href="lythuyet/${item.id}">
                        <img src="<c:url value='${item.image_Url}' />" alt="hinh dại diện lý thuyết">
                        <div>
                            <h5 class="title">${item.name}</h5>
                            <p class="discription">
                                ${item.description}
                            </p>

                            <p class="line"></p>
                            <p class="kind">Miễn phí</p>
                        </div>
                    </a>
                </div>

            </c:forEach>


        </div>

    </div>

<%--    <div class="menu-numpage">--%>
<%--        @Html.PagedListPager(Model, page => Url.Action("Index", new { page, ViewBag.searchText, ViewBag.level }))--%>
<%--    </div>--%>

</div>

</body>
</html>

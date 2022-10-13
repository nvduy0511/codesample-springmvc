<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
    <title>List Exercise</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="<c:url value="/resources/css/exercise.css"/>" rel="stylesheet" />
</head>
<body>
<div class="exercise">
    <div class="content-control">
        <form style="display:flex" action="<c:url value="/list-exercise"/>" method="get">
            <div class="content_control-search">
                <input name="searchText" type="text" class="control-search" placeholder="Tìm kiếm bài tập" />
                <button style="background-color: transparent; border: none;" type="submit">
                    <i class="fa-solid fa-magnifying-glass"></i>
                </button>
            </div>
            <select name="level" id="option_trangthai" onchange="this.form.submit()">
                <option value="Độ khó">Độ khó</option>
                <option value="Khó">Khó</option>
                <option value="Dễ">Dễ</option>
                <option value="Trung bình">Trung bình</option>
            </select>
        </form>
        <img class="banner" src="<c:url value="/resources/images/banner.png"/>">
    </div>

    <div class="content-list_exercise">
        <ul class="list_exercise">

            <c:forEach items="${lsExercise}" var="item">

                <li>
                    <a class="item_list" href="<c:url value="/exercise/${item.id}"/>">
                        <h3 class="title">${item.title}</h3>
                        <div class="tag">
                            <span>${item.tag}</span>
                        </div>
                        <div class="image_avatar">
                            <img class="avatar" src="<c:url value="/resources/images/avatar.svg"/>">
                        </div>
                        <div class="username">nvduy</div>
                        <div class="item_footer">
                            <div class="userpass">
                                <i class="fa-solid fa-users"></i>
                                <span>${item.countPeoplePass}/${item.countPeople}</span>
                            </div>
                            <div>
                                <span class="@style">${item.level}</span>
                            </div>
                        </div>
                    </a>
                </li>
            </c:forEach>

        </ul>
<%--        <div class="menu-numpage">--%>
<%--            @Html.PagedListPager(Model, page => Url.Action("Index", new { page, ViewBag.searchText, ViewBag.level}))--%>
<%--        </div>--%>
    </div>
</div>
</body>
</html>

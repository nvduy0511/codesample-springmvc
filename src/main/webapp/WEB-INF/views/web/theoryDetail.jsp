<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>

<html>
<head>
    <link rel="stylesheet" href="<c:url value="/resources/css/theoryDetail.css" />" />

    <title>Title</title>
</head>
<body>
<div id="header">
    <i class="fas fa-book"></i>
    <h1>${item.title} </h1>
</div>

<div id="content">
    ${item.content}
</div>
</body>
</html>

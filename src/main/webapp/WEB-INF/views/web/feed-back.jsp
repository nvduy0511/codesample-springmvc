
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<c:set var="error">Gửi nhận xét thất bại!,Bạn chưa đăng nhập không thể gửi lời nhận xét!,Nhập đầy đủ thông tin!</c:set>
<html>
<head>
    <title>FeedBack</title>
    <link href="<c:url value="/resources/css/feedback.css" />" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
</head>
<body>
    <div class="content-feedback">
        <div class="header-feedback">
            <h1>Cho chúng tôi nhận xét</h1>
            <p>
                Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi.
                Mong bạn để lại đánh giá để chúng tôi khắc phục và phát triển!
            </p>
        </div>
        <div class="container-feedback">

            <div class="post">
                <div class="text">Cảm ơn đã đánh giá</div>
                <div class="edit">Sửa</div>
            </div>
            <form action="<c:url value="/feed-back"/> " method="post">
                <div class="star-widget">
                    <input type="radio" name="rate" value="5" id="rate-5">
                    <label for="rate-5" class="fas fa-star"></label>
                    <input type="radio" name="rate" value="4" id="rate-4">
                    <label for="rate-4" class="fas fa-star"></label>
                    <input type="radio" name="rate" value="3" id="rate-3">
                    <label for="rate-3" class="fas fa-star"></label>
                    <input type="radio" name="rate" value="2" id="rate-2">
                    <label for="rate-2" class="fas fa-star"></label>
                    <input type="radio" name="rate" value="1" id="rate-1">
                    <label for="rate-1" class="fas fa-star"></label>

                    <header></header>
                    <div class="textarea">
                        <textarea cols="30" name="feedback" placeholder="Hãy để lại lời nhận xét.."></textarea>
                    </div>
                    <div class="btn">
                        <button type="submit">Gửi</button>
                    </div>

                </div>
                <c:if test="${message ne null}">
                    <c:choose>
                        <c:when test="${error.contains(message)}">
                            <%-- Làm gì đó ở đây khi điều kiện 1 đúng  --%>
                            <span style="color: red">${message}</span>
                        </c:when>
                        <c:otherwise>
                            <span style="color: white">${message}</span>
                            <%-- Câu lệnh sẽ được thực thi khi tất cả các điều kiện tại <c:when> ở trên sai.  --%>
                        </c:otherwise>
                    </c:choose>
                </c:if>
            </form>
        </div>
    </div>
</body>
</html>

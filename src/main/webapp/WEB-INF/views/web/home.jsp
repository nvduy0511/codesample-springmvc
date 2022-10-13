<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
	<title>HOME</title>
	<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet" />
</head>

<body>
	<c:set scope="request" var="user" value="${sessionScope.user}" />
	<c:if test="${user eq null}">
		<c:redirect url="/account/login-or-register"/>
	</c:if>
	<div class="Content">
		<div class="seccond_content">
			<h1>Lộ trình trở thành lập trình viên</h1>
			<div class="seccond_content_logoList">

				<div class="seccond_content_item">
					<img src="<c:url value="/resources/images/image1.png" />" alt="Học lập trình" />
					<h3>Học lập trình</h3>
					<p class="seccond_content_discription">Học lập trình từ cơ bản đến nâng cao thông qua lớp học</p>
				</div>

				<div class="seccond_content_item">
					<img src="<c:url value="/resources/images/image2.png" />" alt="Luyện lập trình" />
					<h3>Luyện lập trình</h3>
					<p class="seccond_content_discription">Luyện lập trình hằng ngày với nghìn bài tập lớn nhỏ</p>
				</div>

				<div class="seccond_content_item">
					<img src="<c:url value="/resources/images/image3.png" />" alt="Thi lập trình" />
					<h3>Thi lập trình</h3>
					<p class="seccond_content_discription">Tham gia các cuộc thi và cải thiện kỹ năng lập trình</p>
				</div>

				<div class="seccond_content_item">
					<img src="<c:url value="/resources/images/image4.png" />" alt="Tìm hiểu lập trình" />
					<h3>Tìm hiểu lập trình</h3>
					<p class="seccond_content_discription">Tìm hiểu kiến thức lập trình thông qua chia sẻ từ các chuyên gia</p>
				</div>
			</div>
		</div>
		<div class="four_content">
			<div class="code_editor">
				<img src="<c:url value="/resources/images/image11.png" />" alt="">
			</div>
			<div class="four_content_discription">
				<h1>Bắt đầu viết code chỉ trong vài giây</h1>
				<p>
					Môi trường học tập thực hành của chúng tôi có nghĩa là bạn sẽ viết mã thực từ bài học đầu tiên của mình
				</p>
			</div>
		</div>


		<div class="three_content">
			<h1>CodeSample ưu điểm vượt trội</h1>
			<div class="three_content_main">
				<img src="<c:url value="/resources/images/image5.png" />" alt="giao dien lam bài" />
				<ul class="three_content_list_info">
					<li>
						<img src="<c:url value="/resources/images/image6.png" />" alt="Hệ thống" />
						<p>Hệ thống mạnh mẽ hiện đại</p>
					</li>

					<li>
						<img src="<c:url value="/resources/images/image7.png" />" alt="Nội dung" />
						<p>Nội dung dễ hiểu chi tiết</p>
					</li>

					<li>
						<img src="<c:url value="/resources/images/image8.png" />" alt="Hấp dẫn" />
						<p>Hấp dẫn thu hút</p>
					</li>

					<li>
						<img src="<c:url value="/resources/images/image9.png" />" alt="Cộng đồng" />
						<p>Cộng đồng đông đảo</p>
					</li>

					<li>
						<img src="<c:url value="/resources/images/image10.png" />" alt="Đội ngũ" />
						<p>Đội ngũ nhiệt tình</p>
					</li>
				</ul>
			</div>
		</div>
	</div>

</body>

</html>
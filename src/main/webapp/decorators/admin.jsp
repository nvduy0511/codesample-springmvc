<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title><dec:title default="Trang chủ" /></title>
	


    <%-- <script src="<c:url value='/template/paging/jquery.twbsPagination.js' />"></script> --%>

    <%-- <script src="<c:url value='/ckeditor/ckeditor.js' />"></script> --%>
	<dec:head />
</head>
<body class="no-skin">
	<!-- header -->
    <%@ include file="/common/admin/header.jsp" %>
    <!-- header -->

	<div class="main-container" id="main-container">
		<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
		</script>
		<!-- header -->
    	<%@ include file="/common/admin/menu.jsp" %>
    	<!-- header -->

		<dec:body/>

		<!-- footer -->
    	<%@ include file="/common/admin/footer.jsp" %>
    	<!-- footer -->

    	<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse display">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	

</body>
</html>
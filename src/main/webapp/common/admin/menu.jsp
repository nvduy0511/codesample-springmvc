<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<div class="l-navbar" id="navbar">
    <div class="nav">
        <div>
            <a href="/admin/Control/QuanLyMonHoc" class="nav_logo">
                <img class="nav_logo-icon" src="~/images/logo_CodeSample.png">
                <span class="nav_logo-text">CODE SAMPLE</span>
            </a>
            <div class="nav_toggle" id="nav_toggle">
                <i style="font-size: 15px;" class="fa-solid fa-chevron-right"></i>
            </div>

            <ul class="nav_list">
                <a href="/admin/Control/QuanLyMonHoc" class="nav_link ">
                    <i class="fa-solid fa-list-check nav_icon"></i>
                    <span class="nav_text">Thống kê</span>
                </a>
                <a href="/admin/Control/QuanLyBTCode" class="nav_link ">
                    <i class="fa-solid fa-laptop-code nav_icon"></i>
                    <span class="nav_text">Bài code</span>
                </a>
                <a href="/admin/Control/QuanLyMH_LT" class="nav_link ">
                    <i class="fa-solid fa-file-pen nav_icon"></i>
                    <span class="nav_text">Môn học và lý thuyết</span>
                </a>
                <a href="/admin/Control/QuanLyUser" class="nav_link ">
                    <i class="fa-solid fa-user nav_icon"></i>
                    <span class="nav_text">Người dùng</span>
                </a>
                @foreach (var item in role)
                {

                @if (item.IdRoles.Equals("super_admin"))
                {
                <a href="/admin/Control/QuanLyAdmin" class="nav_link ">
                    <i class="fa-solid fa-user-lock nav_icon"></i>
                    <span class="nav_text">Quản lý phân quyền</span>
                </a>
                }

                }
                <a href="/admin/Control/QuanLyFeedback" class="nav_link ">
                    <i class="fa-solid fa-comments nav_icon"></i>
                    <span class="nav_text">Feedback</span>
                </a>
            </ul>
        </div>
        <a href="/Admin/Logout" class="nav_link ">
            <i class="fa-solid fa-right-from-bracket nav_icon"></i>
            <span class="nav_text">Đăng xuất</span>
        </a>
    </div>
</div>
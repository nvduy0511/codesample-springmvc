<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="<c:url value="https://kit.fontawesome.com/6e4d081463.js"/>" crossorigin="anonymous"></script>
  <title>Sửa test case</title>
</head>
<body id="body">
<div id="bodys">
  <div class="table">
    <div class="input">
      <form action="<c:url value="/admin/editTestCase/${testcase.id}"/>", method="post">
        <div class="tab">
          <div class="tab_content">
            <p style="text-align: center; font-weight: 700;">Sửa Test case</p>
            <p>Input: <input class="input_BTCode" name="input" value="${testcase.input}"/></p>
            <p>Output: <input class="input_BTCode" name="output" value="${testcase.output}"/></p>
            <p>Mã test case: ${testcase.id}</p>
            <p>Mã bài tập: ${testcase.exercise.id}</p>
            <div class="input_button">
              <button type="submit" class="button_addCode"><i class="fa-solid fa-plus"></i> Sửa</button>
            </div>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
</body>
</html>

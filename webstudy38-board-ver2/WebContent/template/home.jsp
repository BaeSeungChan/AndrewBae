<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>board</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/board.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<!-- container-fluid: 화면 너비와 상관없이 항상 100% -->
<div class="container-fluid">
  <div class="row header">
    <div class="col-sm-2" ></div>
    <div class="col-sm-8" align="right">
   	<c:import url="/template/header.jsp"></c:import>
    </div>
    <div class="col-sm-2" ></div>
  </div>
  <div class="row main">
    <div class="col-sm-2" ></div>
    <div class="col-sm-8">
	<c:import url="${url}"></c:import>
    </div>
    <div class="col-sm-2" ></div>
  </div>
</div>
</body>
</html>
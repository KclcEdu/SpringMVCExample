<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Sample</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="res/bootstrap.min.css">
<script src="res/jquery.min.js"></script>
<script src="res/bootstrap.min.js"></script>
</head>
<body>
 <div class="container-fluid">
  <div class="row">
   <div class="col-lg-4"></div>
   <div class="col-lg-4">
    <div class="panel panel-danger">
     <div class="panel-header">Oops!</div>
     <c:if test="${msg != null && !msg.isEmpty()}">
      <div class="panel-body">${msg}</div>
     </c:if>
    </div>
   </div>
   <div class="col-lg-4"></div>
  </div>
 </div>
</body>
</html>
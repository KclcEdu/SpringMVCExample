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
   <div class="col-md-6 col-md-offset-3 text-center">
    <form id="info-form" class="form-inline" method="POST"
     action="addInfo">
     <div class="form-group">
      <label for="name">Name</label> <input type="text"
       class="form-control" name="name" value="${ model.name }"
       id="name" />
     </div>
     <div class="form-group">
      <label for="value">Value</label> <input type="text"
       class="form-control" name="value" value="${ model.value }"
       id="value" />
     </div>
     <button id="add" type="submit" class="btn btn-primary">Add</button>
    </form>
   </div>
  </div>
  <div class="row">
   <div class="col-lg-12">
    <table class="table table-striped">
     <thead>
      <tr>
       <th>ID</th>
       <th>Name</th>
       <th>Value</th>
      </tr>
     </thead>
     <tbody>
      <c:forEach var="info" items="${listInfo}" varStatus="status">
       <tr>
        <td>${ info.id }</td>
        <td>${ info.name }</td>
        <td>${ info.value }</td>
       </tr>
      </c:forEach>
     </tbody>
    </table>
   </div>
  </div>
 </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tail Flap!</title>
<link rel="stylesheet" href="css/main.css">
</head>
<body>
<h1>Player Information</h1>
<c:choose>
<c:when test="${empty Skater s }"></c:when>
</c:choose>
<c:forEach var="skater" items="${skater}"></c:forEach>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Number</th>
<th>Position</th>
<th>Home town</th>
</tr>
<tr>
<td>${s.firstName}</td>
<td>${s.lastName}</td>
<td>${s.number}</td>
<td>${s.position}</td>
<td>${s.hometown}</td>
</tr>
</table>
</body>
</html>
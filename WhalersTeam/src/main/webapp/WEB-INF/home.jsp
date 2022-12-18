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
<h1>Wheat Ridge Whalers Hockey Team</h1>
<form action="getPlayerByLastName.do" method="GET">
 Search by Last Name: <input type="text" name="lastName" />
  <input type="submit" value="Show Player" />
</form>

<table>
  <tr>
    <th>Player ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Edit</th>
    <th>Remove Player</th>   
  </tr>
<c:forEach var="skater" items="${skater}">
  <tr>
    <td>${skater.id}</td>
    <td>${skater.firstName}</td>
    <td>${skater.lastName}</td>
    <td><a href="updatePlayer.do?fid=${skater.id}">Edit</a></td>
    <td><a href="deletePlayer.do?fid=${skater.id}">Remove</a></td>
  </tr>
</c:forEach>
</table>
</body>
</html>
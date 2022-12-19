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
<form action="searchSkater.do" method="GET">
  <label for= "searchBy">Search by:</label>
    <select name="searchBy"> 
    <option value="firstName">First Name</option> 
    <option value="lastName">Last Name</option> 
    <option value="position">Position</option> 
    <option value="number">Number</option> 
    <option value="hometown">HomeTown</option> 
    </select> <input type="text" name="searchInput" />
  <input type="submit" value="Search" />
</form>
<a href="home.do">View Roster</a>
<table>
  <tr>
    <th>Player ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Number</th>
    <th>Position</th>
    <th>Hometown</th>
    <th>Edit</th>
    <th>Remove Player</th>   
  </tr>
<c:forEach var="skater" items="${skater}">
  <tr>
    <td>${skater.id}</td>
    <td>${skater.firstName}</td>
    <td>${skater.lastName}</td>
    <td>${skater.number}</td>
    <td>${skater.position}</td>
    <td>${skater.hometown}</td>
    <td><a href="updatePlayer.do?fid=${skater.id}">Edit</a></td>
    <td><a href="deleteSkater.do?fid=${skater.id}">Remove</a></td>
  </tr>
</c:forEach>
</table>
<a href="createSkater.do">Add Skater</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Player Information</h1>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Number</th>
<th>Position</th>
<th>Home town</th>
</tr>
<tr>
<td>${skater.firstName}</td>
<td>${skater.lastName}</td>
<td>${skater.number}</td>
<td>${skater.position}</td>
<td>${skater.hometown}</td>
</tr>
</table>
<br>
<form action ="updateSkater.do?id=${skater.id }"  method = "POST">
	<label for= "firstName">First Name:</label>
     <input type="text" name="firstName" required="required" value="${skater.firstName} " />
     <br>
	<label for= "lastName">Last Name:</label>
    <input type="text" name="lastName" required="required" value="${skater.lastName}" />
  <br>
   <label for= "number">Number:</label>
    <input type="number" name="number" required="required" value="${skater.number }" /> 
    <br>
<label for= position>Position:</label>
    <select name="position"> 
    <option value="Center">Center</option> 
    <option value="Left Wing">Left Wing</option> 
    <option value="Right Wing">Right Wing</option> 
    <option value="Defense">Defense</option> 
    <option value="Goaltender">Goaltender</option> 
    </select>
    <br>
	<label for= "hometown">Hometown:</label>
    <input type="text" name="hometown" required="required" value="${skater.hometown}" />
    <br>
    <input action="skater.jsp" type= "submit" value= "Update Player">
    <br>
 </form>
</body>
</html>
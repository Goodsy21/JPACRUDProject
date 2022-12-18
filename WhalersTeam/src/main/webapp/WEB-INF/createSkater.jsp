<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Input New Player Information</h1>

<br>
<form action ="createSkater.do"  method = "POST">
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
    <input type= "submit" value= "Create Player">
    <br>
 </form>
</body>
</html>
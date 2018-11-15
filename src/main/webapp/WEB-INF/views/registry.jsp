<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css">
<link rel="stylesheet" href="main.css">
</head>
<body>

	<h1>Registration Form</h1>
		<a href="/">Home</a><br><br>
	
	<div class="container">
		<form class="formstyle" action="adduser">
			First Name: <input type="text" name="fname"><br><br>
			Last Name: <input type="text" name="lname"><br><br>
			Email: <input type="text" name="email"><br><br>
			Phone Number: <input type="text" name="phone"><br><br>
			Password: <input type="text" name="password">
			<input type="submit" value="Add">
		</form>
</div>
	
		
	
	
</body>
</html>
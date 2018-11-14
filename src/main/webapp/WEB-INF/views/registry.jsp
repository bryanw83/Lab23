<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css">
<link rel="stylesheet" href="main.css">
</head>
<body>

	<h1>Registration Form
	
		<a href="/">Home</a>
	
	</h1>

	<div class="container">
	<form action="/addPerson" method="post">
		First Name: <input type="text" name="firstname"><br>
		Last Name: <input type="text" name="lastname"><br>
		Email: <input type="text" name="email"><br>
		Phone Number: <input type="text" name="email"><br>
		Password: <input type="text" name="email"><br>
		<input class="btn btn-primary" type="submit" value="Add">
	</form>
</div>
	
		
	
	
	<script src="script.js"></script>
</body>
</html>
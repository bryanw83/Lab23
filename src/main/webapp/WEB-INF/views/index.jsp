<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffee Shop</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css">
<link rel="stylesheet" href="main.css">
</head>
<body>
	${firstPage}
	
	<h1>Welcome to Tweek Coffee!
		<a href="registry">Registration Page</a>
	</h1><br>
	<p>Please feel free to browse through our fine selection of locally made coffee. Local coffee, from local growers.</p><br>
	<div class="container">

		<form action="/coffee">
		<input type="text" value="${name}" name="name" placeholder="Name">
		<input class="btn btn-primary" type="submit" value="Search">
		
		<c:if test="${ not empty name }">
			<a href="/food" class="btn btn-secondary">Clear</a>
		</c:if>
		
		</form>


		<table class="table">
			<thead>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${coffee}" var="f">
					<tr>
						<td>${f.name}</td>
						<td>${f.description}</td>
						<td>${f.quantity}</td>
						<td>${f.price}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
		
	</div>
	
	

	<footer>
	<img src="https://cdn1.iconfinder.com/data/icons/social-media-outline-6/128/SocialMedia_Facebook-Outline-512.png" width=30px>
	<img src="https://cdn1.iconfinder.com/data/icons/social-media-outline-6/128/SocialMedia_Twitter-Outline-512.png" width=30px>
	<img src="https://cdn1.iconfinder.com/data/icons/social-media-outline-6/128/SocialMedia_LinkedIn-Outline-512.png" width=30px>
	</footer>
	
</body>
</html>
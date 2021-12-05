<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="styleformat.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>booking</title>
</head>
<body>
	<h1>Bus Booking Page</h1>
	<hr>
	<br>
	<br>
	<table border="1">
		<tr>
			<th>BUS NAME</th>
			<th>BUS NUMBER</th>
			<th>BUS TYPE</th>
			<th>DRIVER NAME</th>
			<th>BUS TIMING</th>
			<th>ACTION</th>
			<th>BOOK</th>
		</tr>
		<c:forEach var="b" items="${busList}">

			<tr>
				<td>${b.busName}</td>
				<td>${b.busNumber}</td>
				<td>${b.busType}</td>
				<td>${b.driverName}</td>
				<td>${b.busTiming}</td>
				<td><a href="/deleteBus?busNumber=${b.busNumber}"><button>Delete</button></a></td>
				<td><a href="/passengerdetails"><button>Book</button></a></td>
				
			</tr>

		</c:forEach>




	</table>
	<br>
	<br>
	<a href="/showAddBus"><button>ADD Bus</button></a>
	<a href="/home"><button>Home</button></a>
	<a href="/welcome"><button>Welcome</button></a>
</body>
</html>
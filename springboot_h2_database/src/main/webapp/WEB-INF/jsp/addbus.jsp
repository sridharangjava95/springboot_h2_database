<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<link rel="stylesheet" href="styleformat.css">
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>addbus</title>

</head>
<body>
	<h1>Add New Bus Details</h1>
	<br>
	<hr>
	<br>
	<br>
	<form:form modelAttribute="form">
		<form:errors path="" element="div" />
		<div>
			<form:label path="busName">Bus Name</form:label>
			<form:input path="busName" />
			<br> <br>

			<form:label path="busNumber">Bus Number</form:label>
			<form:input path="busNumber" />
			<br> <br>

			<form:label path="busType">Bus Type</form:label>
			<form:input path="busType" />
			<br> <br>

			<form:label path="driverName">Driver Name</form:label>
			<form:input path="driverName" />
			<br> <br>
			<form:label path="busTiming">Bus Timing</form:label>
			<form:input path="busTiming" />
			<br> <br>
		</div>
		<div>
			<input type="submit" value="Add New Bus" />
		</div>
	</form:form>
	<br>
	<a href="/home"><button>Go to Home</button></a>


</body>
</html>
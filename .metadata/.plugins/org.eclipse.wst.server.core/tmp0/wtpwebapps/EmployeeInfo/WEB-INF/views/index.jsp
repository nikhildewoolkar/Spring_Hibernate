<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Info</title>
</head>
<body>
	<div align="center">
		<h1>Employee Info</h1>
		<h3><a href="new">Add New Employee</a></h3>
		<table border="1"cellpadding="5">
			<tr>
				<th>Name</th>
				<th>salary</th>
				<th>age</th>
			</tr>
			<c:forEach var="employee" items="${listEmployee}" varStatus="status">
				<tr>
					<td>${employee.name}</td>
					<td>${employee.salary }</td>
					<td>${employee.age }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
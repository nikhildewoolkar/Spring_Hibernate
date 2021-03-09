<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Lawyer Info</title>
</head>
<body>
	<div align="center">
		<h1>Lawyer Info</h1>
		<h3><a href="new">Add New Lawyer</a></h3>
		<table border="1"cellpadding="5">
			<tr>
				<th>Name</th>
				<th>CasesWon</th>
				<th>CasesLost</th>
			</tr>
			<c:forEach var="lawyer" items="${listLawyer}" varStatus="status">
				<tr>
					<td>${lawyer.name}</td>
					<td>${lawyer.casesWon }</td>
					<td>${lawyer.casesLost }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
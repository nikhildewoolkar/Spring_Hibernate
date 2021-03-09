<%@page import="in.cdac.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link rel="icon" type="image/png" href="/DigiDiary/WebContent/images/diary.png" sizes="16x16">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>

</head>
<%
	request.getRequestDispatcher("/home-servlet").forward(request, response);
%>
<%
	List<Employee> employeeList = new ArrayList<>();
if (session.getAttribute("EMPLOYEE_LIST") != null) {
	employeeList = (List<Employee>) session.getAttribute("EMPLOYEE_LIST");
}
%>
<body>
	<div class="container-fluid">
		<div class="row">
			<h1
				class="col-12 display-1 bg-dark text-light d-flex justify-content-center align-items-center">Employee
				Info</h1>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div
				class="col-12 bg-dark text-light d-flex justify-content-center align-items-center"
				style="height: 60vh">
				<form action="register-servlet" method="post">
					<div class="form-group">
						<label>Name</label> <input type="text" name="name"
							class="form-control" aria-describedby="emailHelp">
					</div>
					<div class="form-group">
						<label>salary</label> <input type="number" name="salary"
							class="form-control">
					</div>
					<div class="form-group">
						<label>age</label> <input type="number" name="age"
							class="form-control" aria-describedby="emailHelp">
					</div>
					<button type="submit" class="btn btn-primary">Add Employee</button>
				</form>
			</div>
		</div>

		<div class="row">
			<div class="col-3"></div>
			<div class="col-6 d-flex bg-dark text-light justify-content-center align-items-center">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">salary</th>
						<th scope="col">age</th>
					</tr>
				</thead>
				<tbody>
					<%
						for (Employee l : employeeList) {
					%>
					<tr>
						<th scope="row"><%=l.getId()%></th>
						<td><%=l.getName()%></td>
						<td><%=l.getsalary()%></td>
						<td><%=l.getage()%></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
			</div>
		</div>
	</div>
</body>
</html>
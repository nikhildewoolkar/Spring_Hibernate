<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="in.cdac.Employee"%>
<%@page import="in.cdac.PostService"%>
<%@page import="java.util.*"%>


<%
	List<Employee> employeeList = PostService.readPostHBM();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
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


<body>
	<div class="container-fluid">
		<div class="row">
			<h1
				class="col-12 display-1 d-flex justify-content-center align-items-center">Employee
				Info</h1>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div
				class="col-6 d-flex border border-dark justify-content-center align-items-center"
				style="height: 50vh">
				<form action="register-servlet" method="post">
					<div class="form-group">
						<label>Name</label> <input type="text" name="name"
							class="form-control" aria-describedby="emailHelp">
					</div>
					<div class="form-group">
						<label>Salary</label> <input type="number" name="salary"
							class="form-control">
					</div>
					<div class="form-group">
						<label>Age</label> <input type="number" name="age"
							class="form-control" aria-describedby="emailHelp">
					</div>
					<button type="submit" class="btn btn-primary">Add Employee</button>
				</form>
			</div>
			<div
				class="col-6 d-flex justify-content-center align-items-center">
				<table class="table">
					<thead class="thead-dark">
						<tr>
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
							<th scope="row"><%=l.getName()%></th>
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
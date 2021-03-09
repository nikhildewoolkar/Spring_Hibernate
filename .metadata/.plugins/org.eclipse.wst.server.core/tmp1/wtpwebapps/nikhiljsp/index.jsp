<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<ul>
                  <li><a href="index.jsp">Home</a></li>
                  <li><a href="edit.jsp">Edit Profile</a></li>
					<li><a href="search.jsp">Search profile</a></li>
					<li><a href="profile.jsp">View Profile</a></li>
					<li><a href="register.jsp">Register</a></li>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="logout">Logout</a></li>
                    </ul>
 <%                    
                    String name=(String)session.getAttribute("s1"); 
                    out.print("Hello User: You have entered the name: "+name);
%>
</body>
</html>
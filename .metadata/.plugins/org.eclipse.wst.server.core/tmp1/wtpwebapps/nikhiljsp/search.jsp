<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<ul>
                  <li><a href="index.jsp">Home</a></li>
                  <li><a href="edit.jsp">Edit Profile</a></li>
					<li><a href="search.jsp">Search profile</a></li>
					<li><a href="profile.jsp">View Profile</a></li>
					<li><a href="register.jsp">Register</a></li>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="logout">Logout</a></li>
                    </ul>
                    <br>
                    <br>
                                      <form action="Search" method="post" style="border:1px solid #ccc">
  <div class="container">
    <label for="uid"><b>Profile</b></label>
    <input type="number" placeholder="Enter uid no." id="uid" name="uid" required  min="2019450001" max="2019450060" >
    <div class="clearfix">
      <button type="submit" class="signupbtn">Search profile</button>
    </div>
  </div>
</form>
</body>
</html>
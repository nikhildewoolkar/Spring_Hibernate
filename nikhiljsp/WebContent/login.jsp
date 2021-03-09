<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>MCA Profiler</title>
<link rel="stylesheet" href="styles.css">
<style>
.avatar {
  vertical-align: middle;
  width: 100px;
  height: 100px;
  border-radius: 50%;
}
hr.new2 {
  border-top: 1px dashed black;
}
hr {
  border: 5px solid rgb(5, 5, 5);
  border-radius: 5px;
}
</style>
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
	<form action="login_back.jsp" method="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
<br/>
    <label for="uid"><b>UID NO.</b></label>
    <input type="number" placeholder="Enter uid no." name="username" id="username" required >
<br/>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" id="pwd" name="pwd" required>
<br/>
    <div class="clearfix">
      <button type="reset" class="cancelbtn">Reset</button>
      <button type="submit" class="signupbtn">Login</button>
	  <span class="psw"><a href="#">Forgot password?</a></span>
    </div>
  </div>
</form>
</body>
</html>
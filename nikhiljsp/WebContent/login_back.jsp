<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import ="java.io.IOException"%>
<%@ page import ="java.io.PrintWriter"%>
<%@ page import ="javax.servlet.RequestDispatcher"%>
<%@ page import ="javax.servlet.ServletException"%>
<%@ page import ="javax.servlet.annotation.WebServlet"%>
<%@ page import ="javax.servlet.http.HttpServlet"%>
<%@ page import ="javax.servlet.http.HttpServletRequest"%>
<%@ page import= "javax.servlet.http.HttpServletResponse"%>
<%@ page import ="java.sql.*"%>;
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/mydb";%>
<%!String user = "root";%>
<%!String psw = "123456";%>
<%!boolean  st = false ;%>
<%
response.setContentType("text/html;charset=UTF-8");
String s1=request.getParameter("username");
String s2=request.getParameter("pwd");
System.out.println(s1+""+s2);

try {
    Class.forName(driverName);
    Connection con = DriverManager.getConnection(url,user,psw);
    PreparedStatement ps = con.prepareStatement("select * from student where uid=? and password=?");
    ps.setString(1, s1);
    ps.setString(2, s2);
    ResultSet rs =ps.executeQuery();
    st = rs.next();
}
catch(Exception e) {
    e.printStackTrace();
}
if(st==true)
{ 
    session.setAttribute("s1",s1);
    out.print(s1+"welcome user");
    RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
    rs.forward(request, response);
}
else
{
   out.println("Username or Password incorrect");
   RequestDispatcher rs = request.getRequestDispatcher("login.html");
   rs.include(request, response);
}
%>
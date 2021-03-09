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
<%
String s1=request.getParameter("fname");
String s2=request.getParameter("lname");
String s3=request.getParameter("uid");
String s4=request.getParameter("email");
String s5=request.getParameter("pass");
String s6=request.getParameter("pass1");
String s7="none";
String s8="none";
String s9="none";
String s10="none";
String s11="none";
String s12="none";
String s13="none";
String s14="none";
String s15="none";
String s16="none";
String s17="no";
System.out.println(s1);
try {
	if (s5.equals(s6))
    {
        try
        {
            Class.forName(driverName);
    Connection con = DriverManager.getConnection(url,user,psw);
            PreparedStatement ps = con.prepareStatement("insert into STUDENT values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, s1);
            ps.setString(2, s2);
            ps.setString(3, s3);
            ps.setString(4, s4);
            ps.setString(5, s5);
            ps.setString(6, s7);
            ps.setString(7, s8);
            ps.setString(8, s9);
            ps.setString(9, s10);
            ps.setString(10, s11);
            ps.setString(11, s12);
            ps.setString(12, s13);
            ps.setString(13, s14);
            ps.setString(14, s15);
            ps.setString(15, s16);
            ps.setString(16, s17);
            System.out.println("nick");
            int x = ps.executeUpdate(); 
            if (x > 0)
            {
            	System.out.println("Data Saved Successfully");
            	RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            	rs.forward(request, response);
            }
        }
        catch (Exception ex)
        {
            out.println(ex);
        }
    }
    else
    {
    	out.println("Data not Saved");
    }
}
finally
{
out.close();
}
%>
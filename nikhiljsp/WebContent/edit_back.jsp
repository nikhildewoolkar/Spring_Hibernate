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
<%!int x = 0 ;%>
<%
response.setContentType("text/html;charset=UTF-8");
String v1=request.getParameter("username");
String v2=request.getParameter("year");
String v3=request.getParameter("batch");
String v4=request.getParameter("pemail");
String v5=request.getParameter("phoneno");
String v6=request.getParameter("address");
String v7=request.getParameter("des");
String v8=request.getParameter("skill");
String v9=request.getParameter("github");
String v10=request.getParameter("hackerrank");
String v11=request.getParameter("codechef");
String v12=request.getParameter("privacy");
//String v1="2019450013";
//String v2="none1";
//String v3="none1";
//String v4="none1";
//String v5="none1";
//String v6="none1";
//String v7="none1";
//String v8="none1";
//String v9="none1";
//String v10="none1";
//String v11="none1";
//String v12="no";
        try
        {
        	 Class.forName(driverName);
        	    Connection con = DriverManager.getConnection(url,user,psw);
    String sql="update student set year=?,batch=?,nemail=?,phone=?,add=?,desc=?,skill=?,git=?,hr=?,cc=?,privacy=? where uid=?";
//    String sql="update STUDENT set uid="+v1+",year="+v2+",batch="+v3+",nemail="+v4+",phone="+v5+",add="+v6+",desc="+v7+",skill="+v8+",git="+v9+",hr="+v10+",cc="+v11+",privacy="+v12+" where uid="+v1;        
    PreparedStatement ps = con.prepareStatement(sql);
    System.out.println("Data Saved.");
    		ps.setString(1, v2);        
    		ps.setString(2, v3);
            ps.setString(3, v4);
            ps.setString(4, v5);
            ps.setString(5, v6);
            ps.setString(6, v7);
            ps.setString(7, v8);
            ps.setString(8, v9);
            ps.setString(9, v10);
            ps.setString(10, v11);
            ps.setString(11, v12);
            ps.setString(12, v1);
            System.out.println("nick123");
             x = ps.executeUpdate(); 
            out.println(sql);
            if (x > 0)
            {
            	System.out.println("Data Saved/updated Successfully");
            	RequestDispatcher rs = request.getRequestDispatcher("profile.jsp");
            	rs.forward(request, response);
            }
            else
            {
            	System.out.println("Data not Saved.");
            }
        }
        catch (Exception ex)
        {
            out.println(ex);
        }
finally
{
out.close();
}
%>
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Register() {
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
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
        System.out.println(s5+"c"+s6);
        try {
        	if (s5.equals(s6))
            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "123456");
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
                    	RequestDispatcher rs = request.getRequestDispatcher("login.html");
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
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.annotation.WebServlet;
//@WebServlet("/Register")
//public class Register extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//    public Register() {
//    }
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}
//
//
//import java.io.IOException;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class Register
// */
//@WebServlet(asyncSupported = true, urlPatterns = { "/Register" })
//public class Register extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Register() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see Servlet#init(ServletConfig)
//	 */
//	public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//	}
//
//	/**
//	 * @see Servlet#getServletConfig()
//	 */
//	public ServletConfig getServletConfig() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	/**
//	 * @see Servlet#getServletInfo()
//	 */
//	public String getServletInfo() {
//		// TODO Auto-generated method stub
//		return null; 
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}

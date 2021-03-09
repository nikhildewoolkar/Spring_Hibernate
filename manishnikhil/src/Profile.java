import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Profile() {
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	 
    	PrintWriter out = response.getWriter();
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
//        String v1="2019450013";
//        String v2="none1";
//        String v3="none1";
//        String v4="none1";
//        String v5="none1";
//        String v6="none1";
//        String v7="none1";
//        String v8="none1";
//        String v9="none1";
//        String v10="none1";
//        String v11="none1";
//        String v12="no";
        try {
        	if (v1!=null)
            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "123456");
            String sql="update student set uid=?,year=?,batch=?,nemail=?,phone=?,add=?,desc=?,skill=?,git=?,hr=?,cc=?,privacy=? where uid=?";
//            String sql="update STUDENT set uid="+v1+",year="+v2+",batch="+v3+",nemail="+v4+",phone="+v5+",add="+v6+",desc="+v7+",skill="+v8+",git="+v9+",hr="+v10+",cc="+v11+",privacy="+v12+" where uid="+v1;        
            PreparedStatement ps = con.prepareStatement(sql);
            		ps.setString(1, v1);        
            		ps.setString(2, v2);
                    ps.setString(3, v3);
                    ps.setString(4, v4);
                    ps.setString(5, v5);
                    ps.setString(6, v6);
                    ps.setString(7, v7);
                    ps.setString(8, v8);
                    ps.setString(9, v9);
                    ps.setString(10, v10);
                    ps.setString(11, v11);
                    ps.setString(12, v12);
                    ps.setString(13, v1);
                    System.out.println("nick123");
                    int x = ps.executeUpdate(); 
                    out.println(sql);
                    if (x > 0)
                    {
                    	System.out.println("Data Saved/updated Successfully");
                    	RequestDispatcher rs = request.getRequestDispatcher("profile.html");
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
             	System.out.println("Data not Saved.");
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
// * Servlet implementation class Profile
// */
//@WebServlet(asyncSupported = true, urlPatterns = { "/Profile" })
//public class Profile extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Profile() {
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
//	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
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

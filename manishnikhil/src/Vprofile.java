import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Vprofile")
public class Vprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Vprofile() {
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
    	HttpSession session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("s1"); 
        try {
            Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "123456");
    String sql="select * from STUDENT where uid="+name;
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result = ps.executeQuery(sql);
            System.out.println("nick");
            while (result.next()) {
                String g1 = result.getString("fname");
                String g2 = result.getString("lname");
                String g3 = result.getString("uid");
                String g4 = result.getString("email");
                String g5 = result.getString("password");
                String g6 = result.getString("year");
                String g7 = result.getString("batch");
                String g8 = result.getString("nemail");
                String g9 = result.getString("phone");
                String g10 = result.getString("add");
                String g11 = result.getString("desc");
                String g12 = result.getString("skill");
                String g13 = result.getString("git");
                String g14 = result.getString("hr");
                String g15 = result.getString("cc");
                String g16 = result.getString("privacy");
                System.out.println(g1);
                System.out.println("Data read Successfully");
//            	RequestDispatcher rs = request.getRequestDispatcher("profile.html");
//            	rs.forward(request, response);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Welcome Servlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Entered data is </h1>");
                out.println("your first name:-" + g1+ "</br></br>");
                out.println("your last name:-" + g2 + "</br></br>");
                out.println("your uid :-" +  g3 + "</br></br>");
                out.println("your college email id:-" + g4 + "</br></br>");
                out.println("your valid password:-" + g5 + "</br></br>");
                out.println("your year:-" + g6 + "</br></br>");
                out.println("your batch:-" + g7 + "</br></br>");
                out.println("your personal email:-" + g8+ "</br></br>");
                out.println("your phone no:-" + g9 + "</br></br>");
                out.println("your address :-" +  g10 + "</br></br>");
                out.println("your description:-" + g11 + "</br></br>");
                out.println("your skills:-" + g12 + "</br></br>");
                out.println("your github account:-" + g13 + "</br></br>");
                out.println("your hackerrank account:-" + g14 + "</br></br>");
                out.println("your codechef account:-" + g15 + "</br></br>");
                out.println("your privacy setting:-" + g16 + "</br></br>"); 
                out.println("</body>");
                out.println("</html>");
            }
//            int x = ps.executeUpdate(); 
//            if (x > 0)
            {
            	
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
        }  
        else{  
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);  
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


//
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class Vprofile
// */
//@WebServlet("/Vprofile")
//public class Vprofile extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Vprofile() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
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

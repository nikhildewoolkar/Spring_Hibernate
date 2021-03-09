package in.cdac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register-servlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /*
      @see HttpServlet#HttpServlet()
     
    public RegisterServlet() {
        super();
         TODO Auto-generated constructor stub
    }

	
	  @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		try {
			String name = request.getParameter("name");
			String Won = request.getParameter("casesWon");
			String Lost = request.getParameter("casesLost");

			int casesWon = Integer.parseInt(Won);
			int casesLost = Integer.parseInt(Lost);
			
			Lawyer lawyer = new Lawyer();
			lawyer.setName(name);
			lawyer.setCasesWon(casesWon);
			lawyer.setCasesLost(casesLost);
			
			HibernateRegister.registerUser(lawyer);			
			response.sendRedirect("register.jsp");
		} catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("register.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

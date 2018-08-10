package in.co.capgemini;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("*.app")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String action = request.getServletPath();
		System.out.println(action);
		
		switch(action) {
		case ("/Login.app") :
		
			if((username.equals("admin"))&&(password.equals("admin"))) {
				HttpSession session=request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("Success.jsp");
			}
			else {
				response.sendRedirect("Error.jsp");
			}
			break;
			default :
				response.sendRedirect("Login.jsp");
				break;}
				
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

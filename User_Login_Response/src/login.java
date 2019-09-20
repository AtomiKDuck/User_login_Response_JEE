import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//Get user inputs
	String nameInput = request.getParameter("Name");
	String passInput = request.getParameter("Password");
	
	//Get correct params from XML
	String correctName = getServletContext().getInitParameter("Name");
	String correctPassword = getServletContext().getInitParameter("Password");
	
	//Compare user inputs with XML params, and redirect to corresponding htmls
	if(nameInput.equals(correctName) && passInput.equals(correctPassword)) {
		response.sendRedirect("welcome.html");
		//RequestDispatcher view = request.getRequestDispatcher("html/welcome.html");
		//view.forward(request, response);
	}
	else {
		response.sendRedirect("notWelcome.html");
		//RequestDispatcher view = request.getRequestDispatcher("html/notWelcome.html");
		//view.forward(request, response);
	}
	
	//PrintWriter out = response.getWriter();
	//out.println("My Message");
	
	}
}


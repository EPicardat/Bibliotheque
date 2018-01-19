package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	
    public Test() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String message = "Transmission de variables : OK !";
		String message2 = "Ce servlet pue la marée !";
	    request.setAttribute( "bidule", message );   
		request.setAttribute("machin", message2);
	    
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}
}

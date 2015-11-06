package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/hello")
public class HelloServelet extends HttpServlet{

	/**
	 * 
	 */
	
	
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request ,HttpServletResponse response)
	throws ServletException ,IOException      {
	PrintWriter printriter =response .getWriter();
	printriter.write("<html>");
	printriter.write("<head>");	
	printriter.write("</head>");	
	printriter.write("<body>");
	printriter.write("<h1>hello from  the other side <h1>");
	printriter.write("</body>");
	printriter.write("</html>");
		
		
		
		
		
		
	}

}

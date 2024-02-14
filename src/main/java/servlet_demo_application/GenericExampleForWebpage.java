package servlet_demo_application;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericExampleForWebpage extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		//webpage output
		response.setContentType("text/html");
		response.getWriter().println("<h1>This is webpage for Generic Servlet</h1>");

		//servlet dispatcher : interface
	}

}

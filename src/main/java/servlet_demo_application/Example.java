package servlet_demo_application;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//if we want to treat this class as servlet
// then we have to implement servlet interface

public class Example implements Servlet {
	
	ServletConfig config = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//initialization
		this.config = config;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//actual response related logic
		// hello world output
		System.out.println("Hello Servlet Program");
		//getMethod(); => it return type of request method
	}

	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "This is My First Servlet Example";
	}
}

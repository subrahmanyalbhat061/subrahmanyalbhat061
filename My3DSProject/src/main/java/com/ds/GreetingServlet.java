package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet({ "/Greet", "/hi", "/hello" })
public class GreetingServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    static int i=1;
    public GreetingServlet() {
        super();
        System.out.println("GreetServlet()...");
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 System.out.println("init() ...");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		 System.out.println("destroy()...");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 System.out.println("service()..."+i);
		 i++;
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
        pw.println("<marquee><h1>WELOCME TO THE WORLD OF SERVLET</h1></marquee>");
	}

}

package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlightEnquiryServlet
 */
@WebServlet({ "/FlightEnquiry", "/Enquiry" })
public class FlightEnquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

     
    public FlightEnquiryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        System.out.println("doGet() is called");
        String sourceCity =request.getParameter("scity");
        String targetCity =request.getParameter("dcity");

         PrintWriter pw=response.getWriter();
         pw.println("Source City  "+sourceCity+"Destination City  "+targetCity);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() called");
		//doGet(request, response);
	}

}

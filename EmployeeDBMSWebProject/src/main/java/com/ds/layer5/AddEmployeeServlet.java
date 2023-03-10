package com.ds.layer5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.layer2.Employee;
import com.ds.layer3.EmployeeDAOImpl;


@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDAOImpl empstaff= new EmployeeDAOImpl();

    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		String empname =request.getParameter("empname");
		String empjob = request.getParameter("empjob");
		int empsal = Integer.parseInt(request.getParameter("empsal"));
		
		Employee tempEmp = new Employee(empno,empname,empjob,empsal);
		empstaff.addEmployee(tempEmp);
	    
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html"); // MIME
		pw.println("<h2> employee added successfully....</h2>");
		pw.println("<a href='emp'>Back to Home</a>");
		System.out.println("employee added to the list....");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

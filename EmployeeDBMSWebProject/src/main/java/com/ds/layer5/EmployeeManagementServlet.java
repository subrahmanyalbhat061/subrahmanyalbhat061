package com.ds.layer5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.layer2.Employee;
import com.ds.layer3.EmployeeDAOImpl;
import com.ds.layer4.EmployeeServiceImpl;



// http://ip:port/EmployeeManagementProject/emp

@WebServlet("/emp")
public class EmployeeManagementServlet extends HttpServlet {
	
	EmployeeServiceImpl empstaff= new EmployeeServiceImpl();
	
    public EmployeeManagementServlet() {
        super();
		System.out.println("EmployeeManagementServlet() invoked...");

    }

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		System.out.println("destroy() invoked...");

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet(req,resp) invoked...");

		PrintWriter pw = response.getWriter();
		pw.println("<table border=5>"); //HTML is in the custody of JAVA code 
		     List emparray=empstaff.getEmployeeService();
			Iterator<Employee> empIterator = emparray.iterator();
			pw.println("<form action='addEmployee'>");

			pw.println("<tr>");

			pw.println("<td>");
			pw.println("<input type=text value='Enter emp no' name='empno'>");
			pw.println("</td>");
			
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp name' name='empname'>");
			pw.println("</td>");
			
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp job' name='empjob'>");
			pw.println("</td>");
			
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp sal' name='empsal'>");
			pw.println("</td>");

			
			pw.println("<td>");
				pw.println("<button>Add</button>");
			pw.println("</td>");
	
			pw.println("</tr>");
			
			pw.println("</form>");
			/*pw.println("<tr>");

			pw.println("<td>");
			pw.println("<input type=text value='Enter emp no'>");
			pw.println("<td>");
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp name'>");
			pw.println("<td>");
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp job'>");
			pw.println("<td>");
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp sal'>");
			pw.println("<td>");

			
			pw.println("<td>");
				pw.println("<button>Add</button>");
			pw.println("<td>");
	
			pw.println("</tr>");*/

		
			while(empIterator.hasNext()) {
				Employee emp = empIterator.next();

				pw.println("<tr>");

				pw.println("<td>");
					pw.println(emp.getEmployeeNumber());
				pw.println("</td>");
			
				pw.println("<td>");
					pw.println(emp.getEmployeeName());
				pw.println("</td>");
				
				
				pw.println("<td>");
					pw.println(emp.getEmployeeJob());
				pw.println("</td>");
				
				
				pw.println("<td>");
					pw.println(emp.getEmployeeSalary());
				pw.println("</td>");
				
			/*	pw.println("<td>");
					pw.println("<button>Edit</button>");
				pw.println("<td>");
			
			
				pw.println("<td>");
					pw.println("<button>Delete</button>");
				pw.println("<td>");*/
		
				pw.println("</tr>");

			}
			
			
		pw.println("</table>");
		
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost(req,resp) invoked...");
		doGet(request, response);
	}

}

package com.ds.layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.ds.layer2.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
  Connection conn;

	public EmployeeDAOImpl() {
		super();	
		try {
					System.out.println("Drive Manager loading driver");
					DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
					
					System.out.println("Connecting to database");
					this.conn =DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","root123");
					
					
				} 
		catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			
	}
	public void addEmployee(Employee e) {
		
		try {
			  PreparedStatement  s = conn.prepareStatement("insert into employee values(?,?,?,?)");
			   s.setInt(1, e.getEmployeeNumber());
			   s.setString(2, e.getEmployeeName());
			   s.setString(3, e.getEmployeeJob());
			   s.setInt(4, e.getEmployeeSalary());
			
			   int rows=s.executeUpdate();
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}



	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
  try {
	      System.out.println("\nCreating  Statemnt :");
	      Statement statement1 = conn.createStatement();
	      
	      System.out.println("Getting Result");
	      ResultSet result =statement1.executeQuery("select *from employee");
	     
	      
	      while(result.next()) {//processing the result
	    	  Employee e= new Employee();
	        	 e.setEmployeeNumber(result.getInt(1));
	        	 e.setEmployeeName(result.getString(2));
	        	 e.setEmployeeJob(result.getString(3));
	        	 e.setEmployeeSalary(result.getInt(4));
	        	 empList.add(e);
	        	
	        	 
	         }
	      return empList;
  }
  catch(SQLException e) {
		e.printStackTrace();
  }
	  
		return null;
	}

	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		 Employee e= new Employee();
		try {
		      System.out.println("\nCreating  Statemnt :");
		      Statement statement1 = conn.createStatement();
		      
		      System.out.println("Getting Result");
		      ResultSet result =statement1.executeQuery("select *from employee where empno="+empno);
		     
		      
		      if(result.next()) {//processing the result
		    	 
		        	 e.setEmployeeNumber(result.getInt(1));
		        	 e.setEmployeeName(result.getString(2));
		        	 e.setEmployeeJob(result.getString(3));
		        	 e.setEmployeeSalary(result.getInt(4));
	 
		         }
		      return e;
	  }
	  catch(SQLException e1) {
			e1.printStackTrace();
	  }
		return null;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Creating Desired Statement");
			PreparedStatement s = conn.prepareStatement("update employee set empname=? ,job=? ,salary=? where empno=?");
			s.setString(1,e.getEmployeeName());
			s.setString(2,e.getEmployeeJob());
			s.setInt(3,e.getEmployeeSalary());
			s.setInt(3,e.getEmployeeNumber());
			int rows = s.executeUpdate();
			   
			 
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//creating desired statement
		

	}

	@Override
	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement s = conn.prepareStatement("delete from employee  where empno=?");
			s.setInt(1, empno);
			s.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

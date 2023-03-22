package com.java.layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.layer2.Bill;
import com.java.layer2.ClaimRequest;




public class BillDAOImpl implements BillDAO {

	 Connection conn;
		public BillDAOImpl() {
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
		@Override
		public double getAmount(int billId) {
			// TODO Auto-generated method stub
			
			Bill b=new Bill();
			 try {
			      System.out.println("\nCreating  Statemnt :");
			      Statement statement1 = conn.createStatement();
			      
			      System.out.println("Getting Result");
			      ResultSet result =statement1.executeQuery("select * from Bill where billId="+billId);
			     
			      if(result.next()) {//processing the result 
			        	 b.setBillId(result.getInt(1));
			        	 b.setBillAmount(result.getDouble(2));
			         }
			      double m=b.getBillAmount();
			      
			      return m;
		  }
		  catch(SQLException e) {
				e.printStackTrace();
		  }
			  
			return 0;
		}
		@Override
		public List<Bill> getBills() {
			// TODO Auto-generated method stub
			List<Bill> billList = new ArrayList<Bill>();
			  try {
				      System.out.println("\nCreating  Statemnt :");
				      Statement statement1 = conn.createStatement();
				      
				      System.out.println("Getting Result");
				      ResultSet result =statement1.executeQuery("select *from Bill");
				     
				      
				      while(result.next()) {//processing the result
				    	  Bill b= new Bill();
				    	     b.setBillId(result.getInt(1));
				        	 b.setBillAmount(result.getDouble(2));
				        	 billList.add(b); 
				         }
				      return billList;
			  }
			  catch(SQLException e) {
					e.printStackTrace();
			  }
			return null;
		}
		
		
	
	


}

package com.java.layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.java.layer2.Currency;

public class CurrencyDAOImpl implements CurrencyDAO {
	  Connection conn;
	public CurrencyDAOImpl() {
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
	public List<Currency> readCurrencyList() {
		List<Currency> currList = new ArrayList<Currency>();
		  try {
			      System.out.println("\nCreating  Statemnt :");
			      Statement statement1 = conn.createStatement();
			      
			      System.out.println("Getting Result");
			      ResultSet result =statement1.executeQuery("select *from currency");
			     
			      
			      while(result.next()) {//processing the result
			    	  Currency e= new Currency();
			        	 e. setCurrencyId(result.getInt(1));
			        	 e.setSourceCurrency(result.getString(2));
			        	 e.setTargetCurrency(result.getString(3));
			        	 e.setloadFactor(result.getFloat(4));
			        	 currList.add(e);
			        	
			        	 
			         }
			      return currList;
		  }
		  catch(SQLException e) {
				e.printStackTrace();
		  }
			  
		return null;
	}

	@Override
	public Currency readCurrency(int x) {
		Currency e1= new Currency();
		 try {
		      System.out.println("\nCreating  Statemnt :");
		      Statement statement1 = conn.createStatement();
		      
		      System.out.println("Getting Result");
		      ResultSet result =statement1.executeQuery("select *from currency where currencyId="+x);
		     
		      
		      if(result.next()) {//processing the result
		    	  
		        	 e1. setCurrencyId(result.getInt(1));
		        	 e1.setSourceCurrency(result.getString(2));
		        	 e1.setTargetCurrency(result.getString(3));
		        	 e1.setloadFactor(result.getFloat(4));
		        	 
		         }
		      return e1;
	  }
	  catch(SQLException e) {
			e.printStackTrace();
	  }
		  
	return null;
	}

	@Override
	public void updateCurrency(Currency e) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Creating Desired Statement");
			PreparedStatement s = conn.prepareStatement("update currency set sourceCurrency=? ,targetCurrency=? ,loadFactor=? where currencyId=?");
			s.setString(1,e.getSourceCurrency());
			s.setString(2,e.getTargetCurrency());
			s.setFloat(3,e.getloadFactor());
			s.setInt(4,e.getCurrencyId());
			int rows = s.executeUpdate();
			   
			 
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//creating desired statement
	}

	@Override
	public void deleteCurrency(int currencyId) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement s = conn.prepareStatement("delete from Currency  where currencyId=?");
			s.setInt(1, currencyId);
			s.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void addCurrency(Currency e) {
		// TODO Auto-generated method stub
		try {
			  PreparedStatement  s = conn.prepareStatement("insert into currency values(?,?,?,?)");
			   s.setInt(1, e.getCurrencyId());
			   s.setString(2, e.getSourceCurrency());
			   s.setString(3, e.getTargetCurrency());
			   s.setFloat(4, e.getloadFactor());
			
			   int rows=s.executeUpdate();
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

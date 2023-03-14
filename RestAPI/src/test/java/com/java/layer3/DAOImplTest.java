package com.java.layer3;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Currency;

public class DAOImplTest {

	@Test
	public void ReadAllCurrecncyTest() {
//		System.out.println("Testing Condition1");
//		Assertions.assertTrue(100>15);
//		System.out.println("Test Succesful");
//		
//		System.out.println("Testing Condition2");
//		Assertions.assertTrue(10>15);
//		System.out.println("Test Succesful");
//		
//		System.out.println("Testing Condition3");
//		Assertions.assertTrue(300>15);
//		System.out.println("Test Succesful");
//		
//		System.out.println("Testing Condition4");
//		Assertions.assertTrue(70>15);
//		System.out.println("Test Succesful");
		
		CurrencyDAO currDao=new CurrencyDAOImpl();
		Assertions.assertTrue(currDao!=null);
		
		List<Currency> currList=currDao.readCurrencyList();
		Assertions.assertTrue(currList.size()>0);
		
		for(Currency c:currList) {
			System.out.println(c);
		}
		
		
	}
	
	@Test
	public void ReadCurrecncyTest() {
//		System.out.println("Testing Condition1");
//		Assertions.assertTrue(100>15);
//		System.out.println("Test Succesful");
//		
//		System.out.println("Testing Condition2");
//		Assertions.assertTrue(10>15);
//		System.out.println("Test Succesful");
//		
//		System.out.println("Testing Condition3");
//		Assertions.assertTrue(300>15);
//		System.out.println("Test Succesful");
//		
//		System.out.println("Testing Condition4");
//		Assertions.assertTrue(70>15);
//		System.out.println("Test Succesful");
		
		CurrencyDAO currDao=new CurrencyDAOImpl();
		Assertions.assertTrue(currDao!=null);
		
		System.out.println(currDao.readCurrency(3));
	
		
		
		
	}
	@Test
	public void addCurrencyTest() {
		CurrencyDAO curr =new CurrencyDAOImpl();
		Assertions.assertTrue(curr!=null);
		
		Currency c= new Currency(7,"JapanYEN","IND",4000.70f);
		Assertions.assertTrue(c!=null);
		
		curr.addCurrency(c);
		
		List<Currency> currList=curr.readCurrencyList();
		Assertions.assertTrue(currList.size()>0);
		
		for(Currency c1:currList) {
			System.out.println(c1);
		}
	}
	
	@Test
	public void deleteTest() {
		CurrencyDAO curr =new CurrencyDAOImpl();
		Assertions.assertTrue(curr!=null);
		
		curr.deleteCurrency(7);
	    System.out.println("Operation Successful");
		
		List<Currency> currList=curr.readCurrencyList();
		Assertions.assertTrue(currList.size()>0);
		
		for(Currency c1:currList) {
			System.out.println(c1);
		}
		
	}
	
	@Test
	public void updateTest() {
		CurrencyDAO curr =new CurrencyDAOImpl();
		Assertions.assertTrue(curr!=null);
		
		Currency c= new Currency(5,"JapanYEN","IND",4000.70f);
		Assertions.assertTrue(c!=null);
		
		curr.updateCurrency(c);
		
		List<Currency> currList=curr.readCurrencyList();
		Assertions.assertTrue(currList.size()>0);
		
		for(Currency c1:currList) {
			System.out.println(c1);
		}
		
	}

}

package com.java.layer4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ServiceImplTest {
	

		@Test
		public void ConveresionTest() throws conversionFactorNotFoundException {
			try {
              CurrencyService curr=new CurrencyServiceImpl();
              Assertions.assertTrue(curr!=null);
              
             float amount= curr.getConversion("IND", "USD", 500);
             System.out.println("Amount ="+amount);
			
		}
			catch(conversionFactorNotFoundException e) {
				e.printStackTrace();
			}
}
}

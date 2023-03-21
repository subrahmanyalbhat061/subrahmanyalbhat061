package com.java.layer3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillImpltest {
	@Test
	public void getAmountTest() {
		BillDAO bill=new BillDAOImpl();
		Assertions.assertTrue(bill!=null);

		System.out.println(bill.getAmount(2));
		
	}
}

package com.java.layer3;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Bill;

public class BillImpltest {
	@Test
	public void getAmountTest() {
		BillDAO bill=new BillDAOImpl();
		Assertions.assertTrue(bill!=null);

		System.out.println(bill.getAmount(2));
		
	}
	@Test
	public void getBills() {
		BillDAO bill=new BillDAOImpl();
		Assertions.assertTrue(bill!=null);
        
		List<Bill> billList= bill.getBills();
		
		for(Bill b:billList) {
			System.out.println(b);
		}
	}
}

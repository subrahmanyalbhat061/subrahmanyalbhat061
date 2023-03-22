package com.java.layer3;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Customer;





public class CustomerDAOImplTest {
	@Test
	public void getAllTest() {
		CustomerDao customer=new CustomerDaoImpl();
		Assertions.assertTrue(customer!=null);
		
		List<Customer> customerList = customer.getCustomer();
		Assertions.assertTrue(customerList.size()>0);
		
		for(Customer c : customerList) {
			System.out.println(c);
		}
	}
}

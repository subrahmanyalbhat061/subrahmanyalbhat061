package com.java.layer4;

import java.util.List;

import com.java.layer2.Customer;

public interface CustomerService {

	Customer viewCustomerService(int customerId);
	List<Customer> viewAllCustomerService();


}

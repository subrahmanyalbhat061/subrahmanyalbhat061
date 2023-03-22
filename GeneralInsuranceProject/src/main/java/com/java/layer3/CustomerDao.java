
package com.java.layer3;

import java.util.List;

import com.java.layer2.Customer;

public interface CustomerDao {

	void addCustomer(Customer c);
	List<Customer> getCustomer();
	Customer getCustomer(int cno);
	void updateCustomer(Customer cno);
	void deleteCustomer(int cno);

}


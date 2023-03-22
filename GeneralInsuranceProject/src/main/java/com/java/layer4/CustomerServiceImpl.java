package com.java.layer4;

import java.util.List;

import javax.ws.rs.Path;
import com.java.layer2.Customer;
import com.java.layer3.CustomerDao;
import com.java.layer3.CustomerDaoImpl;


public class CustomerServiceImpl implements CustomerService{

	CustomerDao custDao = new CustomerDaoImpl();

	@Override
	public List<Customer> viewAllCustomerService() {
		List<Customer> custList = custDao.getCustomer();
		return custList;
	}

	
	public Customer viewCustomerService(int customerId) {
		// TODO Auto-generated method stub
		Customer customer=custDao.getCustomer(customerId);
		return customer;
	}

}

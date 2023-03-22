package com.java.layer2;

import java.sql.Date;

public class Customer {

	private int customerId;
	private String customerName;
	private Date date;
	private String address;
	private String rcNumber;
	private int policyId;
	
	public Customer(int customerId, String customerName, Date date, String address, String rcNumber, int policyId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.date = date;
		this.address = address;
		this.rcNumber = rcNumber;
		this.policyId = policyId;
	}

	public Customer() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRcNumber() {
		return rcNumber;
	}

	public void setRcNumber(String rcNumber) {
		this.rcNumber = rcNumber;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", date=" + date + ", address="
				+ address + ", rcNumber=" + rcNumber + ", policyId=" + policyId + "]";
	}
	
	
	
}


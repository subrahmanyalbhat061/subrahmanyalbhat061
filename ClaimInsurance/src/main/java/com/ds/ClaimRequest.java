package com.ds;

import java.time.LocalDate;


public class ClaimRequest {
    private int requestID;
    private int policyNumber;
    private String typeOfPolicy;
    private String cause;
    private double amountToBeClaimed;
    private LocalDate date;
    

	public ClaimRequest(int requestID, int policyNumber, String typeOfPolicy, String cause, double amountToBeClaimed,
			LocalDate date) {
		super();
		this.requestID = requestID;
		this.policyNumber = policyNumber;
		this.typeOfPolicy = typeOfPolicy;
		this.cause = cause;
		this.amountToBeClaimed = amountToBeClaimed;
		this.date = date;
	}

	public ClaimRequest() {

	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		policyNumber = policyNumber;
	}

	public String getTypeOfPolicy() {
		return typeOfPolicy;
	}

	public void setTypeOfPolicy(String typeOfPolicy) {
		this.typeOfPolicy = typeOfPolicy;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public double getAmountToBeClaimed() {
		return amountToBeClaimed;
	}

	public void setAmountToBeClaimed(double amountToBeClaimed) {
		this.amountToBeClaimed = amountToBeClaimed;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
 
	

	
    
}
package com.java.layer3;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Bill;
import com.java.layer2.ClaimRequest;


public class ClaimRequestImplTest {
	
@Test
public void getAllTest() {
	ClaimRequestDAO claim=new ClaimRequestDAOImpl();
	Assertions.assertTrue(claim!=null);
	
	List<ClaimRequest> claimList = claim.getClaimRequests();
	Assertions.assertTrue(claimList.size()>0);
	
	for(ClaimRequest c : claimList) {
		System.out.println(c);
	}
	
	
}

@Test
public void getTest() {
	ClaimRequestDAO claim=new ClaimRequestDAOImpl();
	Assertions.assertTrue(claim!=null);

	System.out.println(claim.getClaimRequest(1003));
	
}

@Test
public void createTest() {
	ClaimRequestDAO c= new ClaimRequestDAOImpl();
	Assertions.assertTrue(c!=null);
	
	ClaimRequest m=new ClaimRequest();
	m.setPolicyId(103);
	m.setFid(3);
	m.setBillId(3);
    m.setCause("Natural Disaster");
    m.setCustomerId(1004);
	c.createClaimRequest(m);
	
	List<ClaimRequest> list=c.getClaimRequests();
	for(ClaimRequest claims: list) {
		System.out.println(claims);
	}
}

@Test
public void updateTest() {
	ClaimRequestDAO c= new ClaimRequestDAOImpl();
	BillDAO l=new BillDAOImpl();
	
	Assertions.assertTrue(c!=null);
	Assertions.assertTrue(l!=null);
	
	Bill b=new Bill();
	ClaimRequest m=new ClaimRequest();
	
	
	
	m.setStatus_("Accepted");
	m.setBillId(3);
	double d=l.getAmount(m.getBillId());
	m.setAmountClaimed(d);
	m.setTokenId(1);
	
	c.updateClaimRequest(m);
	

	
	
}
@Test
public void removeTest() {
	ClaimRequestDAO claim =new ClaimRequestDAOImpl();
	Assertions.assertTrue(claim!=null);
	
	claim.removeClaimRequest(4);
    System.out.println("Operation Successful");
	
	List<ClaimRequest> claimList=claim.getClaimRequests();
	Assertions.assertTrue(claimList.size()>0);
	
	for(ClaimRequest c1:claimList) {
		System.out.println(c1);
	}
}
}

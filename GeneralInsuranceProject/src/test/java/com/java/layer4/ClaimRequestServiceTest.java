package com.java.layer4;



import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Bill;
import com.java.layer2.ClaimRequest;
import com.java.layer3.BillDAO;
import com.java.layer3.BillDAOImpl;
import com.java.layer3.ClaimRequestDAO;
import com.java.layer3.ClaimRequestDAOImpl;


public class ClaimRequestServiceTest {
	@Test
	public void createTest() {
		ClaimRequestService c= new ClaimRequestServiceImpl();
		Assertions.assertTrue(c!=null);
		
		ClaimRequest m=new ClaimRequest();
		m.setPolicyId(105);
		m.setFid(3);
		m.setBillId(5);
	    m.setCause("Natural Disaster");
	    m.setCustomerId(1005);
		try {
			try {
				c.createClaimRequest(m);
			} catch (claimRequestAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (PolicyNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BillNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FirNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	@Test
	public void getTest() {
		ClaimRequestService c= new ClaimRequestServiceImpl();
		Assertions.assertTrue(c!=null);
		
		List<ClaimRequest> list=c.getClaimRequests(); 
		for(ClaimRequest m:list) {
			System.out.println(m);
		}
	}
	
	@Test
	public void updateTest() throws ClaimRequestForParticularTokenNotFoundException{
		ClaimRequestService c= new ClaimRequestServiceImpl();
		BillService l=new BillServiceImpl();
		
		Assertions.assertTrue(c!=null);
		Assertions.assertTrue(l!=null);
		
		Bill b=new Bill();
	
		try {
			ClaimRequest m = c.getClaimRequestByToken(1);
			Assertions.assertTrue(m!=null);

			m.setStatus_("Accepted");
			double d=l.getAmount(m.getBillId());
			int token=m.getTokenId();
		    m.setAmountClaimed(d);
			m.setTokenId(token);
			
			c.updateClaimRequest(m);
		} catch (ClaimRequestForParticularTokenNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		@Test
		public void getByIdTest() {
			ClaimRequestService l= new ClaimRequestServiceImpl();
			Assertions.assertTrue(l!=null);
			
			 
			try {
				ClaimRequest list = l.getClaimRequestByToken(4);
				System.out.println(list);
			} catch (ClaimRequestForParticularTokenNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}

		
		@Test
		public void getTest3() {
			ClaimRequestService c= new ClaimRequestServiceImpl();
			Assertions.assertTrue(c!=null);
			
			
			try {
				List<ClaimRequest> list = c.getClaimRequestById(1004);
				for(ClaimRequest m:list) {
					System.out.println(m);
				}
			} catch (ClaimRequestForParticularCustomerIdNotFoundException2 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
	
}

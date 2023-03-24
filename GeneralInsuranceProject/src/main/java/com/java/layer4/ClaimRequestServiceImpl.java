package com.java.layer4;

import java.util.List;

import com.java.layer2.Bill;
import com.java.layer2.ClaimRequest;
import com.java.layer2.Customer;
import com.java.layer2.Fir;


import com.java.layer3.ClaimRequestDAO;
import com.java.layer3.ClaimRequestDAOImpl;



public class ClaimRequestServiceImpl implements ClaimRequestService {
	
	ClaimRequestDAO claim=new ClaimRequestDAOImpl();
    CustomerService customer=new CustomerServiceImpl();
    BillService bill=new BillServiceImpl();
    FirService fir=new FirServiceImpl();
    
	@Override
	public void createClaimRequest(ClaimRequest c) throws PolicyNotFoundException, BillNotFoundException, FirNotFoundException, claimRequestAlreadyExistsException {
		// TODO Auto-generated method stub
		int flag1=0,flag2=0,flag3=0,flag4=1,flag5=1;
		

		List<Customer> customers=customer.viewAllCustomerService();
		List<Bill> bills=bill.getBills();
		List<Fir> firs=fir.getFirs();
		List<ClaimRequest> claims=claim.getClaimRequests();
		
	
		for(Customer m:customers) {
			if(m.getCustomerId()==c.getCustomerId() && m.getPolicyId()==c.getPolicyId()) {
				flag1=1;
				break;
			}
		}
		for(Bill b:bills) {
			if(b.getBillId()==c.getBillId() ) {
				flag2=1;
				break;
			}
		}
		for(Fir f:firs) {
			if(f.getFirId()==c.getFid()) {
				flag3=1;
				break;
			}
		}
		for(ClaimRequest l:claims){
			if((c.getCustomerId()==l.getCustomerId() && l.getFid()==c.getFid()) || (c.getCustomerId()==l.getCustomerId() && l.getBillId()==c.getBillId()) || c.getBillId()==l.getBillId() || l.getFid()==c.getFid()) {
			flag4=0;
			break;
		}
			 
	}
		if(flag1==0) {
		
			throw new PolicyNotFoundException("Policy Not found");
		}
		else {
			if(flag2==0) {
				throw new BillNotFoundException("Bill Not found");
			}
			else {
				if(flag3==0) {
					throw new FirNotFoundException("Fir Not  Found");
				}
				else {
					if(flag4==0) {
						throw new claimRequestAlreadyExistsException("Claim Requests with same FirId or Bill Id  Already exists");
				}
					else {
					claim.createClaimRequest(c);
					}
				}
			}
		}

	}

	@Override
	public void updateClaimRequest(ClaimRequest c) {
		// TODO Auto-generated method stub
		claim.updateClaimRequest(c);
		
	}

	@Override
	public List<ClaimRequest> getClaimRequests() {
		// TODO Auto-generated method stub
		List<ClaimRequest> claimList=claim.getClaimRequests();
		return claimList;
	}

	@Override
	public List<ClaimRequest> getClaimRequestById(int customerId)  {
		// TODO Auto-generated method stub
		List<ClaimRequest> claimList=claim.getClaimRequestById(customerId);
		return claimList;
	}

	@Override
	public ClaimRequest getClaimRequestByToken(int tokenid) throws ClaimRequestForParticularTokenNotFoundException {
		// TODO Auto-generated method stub
	 
		ClaimRequest c=claim.getClaimRequestByToken(tokenid);
		if(c.getTokenId()==0) {
			throw new ClaimRequestForParticularTokenNotFoundException("Claim Request with token number "+tokenid+" Not Found");
		}
		else {
			return c;
		}
	}

	

	

}

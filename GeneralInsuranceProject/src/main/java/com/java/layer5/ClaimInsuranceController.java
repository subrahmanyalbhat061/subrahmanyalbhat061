package com.java.layer5;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.java.layer2.ClaimRequest;
import com.java.layer4.BillNotFoundException;
import com.java.layer4.BillService;
import com.java.layer4.BillServiceImpl;
import com.java.layer4.ClaimRequestForParticularCustomerIdNotFoundException2;
import com.java.layer4.ClaimRequestForParticularTokenNotFoundException;
import com.java.layer4.ClaimRequestService;
import com.java.layer4.ClaimRequestServiceImpl;
import com.java.layer4.FirNotFoundException;
import com.java.layer4.PolicyNotFoundException;
import com.java.layer4.claimRequestAlreadyExistsException;



@Path("/claim")
public class ClaimInsuranceController {
     ClaimRequestService claim=new ClaimRequestServiceImpl();
     BillService l=new BillServiceImpl();
     
     public ClaimInsuranceController() {
 		System.out.println("Claim Request Service called");
     }
     
   @GET
   @Path("/getClaims")
   @Produces(MediaType.APPLICATION_JSON)
   public List<ClaimRequest> getClaimRequest(){
	   List<ClaimRequest> claimList=claim.getClaimRequests();
	   return claimList;
  }
   
   @POST
   @Path("/createClaims")
 public String createClaimRequest(ClaimRequest c) {
 	  
 	 try {
		claim.createClaimRequest(c);
		return "ClaimRequest Created Succesfully";
	} catch (PolicyNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (BillNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FirNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (claimRequestAlreadyExistsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 		
 	return "ClaimRequest creation failed";
 	
    
    }
   
   @GET
   @Path("/getClaim/{customerId}")
   @Produces(MediaType.APPLICATION_JSON)
   public List<ClaimRequest> getClaimRequests(@PathParam("customerId") int customerId){
	    
	try {
		List<ClaimRequest>claimList = claim.getClaimRequestById(customerId);
		return claimList;
	} catch (ClaimRequestForParticularCustomerIdNotFoundException2 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return null;
  }
   

	 @PUT 
	 @Path("/update/{status}/{tokenId}")
		public String updateClaimRequest(@PathParam("status") String status,@PathParam("tokenId") int tokenId) {
		 try {
			ClaimRequest c=claim.getClaimRequestByToken(tokenId);
			int bill=c.getBillId();
			double amount1=l.getAmount(bill);
		    c.setStatus_(status);
			c.setAmountClaimed(amount1);
			claim.updateClaimRequest(c);
			return "Update Successfull";
		} catch (ClaimRequestForParticularTokenNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			return "Update not Successfull";
		}
}

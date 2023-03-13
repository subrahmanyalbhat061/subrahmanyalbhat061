package com.ds;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;  

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Claim")
public class ClaimRequestService{
	

static  List<ClaimRequest> claimrequests=new ArrayList();
  static {
	  
	  LocalDate Date=LocalDate.now();
	  
	  ClaimRequest c=new ClaimRequest();
	  c.setRequestID(1);
	  c.setPolicyNumber(1001);
	  c.setTypeOfPolicy("Third Party Policy");
	  c.setCause("Accident");
	  c.setAmountToBeClaimed(55000.45);
	  c.setDate(Date.minusDays(1));
	  
	  ClaimRequest c1=new ClaimRequest();
	  c1.setRequestID(2);
	  c1.setPolicyNumber(1002);
	  c1.setTypeOfPolicy("Third Party Policy");
	  c1.setCause("Car Theft");
	  c1.setAmountToBeClaimed(70000.45);
	  c1.setDate(Date.minusDays(10));
	  
	  ClaimRequest c2=new ClaimRequest();
	  c2.setRequestID(3);
	  c2.setPolicyNumber(1003);
	  c2.setTypeOfPolicy("Comprhensive");
	  c2.setCause("Accident");
	  c2.setAmountToBeClaimed(60000);
	  c2.setDate(Date.minusDays(15));
	  
	  claimrequests.add(c);
	  claimrequests.add(c1);
	  claimrequests.add(c2);
	  
	  
	  
  }
   
	public ClaimRequestService() {
		System.out.println("ClaimInsuranceService is invoked");
	}
	
  @GET
  @Path("/GetClaims")
  @Produces(MediaType.APPLICATION_JSON)
	public List<ClaimRequest> getClaimRequest(){
	 //Returns List of Claim Requests         
	  return claimrequests;
   
  }
  
  @POST
  @Path("/setClaims")
   public String makeClaim(ClaimRequest c) {
	  boolean found=false;
	  for(ClaimRequest c1:claimrequests) {
		  if(c1.getRequestID()==c.getRequestID()) {
			  found=true;
			  break;
		  }
	  }
	  if(found==false)
	  {
		  claimrequests.add(c);
		  return "Record Added";
	  }
	  else {
		  return "Duplicate date cannot be added";
	  }
  }
  
  @PUT
  @Path("/update")
   public String updateClaim(ClaimRequest c) {
	  boolean found=false;
	  for(ClaimRequest c1:claimrequests) {
		  if(c1.getRequestID()==c.getRequestID()) {
			  found=true;
			  claimrequests.remove(c1);
			  break;
		  }
	  }
	  if(found==false) {
		  return "Cannot be Updated as Claim Request with ID "+c.getRequestID() +"not Found ";
	  }
	  else {
		  claimrequests.add(c);
		  return "Record Updated";
	  }
  }
  
  @DELETE
  @Path("/delete/{cid}")
  public String deleteRecord(@PathParam("cid") int x) {
	  boolean found=false;
	  for(ClaimRequest c:claimrequests) {
		  if(c.getRequestID()==x) {
			  found=true;
			  claimrequests.remove(c);
			  break;
		  }
	  }
	  if(found==false) {
		  return "Operation unsuccesfull as Data with ID "+x+"is not found";
	  }
	  else {
		  return"Delete Operation is successfull";
	  }
  }
  
   
}

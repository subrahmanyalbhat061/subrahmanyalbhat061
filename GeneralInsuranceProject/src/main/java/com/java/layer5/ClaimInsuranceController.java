package com.java.layer5;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.layer4.ClaimRequestService;
import com.java.layer4.ClaimRequestServiceImpl;


@Path("/claim")
public class ClaimInsuranceController {
     ClaimRequestService claim=new ClaimRequestServiceImpl();
     
     public ClaimInsuranceController() {
 		System.out.println("Claim Request Service called");
     }
     
     @GET
   @Path("/greet")
   public String Welcome(){
	   return "<marquee style='background-color:blue;color:white'><h1>Welcome to General Insurance </h1></marquee>";
   }
}

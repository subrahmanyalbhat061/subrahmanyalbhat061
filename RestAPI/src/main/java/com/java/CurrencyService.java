package com.java;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//http://localhost:8080/RestAPI/rest/currency/greet
@Path("/currency")
public class CurrencyService {

	public CurrencyService() {
		System.out.println("Currency Service called");
	}
   @GET
   @Path("/greet")
   public String Welcome(){
	   return "<marquee style='background-color:blue;color:white'><h1>Welcome to Rest API </h1></marquee>";
   }
   @GET
   @Path("/article")
   public String Print() {
	   return "<a href='https://www.linkedin.com/pulse/learn-ganesh-rao?trk=public_profile_article_view'>Click Here</a>";
   }
   @GET
   @Path("/converts")
   @Produces(MediaType.APPLICATION_JSON)
   public List<Currency> convertAll() {
	   Currency curr=new Currency();
	   Currency curr1=new Currency();
	   Currency curr2=new Currency();
	   
	   
	   curr.setCurrencyId(1);
	   curr.setSourceCurrency("USD");
	   curr.setTargetCurrency("INR");
	   curr.setAmountToConvert(500);
	   
	   curr1.setCurrencyId(2);
	   curr1.setSourceCurrency("USD");
	   curr1.setTargetCurrency("INR");
	   curr1.setAmountToConvert(1000);
	   
	   curr2.setCurrencyId(3);
	   curr2.setSourceCurrency("USD");
	   curr2.setTargetCurrency("INR");
	   curr2.setAmountToConvert(1500);
	   
	   List<Currency> c=new ArrayList<Currency>();
	   c.add(curr);
	   c.add(curr1);
	   c.add(curr2);
	   return  c;
   }
}

package com.java.layer5;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.layer2.Currency;
import com.java.layer4.CurrencyService;
import com.java.layer4.CurrencyServiceImpl;
import com.java.layer4.conversionFactorNotFoundException;
//http://localhost:8080/RestAPI/rest/currency/greet
@Path("/currency")
public class CurrencyController {
	CurrencyService c=new CurrencyServiceImpl();
//	 static List<Currency> c=new ArrayList<Currency>();
//	 static {
//		   Currency curr=new Currency();
//		   curr.setCurrencyId(1);
//		   curr.setSourceCurrency("USD");
//		   curr.setTargetCurrency("INR");
//		   curr.setloadFactor(500);
//		   
//		   Currency curr1=new Currency();
//		   curr1.setCurrencyId(2);
//		   curr1.setSourceCurrency("USD");
//		   curr1.setTargetCurrency("INR");
//		   curr1.setloadFactor(1000);
//		   
//		   Currency curr2=new Currency();
//		   curr2.setCurrencyId(3);
//		   curr2.setSourceCurrency("USD");
//		   curr2.setTargetCurrency("INR");
//		   curr2.setloadFactor(1500);
//		   
//		   c.add(curr);
//		   c.add(curr1);
//		   c.add(curr2);
//	 }
	  public CurrencyController() {
		System.out.println("Currency Service called");
		  
	}
//   @GET
//   @Path("/greet")
//   public String Welcome(){
//	   return "<marquee style='background-color:blue;color:white'><h1>Welcome to Rest API </h1></marquee>";
//   }
//   @GET
//   @Path("/article")
//   public String Print() {
//	   return "<a href='https://www.linkedin.com/pulse/learn-ganesh-rao?trk=public_profile_article_view'>Click Here</a>";
//   }
//   @GET
//   @Path("/converts")
//   @Produces(MediaType.APPLICATION_JSON)
//   public List<Currency> convertAll() {
//	   return  c;
//   }
//   
//   @GET
//   @Path("/convert/{cid}")
//   @Produces(MediaType.APPLICATION_JSON)
//   public Currency convertIt(@PathParam("cid") int x) {
//	   Currency curr4=null;
//	   for(Currency currency:c) {
//		   if(currency.getCurrencyId()==x) {
//			   curr4=currency;
//			   break;
//		   }
//	   }
//	   return curr4;
//   }
//   
//   @DELETE
//   @Path("/Delete/{id}")
//   public String delete(@PathParam("id") int x) {
//	   boolean found=false;
//	   for(Currency currency:c) {
//		   if(currency.getCurrencyId()==x) {
//			   c.remove(currency);
//			   found=true;
//			   break;
//		   }
//	   }
//	   if(found==true) {
//		   return "Currency with ID "+x+"is deleted";
//	   }
//	   else {
//		   return "Currency with id"+x+"not found";
//	   }
//	   
//   }
//   
//   @POST
//   @Path("/Add")
//   public String add(Currency curr) {
//	   boolean found=false;
//	   for(Currency currency:c) {
//		   if(currency.getCurrencyId()==curr.getCurrencyId()) {
//			   found=true;
//			   break;
//		   }
//	   }
//	   if(found==false) {
//		   c.add(curr); 
//		   return "Record is inserted";
//	   }
//	   else {
//		   return "Duplicate record not allowed";
//	   }
//   }
//   
//   
//   @POST
//   @Path("/Update")
//   public String update(Currency curr) {
//	   boolean found=false;
//	   for(Currency currency:c) {
//		   if(currency.getCurrencyId()==curr.getCurrencyId()) {
//			   found=true;
//			   c.remove(currency);
//			   break;
//		   }
//	   }
//	   if(found==true) {
//		   c.add(curr);
//		   return "Record Successfully Updated";
//	   }
//	   else {
//		   return "Record With ID "+curr.getCurrencyId()+"not Found";
//	   }
//   }
	  
	  
	 @GET
	 @Path("/convert/{source}/{target}/{amount}")
	 public float convert(@PathParam("source") String source,@PathParam("target") String target, @PathParam("amount")float amount) {
		 float amt=0;
		 try {
			amt=c.getConversion(source, target, amount);
			return amt;
		} catch (conversionFactorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return 0;
	 }
}

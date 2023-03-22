package com.java.layer3;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.InsuranceIssued;



public class InsuranceIssuedTest {
	@Test
	public void getAllTest() {
		InsuranceIssuedDAO insurance=new InsuranceIssuedDAOImpl();
		Assertions.assertTrue(insurance!=null);
		
		List<InsuranceIssued> insuranceList = insurance.selectAllInsuranceIssued();
		Assertions.assertTrue(insuranceList.size()>0);
		
		for(InsuranceIssued c : insuranceList) {
			System.out.println(c);
		}
	}
}

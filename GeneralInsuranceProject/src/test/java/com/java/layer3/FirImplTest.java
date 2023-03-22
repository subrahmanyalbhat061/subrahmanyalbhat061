package com.java.layer3;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Fir;

public class FirImplTest {
	@Test
	public void getFirTest() {
		FirDAO fir=new FirDAOImpl();
		Assertions.assertTrue(fir!=null);

		List<Fir> m=fir.getFirs();
		
		for(Fir f:m) {
			System.out.println(f);
		}
		
	}
}

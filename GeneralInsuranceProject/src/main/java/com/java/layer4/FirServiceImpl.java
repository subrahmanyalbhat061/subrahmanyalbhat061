package com.java.layer4;

import java.util.List;

import com.java.layer2.Fir;
import com.java.layer3.FirDAO;
import com.java.layer3.FirDAOImpl;

public class FirServiceImpl implements FirService {
	 FirDAO fir=new FirDAOImpl();
	@Override
	public List<Fir> getFirs() {
		// TODO Auto-generated method stub
		List<Fir> firList=fir.getFirs();
		return firList;
	}

}

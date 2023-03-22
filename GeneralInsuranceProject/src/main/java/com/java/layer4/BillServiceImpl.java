package com.java.layer4;

import java.util.List;

import com.java.layer2.Bill;
import com.java.layer3.BillDAO;
import com.java.layer3.BillDAOImpl;

public class BillServiceImpl implements BillService {
	 BillDAO bill=new BillDAOImpl();
	@Override
	public double getAmount(int billId) {
		// TODO Auto-generated method stub
		double m=bill.getAmount(billId);
		return m;
	}

	@Override
	public List<Bill> getBills() {
		List<Bill> billList= bill.getBills();
		return billList;
	}

}

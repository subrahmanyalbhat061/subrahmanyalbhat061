package com.java.layer4;

import java.util.List;

import com.java.layer2.Bill;

public interface BillService {
	 double getAmount(int billId);
	  List<Bill> getBills();
}

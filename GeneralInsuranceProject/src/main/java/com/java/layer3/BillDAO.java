package com.java.layer3;

import java.util.List;

import com.java.layer2.Bill;

public interface BillDAO {
  double getAmount(int billId);
  List<Bill> getBills();
}

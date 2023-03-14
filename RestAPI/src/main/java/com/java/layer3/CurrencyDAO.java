package com.java.layer3;

import java.util.List;


import com.java.layer2.Currency;

public interface CurrencyDAO {
  List<Currency> readCurrencyList();
  Currency readCurrency(int x);
  void updateCurrency(Currency e);
  void deleteCurrency(int currencyId);
  void addCurrency(Currency e);
}

package com.java.layer4;

public interface CurrencyService {
   float getConversion(String sourceCurrency,String targetCurrency ,float amount)throws conversionFactorNotFoundException;
}

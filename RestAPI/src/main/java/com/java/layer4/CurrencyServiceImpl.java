package com.java.layer4;

import java.util.List;

import com.java.layer2.Currency;
import com.java.layer3.CurrencyDAO;
import com.java.layer3.CurrencyDAOImpl;

public class CurrencyServiceImpl implements CurrencyService {
    
    CurrencyDAO curr1=new CurrencyDAOImpl();
	@Override
	public float getConversion(String sourceCurrency, String targetCurrency, float amount) throws conversionFactorNotFoundException {
		// TODO Auto-generated method stub
	
		List<Currency> c= curr1.readCurrencyList();
		int flag=0;
		for(Currency m:c) {
			if(m.getSourceCurrency().equals(sourceCurrency)  && m.getTargetCurrency().equals(targetCurrency)) {
				flag=1;
				amount=m.getloadFactor()*amount;
		        break;
			}
		}
		if(flag==1) {
			return amount;
		}
		else {
			throw new conversionFactorNotFoundException("Currency Conversion not found");
		}

	}

}

package com.java.layer2;

public class Currency {
	 
   private int currencyId;
   private String sourceCurrency;
   private String targetCurrency;
   private float loadFactor;
   
   
   
   public Currency(int currencyId, String sourceCurrency, String targetCurrency, float loadFactor) {
	super();
	this.currencyId = currencyId;
	this.sourceCurrency = sourceCurrency;
	this.targetCurrency = targetCurrency;
	this.loadFactor = loadFactor;
}

public Currency() 
   {
	   System.out.println("Currency cru..");
   }

public int getCurrencyId() {
	return currencyId;
}

public void setCurrencyId(int currencyId) {
	this.currencyId = currencyId;
}

public String getSourceCurrency() {
	return sourceCurrency;
}

public void setSourceCurrency(String sourceCurrency) {
	this.sourceCurrency = sourceCurrency;
}

public String getTargetCurrency() {
	return targetCurrency;
}

public void setTargetCurrency(String targetCurrency) {
	this.targetCurrency = targetCurrency;
}

public float getloadFactor() {
	return loadFactor;
}

public void setloadFactor(float loadFactor) {
	this.loadFactor = loadFactor;
}

@Override
public String toString() {
	return "Currency [currencyId=" + currencyId + ", sourceCurrency=" + sourceCurrency + ", targetCurrency="
			+ targetCurrency + ", loadFactor=" + loadFactor + "]";
}
   
}

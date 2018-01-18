package com.tws.money;

import java.math.BigDecimal;

public class Money {
	private String moneyType;
	private BigDecimal price;
	
	public Money(String type, BigDecimal price) {
		this.moneyType = type;
		this.price = price;
		
	}
	/*private BigDecimal transfer(double rate);
	public BigDecimal transferUSD();*/
	public boolean compare(Money money){
		boolean result = this.moneyType.equalsIgnoreCase(money.moneyType);
		if(result == false)
			return result;
		int ret = this.price.compareTo(money.price);
		if(ret == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
}

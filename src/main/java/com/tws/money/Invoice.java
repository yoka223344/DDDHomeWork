package com.tws.money;


public class Invoice {
	
  	private String inveType;
	private String inveNum;
  	public Invoice(String inveNum,String inveType) {
		// TODO Auto-generated constructor stub
  		this.inveNum = inveNum;
  		this.inveType = inveType;
  		
	}
  	

  	public String getInveNum() {
		return inveNum;
	}
	public String getInveType() {
		return inveType;
	}
  	 

}
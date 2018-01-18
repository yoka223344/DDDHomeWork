package com.tws.money;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
	private Map<String, Customer> customerRep;
	
	private static CustomerRepository instance;
	
	private CustomerRepository() {
		this.customerRep = new HashMap<String, Customer>();
	}
	
	public static CustomerRepository getInstance() {
		if(instance == null){
			instance = new CustomerRepository();
		}
		return instance;
	}
	
	public void appendOrUpdateCustomer(Customer cs) {
		this.customerRep.put(cs.getId(), cs);
	}
	
	public Customer findCustomer(String id) {
		return this.customerRep.get(id);
	}

}

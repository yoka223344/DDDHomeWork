package com.tws.money;

public class CustomerService {
	
	public void appendCustomer(AddReceiverEvent event) {
		Customer cs = CustomerRepository.getInstance().findCustomer(event.getId());
		cs.appendReceiver(event.getReceiver());
		CustomerRepository.getInstance().appendOrUpdateCustomer(cs);		
	}
}

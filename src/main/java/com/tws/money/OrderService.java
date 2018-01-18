package com.tws.money;

import java.util.Map;

public class OrderService {
	
	public void createOrder(Order order) {
		if(order.getProducts().size() > 200) {
			return;
		}
		OrderRepository.getInstance().storeOrder(order);
	}
	
	public void payProcess(String id) {
		Order order = OrderRepository.getInstance().findOrder(id);
		if(order.changeToPay() == true){
			OrderRepository.getInstance().storeOrder(order);
		}
	}
	
	public void changeReceiverProcess(ChangeInfoEvent chngInfoEvent) {
		Receiver receiver = new Receiver(chngInfoEvent.getPhone(),
				chngInfoEvent.getAddress(), chngInfoEvent.getPhone());
		
		Order order = OrderRepository.getInstance().findOrder(chngInfoEvent.getOrderId());
		
		order.changeRceiver(receiver);
		
		OrderRepository.getInstance().storeOrder(order);
		
		
	} 
}

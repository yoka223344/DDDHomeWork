package com.tws.money;

import java.util.Map;
import java.util.UUID;

public class Order {
	private Map<String, Double> products;
	private String id;
	private IReceiver reciver;
	private ISendInfo sendInfo;
	private ICustomer customer;
	private Invoice invoice;
	private PayMent payment;
	private String status;
	
	public Order(Map<String, Double> products, IReceiver reciver, ISendInfo sendInfo, ICustomer customer,
			Invoice invoice, PayMent payment) {
		super();
		this.id = UUID.randomUUID().toString();
		this.products = products;
		this.reciver = reciver;
		this.sendInfo = sendInfo;
		this.customer = customer;
		this.invoice = invoice;
		this.payment = payment;
		this.status = "C";
	}
	
	public Order(Map<String, Double> prd, ICustomer customer) {
		this.id = UUID.randomUUID().toString();
		this.setProducts(prd);
		this.customer = customer;
		this.status = "C";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((invoice == null) ? 0 : invoice.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		result = prime * result + ((reciver == null) ? 0 : reciver.hashCode());
		result = prime * result + ((sendInfo == null) ? 0 : sendInfo.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (invoice == null) {
			if (other.invoice != null)
				return false;
		} else if (!invoice.equals(other.invoice))
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		if (reciver == null) {
			if (other.reciver != null)
				return false;
		} else if (!reciver.equals(other.reciver))
			return false;
		if (sendInfo == null) {
			if (other.sendInfo != null)
				return false;
		} else if (!sendInfo.equals(other.sendInfo))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	public Map<String, Double> getProducts() {
		return products;
	}
	public void setProducts(Map<String, Double> products) {
		this.products = products;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void changeRceiver(IReceiver receiver) {
		this.reciver = receiver;
	}
	
	public boolean changeToPay() {
		if(this.status.equals("C")){
			this.status = "P";
		} else {
			return false;
		}
		return true;
	}
	
}

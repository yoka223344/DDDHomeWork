package com.tws.money;

public class ChangeInfoEvent {
	private String orderId;
	public ChangeInfoEvent(String orderId, String phone, String address, String name) {
		super();
		this.orderId = orderId;
		this.phone = phone;
		this.address = address;
		this.name = name;
	}
	private String phone;
	private String address;
	private String name;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}

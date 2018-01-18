package com.tws.money;

public class AddReceiverEvent {
	private String id;
	private IReceiver receiver;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IReceiver getReceiver() {
		return receiver;
	}
	public void setReceiver(IReceiver receiver) {
		this.receiver = receiver;
	}
}

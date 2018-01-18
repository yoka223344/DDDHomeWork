package com.tws.money;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Customer implements ICustomer{
	
	private String id;
	
	private ArrayList<IReceiver> receivers;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;
	
	public Customer(String name) {
		this.id = UUID.randomUUID().toString();
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public void appendReceiver(IReceiver receiver) {
		receivers.add(receiver);
	}

}

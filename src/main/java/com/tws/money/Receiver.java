package com.tws.money;

public class Receiver implements IReceiver {
	
	private String phone;
	private String address;
	private String name;
	
	public Receiver(String phone, String address, String name) {
		this.phone = phone;
		this.address = address;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		Receiver other = (Receiver) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}

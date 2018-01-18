package com.tws.money;

public class PayMent {
	private String payMethod;
	private String payNum;
	public PayMent(String payNum,String payMethod) {
		// TODO Auto-generated constructor stub
		this.payNum = payNum;
		this.payMethod = payMethod;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public String getPayNum() {
		return payNum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payMethod == null) ? 0 : payMethod.hashCode());
		result = prime * result + ((payNum == null) ? 0 : payNum.hashCode());
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
		PayMent other = (PayMent) obj;
		if (payMethod == null) {
			if (other.payMethod != null)
				return false;
		} else if (!payMethod.equals(other.payMethod))
			return false;
		if (payNum == null) {
			if (other.payNum != null)
				return false;
		} else if (!payNum.equals(other.payNum))
			return false;
		return true;
	}
	
}
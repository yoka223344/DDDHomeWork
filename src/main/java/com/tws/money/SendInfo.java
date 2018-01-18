package com.tws.money;

public class SendInfo implements ISendInfo {

	private String type;
	private String mailId;
	private String mailTime;
	
	public SendInfo(String type, String mailId, String mailTime) {
		this.type = type;
		this.mailId = mailId;
		this.mailTime = mailTime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mailId == null) ? 0 : mailId.hashCode());
		result = prime * result + ((mailTime == null) ? 0 : mailTime.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		SendInfo other = (SendInfo) obj;
		if (mailId == null) {
			if (other.mailId != null)
				return false;
		} else if (!mailId.equals(other.mailId))
			return false;
		if (mailTime == null) {
			if (other.mailTime != null)
				return false;
		} else if (!mailTime.equals(other.mailTime))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	public String mailId() {
		// TODO Auto-generated method stub
		return mailId;
	}

	public String mailTime() {
		// TODO Auto-generated method stub
		return mailTime;
	}

}

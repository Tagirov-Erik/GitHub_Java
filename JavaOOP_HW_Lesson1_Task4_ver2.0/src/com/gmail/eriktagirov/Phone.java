package com.gmail.eriktagirov;

public class Phone {
	private int phoneId;
	private int phoneNum;
	
	public Phone(int phoneId, int phoneNum) {
		super();
		this.phoneId = phoneId;
		this.phoneNum = phoneNum;
	}

	public Phone() {
		super();
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void registerNetwork(Network a, Phone b) {
		int[] x = a.getNetworkPhones();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				x[i] = b.getPhoneNum();
				break;
			}
		}
		Network.setNetworkPhones(x);
	}
	
	public void call(int phoneNum) {
		if (phoneNum == this.phoneNum) {
			System.out.println("You are calling yourself!");
			return;
		}
		
		boolean isConnect = Network.isConnect(phoneNum);
		if (isConnect) {
			incomingCall(phoneNum);
		} else {
			System.out.println(phoneNum + " does not exist in this network!");
		}
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNum=" + phoneNum + "]";
	}
	
	public void incomingCall(int phoneNum) {
		System.out.println(this.phoneNum + " connecting " + phoneNum);
	}
	
	
}

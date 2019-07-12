package com.gmail.eriktagirov;

public class Phone {
	private int phoneId;
	private long phoneNum;
	private String phoneNetwork;
	
	public Phone() {
		
	}

	public Phone(int phoneId, long phoneNum, String phoneNetwork) {
		super();
		this.phoneId = phoneId;
		this.phoneNum = phoneNum;
		this.phoneNetwork = phoneNetwork;
	}
	
	public void registerNetwork(Network a, Phone b) {
		long[] x = a.getNetworkPhones();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				x[i] = b.getPhoneNum();
				break;
			}
		}
		a.setNetworkPhones(x);
	}
	
	public void call(long phoneNum, Network a, Phone b) {
		long[] x = a.getNetworkPhones();
		for (int i = 0; i < x.length; i++) {
			if (phoneNum == b.phoneNum) {
				System.out.println("This is your number!");
				break;
			} else if(x[i] == phoneNum) {
				System.out.println("Calling... Biiiip... Biiiip...");
				break;
			} else if (x[i] == 0) {
				System.out.println("Wrong number or call to another network!");
				break;
			}
			
		}
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPhoneNetwork() {
		return phoneNetwork;
	}

	public void setPhoneNetwork(String phoneNetwork) {
		this.phoneNetwork = phoneNetwork;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNum=" + phoneNum + ", phoneNetwork=" + phoneNetwork + "]";
	}
	
	
}

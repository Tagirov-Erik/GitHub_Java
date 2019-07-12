package com.gmail.eriktagirov;

import java.util.Arrays;

public class Network {
	private long[] networkPhones;
	
	public Network() {
		
	}
	
	public Network(long[] networkPhones) {
		super();
		this.networkPhones = networkPhones;
	}


	public long[] getNetworkPhones() {
		return networkPhones;
	}
	public void setNetworkPhones(long[] networkPhones) {
		this.networkPhones = networkPhones;
	}

	@Override
	public String toString() {
		return "Network [networkPhones=" + Arrays.toString(networkPhones) + "]";
	}	
	
	
}

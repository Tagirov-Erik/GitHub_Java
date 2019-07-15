package com.gmail.eriktagirov;

public class Network {
	private static int[] networkPhones = new int[10];
	
	public int[] getNetworkPhones() {
		return networkPhones;
	}

	public static void setNetworkPhones(int[] networkPhones) {
		Network.networkPhones = networkPhones;
	}

	public static boolean isConnect(int phoneNum) {
		boolean isConnect = false;
		for (int i = 0; i < networkPhones.length; i++) {
			if (networkPhones[i] == phoneNum) {
				isConnect = true;
			}
		}
		return isConnect;
	}
}

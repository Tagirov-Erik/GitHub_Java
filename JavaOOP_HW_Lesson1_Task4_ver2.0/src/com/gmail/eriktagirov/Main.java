package com.gmail.eriktagirov;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone(1, 1111111);
		Phone phone2 = new Phone(2, 2222222);
		Phone phone3 = new Phone(3, 3333333);
		Phone phone4 = new Phone(4, 4444444);
		Phone phone5 = new Phone(5, 5555555);
		Phone phone6 = new Phone(6, 5555555);
		
		Network network1 = new Network();
		
		Phone[] listPhones = {phone1, phone2, phone3 ,phone4, phone5, phone6};
		
		for (int i = 0; i < listPhones.length; i++) {
			listPhones[i].registerNetwork(network1, listPhones[i]);
		}
		
		System.out.println(Arrays.toString(network1.getNetworkPhones()));
		
		phone1.call(4444444);
		
	}
}

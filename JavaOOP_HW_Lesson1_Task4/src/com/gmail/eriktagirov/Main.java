package com.gmail.eriktagirov;

public class Main {

	public static void main(String[] args) {
		int maxAccount = 10;
		
		long[] accountsLife = new long[maxAccount];
		Network life = new Network(accountsLife);
		
		long[] accountsVodafone = new long[maxAccount];
		Network vodafon = new Network(accountsVodafone);
		
		long[] accountsMts = new long[maxAccount];
		Network mts = new Network(accountsMts);
		
		Phone erikPhone = new Phone(531, 5967888, "Life");
		Phone danaPhone = new Phone(932, 1537884, "Life");
		Phone mishaPhone = new Phone(157, 5558798, "Vodafon");
		Phone sashaPhone = new Phone(157, 5548798, "MTS");
		Phone lizaPhone = new Phone(157, 5558798, "Vodafon");
		
		erikPhone.registerNetwork(life, erikPhone);
		danaPhone.registerNetwork(life, danaPhone);
		mishaPhone.registerNetwork(vodafon, mishaPhone);
		sashaPhone.registerNetwork(mts, sashaPhone);
		lizaPhone.registerNetwork(vodafon, lizaPhone);
		
		System.out.println(life);
		System.out.println(vodafon);
		System.out.println(mts);
		
		System.out.println("Erik calling:");
		erikPhone.call(1537884, life, erikPhone);
		System.out.println("Dana calling:");
		danaPhone.call(5558798, life, danaPhone);
		System.out.println("Misha calling:");
		mishaPhone.call(5558798, vodafon, mishaPhone);
		System.out.println("Sasha calling:");
		sashaPhone.call(5967888, life, sashaPhone);
		System.out.println("Liza calling:");
		lizaPhone.call(5548798, vodafon, lizaPhone);
	}

}

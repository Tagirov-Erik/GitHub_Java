package com.gmail.eriktagirov;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat("Barsik", "Black", "Pers", 0.2);
		Cat catTwo = new Cat("Lyusya", "White", "Meyn-kun", 1);
		Cat catThree = new Cat("Dog", "Rude", "Sphynx", 3);
		Cat catFour = new Cat("Max", "Violet", "Blue russian", 0.5);
		Cat catFive = new Cat("Marusya", "Incomprehensible", "Pers", 0.7);
		
		Cat [] petShop = {catOne, catTwo, catThree, catFour, catFive};
		
		System.out.println("Masha want to feed and to pet Max!");
		
		for (int i = 0; i < petShop.length; i++) {
			if (petShop[i].getName() == "Max") {
				System.out.println("Max is " + petShop[3].getCondition());
				catFour.toFeed();
				catFour.toPet();
				System.out.println("Max is " + petShop[3].getCondition());
				break;
			}
		}
		
		System.out.println("Masha want to buy Marusya!");
		
		for (int i = 0; i < petShop.length; i++) {
			if (petShop[i].getName() == "Marusya") {
				if (petShop[i].getStatus() != "Sold out") {
					petShop[i].toSell();
					System.out.println("Ok, Masha. Take your new friend!");
				} else {
					System.out.println("Sorry, Masha. This pet is sold out!");
				}
			}
		}
		
		System.out.println("Katya want to buy Marusya!");
		for (int i = 0; i < petShop.length; i++) {
			if (petShop[i].getName() == "Marusya") {
				if (petShop[i].getStatus() != "Sold out") {
					petShop[i].toSell();
					System.out.println("Ok, Katya. Take your new friend!");
				} else {
					System.out.println("Sorry, Katya. This pet was sold out!");
				}
			}
		}
		
		System.out.println("Masha want to rename Marusya to Kleopatra!");
		for (int i = 0; i < petShop.length; i++) {
			if (petShop[i].getName() == "Marusya") {
				petShop[i].renameCat(petShop[i], "Kleopatra");
				System.out.println("Done! Your pet`s name is " + petShop[i].getName());
			}
		}
	}
}

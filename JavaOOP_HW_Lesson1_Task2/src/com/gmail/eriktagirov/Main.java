package com.gmail.eriktagirov;

public class Main {

	public static void main(String[] args) {
		Triangle trglOne = new Triangle(2, 3, 8);
		Triangle trglTwo = new Triangle(15, 10, 9);
		Triangle trglThree = new Triangle(11, 10, 14);
		
		trglOne.calculateArea();
		trglTwo.calculateArea();
		trglThree.calculateArea();
		
		Triangle[] triangles = {trglOne, trglTwo, trglThree};
		
		for (int i = 0; i < triangles.length; i++) {
			if (Double.isNaN(triangles[i].calculateArea())) {
				System.out.println("Triangle does not exist!");
			} else {
				System.out.println(triangles[i].calculateArea());
			}
		}
	}
}

package com.gmail.eriktagirov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MyException {
		Student stud1 = new Student("vasya", "oblomov", 20, "male", 0, 1, 3);
		Student stud2 = new Student("petya", "petrov", 20, "male", 1, 1, 3);
		Student stud3 = new Student("katya", "petrova", 19, "female", 2, 1, 2);
		Student stud4 = new Student("misha", "kosolapiy", 18, "male", 3, 1, 2);
		Student stud5 = new Student("dusya", "pusina", 21, "female", 4, 1, 4);
		Student stud6 = new Student("nyura", "dura", 21, "male", 5, 1, 3);
		Student stud7 = new Student("denis", "kazminskiy", 22, "male", 6, 1, 4);
		Student stud8 = new Student("denis", "bihus", 19, "male", 7, 1, 2);
		Student stud9 = new Student("katya", "silina", 21, "female", 8, 1, 3);
		Student stud10 = new Student("valya", "emelyanova", 22, "female", 9, 1, 5);
		Student stud11 = new Student();
		Student stud12 = new Student();
		Student stud13 = new Student();

		Student searchStudent = new Student();

		Group group1 = new Group();

		group1.addStudent(stud1);
		group1.addStudent(stud2);
		group1.addStudent(stud3);
		group1.addStudent(stud4);
		group1.addStudent(stud5);
		group1.addStudent(stud6);
		group1.addStudent(stud7);
		group1.addStudent(stud8);
		group1.addStudent(stud9);
		group1.addStudent(stud10);

		System.out.println("Unsorted");
		for (int i = 0; i < group1.getArrayStudent().length; i++) {
			System.out.println(group1.getArrayStudent()[i]);
		}

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of parameter you want to sort: ");
			System.out.println("1. Last name.");
			System.out.println("2. Gender.");
			System.out.println("3. Age.");
			int sortParameter = sc.nextInt();

			switch (sortParameter) {
			case 1:
				Arrays.sort(group1.getArrayStudent(), new SortByLastName());
				System.out.println();
				for (int i = 0; i < group1.getArrayStudent().length; i++) {
					System.out.println(group1.getArrayStudent()[i]);
				}
				break;
			case 2:
				Arrays.sort(group1.getArrayStudent(), new SortBySex());
				System.out.println();
				for (int i = 0; i < group1.getArrayStudent().length; i++) {
					System.out.println(group1.getArrayStudent()[i]);
				}
				break;
			case 3:
				Arrays.sort(group1.getArrayStudent(), new SortByAge());
				System.out.println();
				for (int i = 0; i < group1.getArrayStudent().length; i++) {
					System.out.println(group1.getArrayStudent()[i]);
				}
				break;
			default:
				break;
			}
		}
		
		System.out.println("Voenkom can recruit next student:");
		Student[] soldiers = group1.getSoldiers();
		for (int i = 0; i < soldiers.length; i++) {
			System.out.println(soldiers[i]);
		}
	}
}

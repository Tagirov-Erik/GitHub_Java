package com.gmail.eriktagirov;

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
		Student stud11 = new Student("andrey", "naumov", 19, "male", 10, 1, 3);
		Student stud12 = new Student("john", "dou", 25, "male", 11, 2, 5);
		Student stud13 = new Student("petya", "dou", 29, "male", 12, 2, 5);

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
		
		group1.delStudent(stud10);
		
//		group1.addStudent(stud11);	//uncomment both commentaries to check the exception of adding 11 student
//		group1.addStudent(stud13);
		
		System.out.println(group1.toString());

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input last name: ");
			String searchLastName = sc.nextLine();
			searchStudent = group1.searchByLastName(searchLastName);
			if (searchStudent.getFirstName() == null) {
				System.out.println("There is no such student in the database!");
			} else {
				searchStudent.viewInfo();
			}
		}
	}
}

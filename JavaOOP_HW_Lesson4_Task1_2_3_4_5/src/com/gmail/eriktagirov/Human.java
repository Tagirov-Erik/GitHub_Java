package com.gmail.eriktagirov;

public class Human {
	private String firstName;
	private String lastName;
	private int age;
	private String sex;
	
	public Human(String firstName, String lastName, int age, String sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void viewInfo() {
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("Sex: " + this.sex);
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", sex=" + sex + "]";
	}
}

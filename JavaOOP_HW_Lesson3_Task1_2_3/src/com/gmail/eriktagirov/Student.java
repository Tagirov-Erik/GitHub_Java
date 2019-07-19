package com.gmail.eriktagirov;

public class Student extends Human {
	private int studentID;
	private int groupNum;
	private int year;
	
	public Student(String firstName, String lastName, int age, String sex, int studentID, int groupNum, int year) {
		super(firstName, lastName, age, sex);
		this.studentID = studentID;
		this.groupNum = groupNum;
		this.year = year;
	}

	public Student(String firstName, String lastName, int age, String sex) {
		super(firstName, lastName, age, sex);
	}

	public Student() {
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void viewInfo() {
		System.out.println("StudentID: " + this.studentID);
		System.out.println("First name: " + this.getFirstName());
		System.out.println("Last name: " + this.getLastName());
		System.out.println("Group number: " + this.groupNum);
		System.out.println("Year education: " + this.year);
		System.out.println("Age: " + this.getAge());
		System.out.println("Sex: " + this.getSex());
	}
}

package com.gmail.eriktagirov;

import java.util.Arrays;

public class Group {
	private Student[] arrayStudent = new Student[10];

	public Group(Student[] arrayStudent) {
		super();
		this.arrayStudent = arrayStudent;
	}

	public Group() {
		super();
	}

	public void addStudent(Student student) throws MyException {
		int count = 0;

		for (int i = 0; i < arrayStudent.length; i++) {
			if (this.arrayStudent[i] != null) {
				count++;
			}
		}

		if (count == 10) {
			throw new MyException();
		}

		for (int i = 0; i < arrayStudent.length; i++) {
			if (this.arrayStudent[i] == null) {
				this.arrayStudent[i] = student;
				break;
			}
		}
	}

	public void delStudent(Student student) {
		for (int i = 0; i < arrayStudent.length; i++) {
			if (this.arrayStudent[i] == student) {
				this.arrayStudent[i] = null;
				break;
			}
		}
	}

	public Student searchByLastName(String lastName) {
		Student searchStudent = new Student();
		for (int i = 0; i < arrayStudent.length; i++) {
			if (this.arrayStudent[i] != null && this.arrayStudent[i].getLastName().equalsIgnoreCase(lastName)) {
				searchStudent = arrayStudent[i];
				break;
			}
		}
		return searchStudent;
	}

	@Override
	public String toString() {
		String[] studentsList = new String[10];
		String studentList = "";
		for (int i = 0; i < studentsList.length; i++) {
			if (this.arrayStudent[i] != null) {
				studentsList[i] = this.arrayStudent[i].getLastName() + " " + this.arrayStudent[i].getFirstName();
			} else {
				studentsList[i] = "";
			}
		}
		Arrays.sort(studentsList);
		for (int i = 0; i < studentsList.length; i++) {
			if (studentsList[i] != "" && i != 9) {
				studentList += studentsList[i] + ", ";
			}
			if (i == 9) {
				studentList += studentsList[i];
			}
		}
		return studentList;
	}
}

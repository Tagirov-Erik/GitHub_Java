package com.gmail.eriktagirov;

import java.util.Comparator;

public class SortBySex implements Comparator<Student> {
	@Override
	public int compare(Student std1, Student std2) {
		
		if (std1 != null && std2 == null) {
			return -1;
		}
		if (std1 == null && std2 != null) {
			return 1;
		}
		if (std1 == null && std2 == null) {
			return 0;
		}
		
		return std1.getSex().compareToIgnoreCase(std2.getSex());
	}
}

package com.gmail.eriktagirov;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		return "Too many students. Group is full.";
	}
}

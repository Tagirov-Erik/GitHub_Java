package com.gmail.eriktagirov;

public class Cat {
	private String name;
	private String color;
	private String breed;
	private String status = "Sale";
	private double age;
	private String condition = "Hungry";
	
	public Cat() {
		
	}
	
	public Cat(String name, String color, String breed, double age) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}
	
	public void toPet() {
		System.out.println("Mrrrrr");
	}
	
	public void toFeed() {
		this.condition = "Fed";
	}
	
	public void toSell() {
		this.status = "Sold out";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getCondition() {
		return condition;
	}
	
	public String getStatus() {
		return status;
	}
	
	Cat renameCat (Cat a, String newName) {
		a.name = newName;
		return a;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", breed=" + breed + ", status=" + status + ", age=" + age
				+ ", condition=" + condition + "]";
	}
	
}

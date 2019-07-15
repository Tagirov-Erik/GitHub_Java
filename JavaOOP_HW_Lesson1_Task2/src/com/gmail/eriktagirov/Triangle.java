package com.gmail.eriktagirov;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle() {
		
	}
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double calculateArea() {
		double p = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		return area;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}
	
}

package com.gmail.eriktagirov;

public class Vector3d {
	private double x;
	private double y;
	private double z;
	private double mult;
	
	public Vector3d() {
		
	}
	
	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3d summVectors(Vector3d a, Vector3d b) {
		Vector3d summOfVectors = new Vector3d();
		summOfVectors.x = a.x + b.x;
		summOfVectors.y = a.y + b.y;
		summOfVectors.z = a.z + b.z;
		return summOfVectors;
	}
	
	public void scalarMultiplication(Vector3d a, Vector3d b) {
		mult =  (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	
	public double getMult() {
		return mult;
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}

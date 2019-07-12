package com.gmail.eriktagirov;

public class Main {

	public static void main(String[] args) {
		Vector3d vectorOne = new Vector3d(5, 6, 4);
		Vector3d vectorTwo = new Vector3d(12, 3, 6);
		Vector3d resVector = new Vector3d();
		
		resVector = resVector.summVectors(vectorOne, vectorTwo);
		System.out.println("Sum of vectors One and Two is vector Three with next coordinates: (" + resVector.getX() + "," + resVector.getY() + "," + resVector.getZ() + ")");
		
		resVector.scalarMultiplication(vectorOne, vectorOne);
		System.out.println("Scalar multiplication of vectors One and Two is: " + resVector.getMult());
	}
}

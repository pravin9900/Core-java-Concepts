package org.java.concept;

public class MethodOverloadingExplanation {

	public void printInfo(String name, String vehicle) {
		System.out.println(name);
		System.out.println(vehicle);

	}

	public void printInfo(String vehicle, long mobileNum) {
		System.out.println(vehicle);
		System.out.println(mobileNum);
	}

	public void printInfo(String name, String vehicle, long mobileNum) {
		System.out.println(name);
		System.out.println(vehicle);
		System.out.println(mobileNum);
	}

	public static void main(String[] args) {
		MethodOverloadingExplanation moe = new MethodOverloadingExplanation();
		moe.printInfo("Pravin", "Bike");
		moe.printInfo("Bike", 8392534120l);
		moe.printInfo("Salunke", "Scooty", 27633973793l);
	}

}

package org.java.concept;

class GrandParent {
	int bikePrize = 1000;
	
	public void bike() {
		System.out.println("Grand Parent having Bike..");
	}
}

class Father extends GrandParent {
	int carPrize = 4000;
	public void car() {
		System.out.println("Father having Car..");
	}
}

class Son extends Father {
	
	int bycyclePrize = 1000;

	public void bycycle() {
		System.out.println("Son having bycycle..");
	}	 
}

public class InheritanceExplanation {

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("Total Asset : "+ (s.bikePrize+s.carPrize+s.bycyclePrize));
		s.bike();
		s.car();
		s.bycycle();
	}

}

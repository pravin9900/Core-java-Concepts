package org.java.concept;

public class StaticKeywordExplanation {

	static int a = 10;
	int b = 5;
	static {
		System.out.println("I am static block");
	}

	public void addition() {
		System.out.println(a + b);
	}

	public static void substraction() {
		StaticKeywordExplanation ske = new StaticKeywordExplanation();
		System.out.println(a - ske.b);
	}

	// inner class
	static class innerClass {

		static int c = 20;
		static int d = 2;

		public static void multiply() {
			System.out.println(c * d);
		}

		public static void division() {
			System.out.println(c / d);
		}

		static {
			System.out.println("I am inner static block");
		}
		public static void main(String[] args) {
			StaticKeywordExplanation sk = new StaticKeywordExplanation();
			sk.addition();
			StaticKeywordExplanation.substraction();
			multiply();
			division();

		}
	}

}

package org.java.concept;

public class SwitchStatement {

	public static void main(String[] args) {

		String str = "*";
		int a = 20;
		int b = 30;
		switch (str) {
		case "+":
			System.out.println(a + b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		default:
			System.out.println("Please  select Operator");
		}
	}
}

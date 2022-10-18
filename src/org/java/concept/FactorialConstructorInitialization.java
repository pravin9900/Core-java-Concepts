package org.java.concept;

public class FactorialConstructorInitialization {

	int num;

	public FactorialConstructorInitialization(int num) {
		this.num = num;
	}

	public int factorialOfNum() {
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		 return factorial;
	}

	public static void main(String[] args) {
		FactorialConstructorInitialization fact = new FactorialConstructorInitialization(5);
		System.out.println(fact.factorialOfNum());
	}
}

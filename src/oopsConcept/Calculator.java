package oopsConcept;

abstract class MyTest {
	public abstract void calculate();
}

class subclass1 extends MyTest {
	@Override
	public void calculate() {
		System.out.println("Addition");
	}
}

class subclass2 extends MyTest {
	@Override
	public void calculate() {
		System.out.println("Substraction");
	}
}

class subclass3 extends MyTest {
	@Override
	public void calculate() {
		System.out.println("Multiplication");
	}
}

public  class Calculator {
	 
	public static void main(String[] args) {
		subclass1 add = new subclass1();
		add.calculate();
		subclass2 sub = new subclass2();
		sub.calculate();
		subclass3 mul = new subclass3();
		mul.calculate();
		
	}
}
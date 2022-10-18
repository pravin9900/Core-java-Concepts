package org.java.concept;

class Father2 {

	int age;

	public Father2() {
		System.out.println("Father class Constructor");
	}

	public Father2(String name) {
		this();
		System.out.println("Father class Constructor : " + name);
	}

	public void fSleeping() {
		System.out.println("Father is sleeping...");
	}
}

class Son2 extends Father2 {
	int age;

	public Son2(int age) {
		super("Pravin");
		System.out.println("Son class Constructor");
		this.age = age;
		super.age = 50;
	}

	public void getSonAge() {
		System.out.println(age);
		System.out.println(super.age);
		super.fSleeping();
	}
}

public class SuperKeywordExplanation {

	public static void main(String[] args) {
		Son2 s = new Son2(45);
		s.getSonAge();

	}
}

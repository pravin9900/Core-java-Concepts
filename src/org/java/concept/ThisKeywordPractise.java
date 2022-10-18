package org.java.concept;

public class ThisKeywordPractise {

	int num ;
	public ThisKeywordPractise()
	{
		System.out.println("Default constructor");
	}
	public ThisKeywordPractise(int num)
	{
		this();
		this.num=num;
		System.out.println("parameterised constructor...");
	}
	
	public void method1()
	{
		System.out.println("method 1");
		this.method2();
	}
	public void method2()
	{
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		ThisKeywordPractise tk = new ThisKeywordPractise(40);
		tk.method1();
	}
}

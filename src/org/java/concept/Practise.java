package org.java.concept;

public class Practise {

	public Practise()
	{
		System.out.println("default");
	}
	public int m1()
	{
		int val =9;
		//System.out.println(val);
		return val;
	}
	public void m2()
	{
		System.out.println("M2");
	}
	public static void m3()
	{
		System.out.println("M3");
	}
	public static void main(String[] args) {
		Practise p = new Practise();
		System.out.println(p.m1());
		p.m2();
		Practise.m3();
	}
}

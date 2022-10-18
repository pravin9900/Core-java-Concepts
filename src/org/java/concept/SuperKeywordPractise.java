package org.java.concept;
class ParentClass{
	int num;
	 
	public ParentClass(int num)
	{
		 System.out.println("parent class constructor..");
		this.num=num;
	}
	public void printNum()
	{
		System.out.println("Super method :"+num);
		 
	}
	 
}
public class SuperKeywordPractise extends  ParentClass{
	public SuperKeywordPractise(int num) {
		super(num);
		 
	}
	public void method()
	{
		super.num=30;
		super.printNum();
	}
public static void main(String[] args) {
	SuperKeywordPractise s = new SuperKeywordPractise(45);
	s.method();
}
}

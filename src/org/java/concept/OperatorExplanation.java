package org.java.concept;

public class OperatorExplanation {

	public static void main(String[] args) {
		int a=10,b=20,c=31;
		//Addition
		int d = a+b+c;
		System.out.println("ADD : "+d);
		
		//Subtraction 
		int e = a-b-c;
		System.out.println("Sub : "+e);
		//Multiplication
		int f = a*b*c;
		System.out.println("Multiplication : "+f);
		//Division 
		int g = b/a;
		System.out.println("Division : "+g);
		//Reminder
		int h = c%a;
		System.out.println("Reminder : "+h);
		
		
		System.out.println("--------------------------");
		
		a+=10;//a=a+10
		System.out.println(a);
		b-=10;
		System.out.println(b);
		a*=2;
		System.out.println(a);
		c/=10;
		System.out.println(c);
		int i = 34;
		i%=6;
		System.out.println(i);
	}
}

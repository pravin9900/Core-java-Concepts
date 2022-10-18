package org.java.concept;

public class ControlStatementExplanation {

	public static void main(String[] args) {
		int num=10;
		int count = 0;
		while(num!=0)
		{
			num=num/2;
			if(num%2==0)
			{
				count = count + num;
			}
			//System.out.println(num);
		}
		System.out.println(count);
	}
}

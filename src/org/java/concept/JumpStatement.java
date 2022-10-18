package org.java.concept;

public class JumpStatement {

	public static void main(String[] args) {
		
		for(int i=0;i<=20;i++)
		{
			if(i%2!=0)
				{continue;}
			else if(i/8!=0)
			{
				break;
			}
			System.out.println(i);
		}
	}
}

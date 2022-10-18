package org.java.concept;

public class StudentIfStatementExplanation {

	
	public static void main(String[] args) {
		int math=10;
		int eng=6;
		int history=7;
		int science=5;
		int marathi=3;
		int som =8;
		
		int sum = math+eng+history+science+marathi+som;
		int avg = sum/6;
		
		if(avg>=9)
		{
			System.out.println("First-class distinction");
		}else if(avg>=6)
		{
			System.out.println("First-Class");
		}else if(avg>=5)
		{
			System.out.println("Second-Class");
		}else
		{
			System.out.println("Fail");
		}
	}
	
	
}

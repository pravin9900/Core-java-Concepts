package realTimeQue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentMarks {

	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer>  average = new HashMap<String, Integer>();
	static Map<String, String>  grade1 = new HashMap<String, String>();
	public static void studentDetails()
	{
 
			System.out.println("Enter student name :");
			String name = sc.next();
			System.out.println("Enter English sub marks :");
			int eng = sc.nextInt();
			System.out.println("Enter Math sub marks : ");
			int math = sc.nextInt();
			System.out.println("Enter science sub marks : ");
			int science = sc.nextInt();
			System.out.println("Enter marathi sub marks : ");
			int marathi = sc.nextInt();
			System.out.println("Enter java sub marks : ");
			int java = sc.nextInt();
			System.out.println("Enter python sub marks : ");
			int python = sc.nextInt();
			int avg = (eng + math + science + marathi + java + python) / 6;
			 average.put(name, avg);
			String grade ;
			if(avg >=80)
			{
				grade="A";
			}else if(avg>=65)
			{
				grade = "B";
			}else
			{
				grade = "C";
			}
			grade1.put(name, grade);
		}
		
		
	
	public static void main(String[] args) {
		System.out.println("Enter no of student :");
		int noOfStudent = sc.nextInt();
		for(int i=1;i<=noOfStudent;i++)	
		{
			studentDetails();
		}
		
		System.out.println("Enter student name :");
		String name = sc.next();
		for(Map.Entry m : average.entrySet() )
		{
			if(m.getKey().equals( name))
			{
				System.out.println(m.getKey()+" having average marks :: "+m.getValue());
			}
			
		}
		for(Map.Entry m : grade1.entrySet() )
		{
			if(m.getKey().equals(name))
			{
				System.out.println( "Grade :: "+m.getValue());
			}
			
		}
		
		sc.close();
	}
}






 
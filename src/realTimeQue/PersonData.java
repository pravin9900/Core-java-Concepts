package realTimeQue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonData {

	public void dataOfPerson()
	{
		Scanner sc = new Scanner(System.in);
		Map<String,List<String>> data = new HashMap<String, List<String>>();
		
		List<String> person1 = new ArrayList<String>();
		person1.add( "Name : Pravin salunke");
		person1.add("Age : 23");
		person1.add("DOB : 19/12/1999");
		person1.add("Highest degree : 11 th");
		person1.add("Profession : Tester");
		person1.add("Address : Latur");
		
		List<String> person2 = new ArrayList<String>();
		person2.add( "Name : Vishwas mahajan");
		person2.add("Age : 24");
		person2.add("DOB : 10/04/1998");
		person2.add("Highest degree : 16 th");
		person2.add("Profession : Developer");
		person2.add("Address : Jalna");
		
		
		data.put("salunke", person1);
		data.put("mahajan", person2);
		System.out.println("Enter person last name to get details :");
		String input = sc.next();
		System.out.println(data.get(input));
	 
		String edu = null;
		System.out.println("Enter person :");
		String person = sc.next();
		if(person.equals("person1"))
		{
			String info[] = person1.get(3).split(" ");
			edu = info[3];
		}
		else if(person.equals("person2"))
		{
			String info[] = person2.get(3).split(" ");
			edu = info[3];
		}	
		
		int ed = Integer.parseInt(edu);
		if(ed<=12)
		{
			System.out.println("Government has to register the data");
		}
	}
	public static void main(String[] args) {
		PersonData p = new PersonData();
		p.dataOfPerson();
	}
}

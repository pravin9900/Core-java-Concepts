package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExplanation {

	public static void main(String[] args) {
		Map<Integer, String> studentDetails = new HashMap<Integer, String>();
		studentDetails.put(1, "Pravin,19/12/1999,Latur");
		studentDetails.put(2, "Vishwas,12/6/1998,Akola");
		studentDetails.put(3, "Nilay,25/7/1997,Pune");
		studentDetails.put(4, "Akash,20/8/1998,Mumbai");
		
		for(Map.Entry<Integer, String> me : studentDetails.entrySet())
		{
			System.out.println(me.getKey()+" : ");
			String [] detail = me.getValue().split(",");
			System.out.println("Name    : "+detail[0]);
			System.out.println("DOB     : "+detail[1]);
			System.out.println("Address : "+detail[2]);
		}
	}
}

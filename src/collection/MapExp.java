package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExp {

	public static void main(String[] args) {
		Map<Integer, List<String>> studentDetails = new HashMap<Integer, List<String>>();

		List<String> st1 = new ArrayList<String>();
		st1.add("Pravin");
		st1.add("19/12/1999");
		st1.add("Latur");
		List<String> st2 = new ArrayList<String>();
		st2.add("Vishwas");
		st2.add("10/1/1998");
		st2.add("Akola");
		List<String> st3 = new ArrayList<String>();
		st3.add("Nilay");
		st3.add("20/2/1996");
		st3.add("Pune");
		List<String> st4 = new ArrayList<String>();
		st4.add("Akash");
		st4.add("4/7/1998");
		st4.add("Mumbai");
		List<String> st5 = new ArrayList<String>();
		st5.add("Bhagyashri");
		st5.add("10/8/1997");
		st5.add("Nagpur");
		studentDetails.put(101, st1);
		studentDetails.put(102, st2);
		studentDetails.put(103, st3);
		studentDetails.put(104, st4);
		studentDetails.put(105, st5);
		System.out.println("Roll No " + "\t" + "Name" + "\t" + "DOB" + "\t" + "Address");
		
		for (Map.Entry<Integer, List<String>> me : studentDetails.entrySet()) {
			List<String> de = me.getValue();
			System.out.println(me.getKey() + "\t" + de.get(0) + "\t" + de.get(1) + "\t" + de.get(2));
		}

	}
}

package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookMapExp {

	public static void main(String[] args) {
		Map<String, List<String>> library = new HashMap<String, List<String>>();

		List<String> book1 = new ArrayList<String>();
		book1.add("English");
		book1.add("2015");
		book1.add("499");
		book1.add("201");

		List<String> book2 = new ArrayList<String>();
		book2.add("Marathi");
		book2.add("2019");
		book2.add("299");
		book2.add("150");

		List<String> book3 = new ArrayList<String>();
		book3.add("Math");
		book3.add("2018");
		book3.add("399");
		book3.add("300");

		List<String> book4 = new ArrayList<String>();
		book4.add("Scince");
		book4.add("2017");
		book4.add("999");
		book4.add("280");

		library.put("Pravin", book1);
		library.put("Vishwas", book2);
		library.put("Bhagyashri", book3);
		library.put("Nilay", book4);
		System.out.println("Authour" + "\t" + "Book Name" + "\t" + "Edition" + "\t" + "Cost" + "\t" + "No of pages");
		for (Map.Entry<String, List<String>> m : library.entrySet()) {
			List<String> list = m.getValue();
			System.out.println(
					m.getKey() + "\t" + list.get(0) + "\t" + list.get(1) + "\t" + list.get(2) + "\t" + list.get(3));
		}

	}
}

package collectionPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(40);
		list.add(10);
		list.add(70);
		list.add(80);
		list.add(50);
		list.add(90);
		
		Comparator  comp = Collections.reverseOrder();
		
		list.sort(comp);
		System.out.println(list);
		
	}
}

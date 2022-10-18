package collectionPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);		

		Collections.reverse(list);
		System.out.println(list);
	}
}

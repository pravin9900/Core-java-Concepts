package collectionPractise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(16);
		list.add(13);
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(16);
		
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		
		System.out.println(list);
		
		
	}
}

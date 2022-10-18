package mockQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		Integer a[]= { 2,6,90,73,26,13, 2,3,4,6,90};
	 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		
		ArrayList<Integer> li = new ArrayList<Integer>(set);
		System.out.println(li);
	}
}

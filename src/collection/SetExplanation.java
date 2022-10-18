package collection;

import java.util.*;

public class SetExplanation {
	
	public static void main(String[] args) {
		Set<String> student = new HashSet<String>();
		student.add("Pravin");
		student.add("Vishwas");
		student.add("Nilay");
		student.add("Pravin");
		student.add("Vishwas");
		Iterator itr = student.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		List<String> employeeName = new ArrayList<String>();
		employeeName.add("Kiran");
		employeeName.add("Abhi");
		employeeName.add("Nilay");
		student.addAll(employeeName);
	 
		student.remove("Vishwas");
		student.removeAll(employeeName);
		System.out.println(student.contains("Pravin"));
		System.out.println(student);
		student.clear();
		System.out.println(student);
		System.out.println(student.isEmpty());
	}

}

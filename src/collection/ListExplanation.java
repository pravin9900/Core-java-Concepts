package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExplanation {
	
	static double budget = 20000;
	public static void main(String[] args) {
		List<Integer> employeeSalary = new ArrayList<Integer>();
		employeeSalary.add(1000);
		employeeSalary.add(2000);
		employeeSalary.add(3000);
		employeeSalary.add(500);
		List<String> employeeName = new ArrayList<String>();
		employeeName.add("Pravin");
		employeeName.add("Vishwas");
		employeeName.add("Nilay");
		employeeName.add("readdy");
		 
		for (int j = 0; j <  employeeSalary.size(); j++) {
			System.out.println(employeeName.get(j)+" : "+employeeSalary.get(j));
			budget = budget-employeeSalary.get(j);
		}
		System.out.println("Remaining budget : "+budget);
			
		 
		
	}

}

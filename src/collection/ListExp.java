package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExp {

	static double budget = 20000;
	public static void main(String[] args) {
		List<String> employeeSalary = new ArrayList<String>();
		employeeSalary.add("Pravin :1000");
		employeeSalary.add("Vishwas :2000");
		employeeSalary.add("Nilay :3000");
		employeeSalary.add("readdy :4000");
		
		for (int j = 0; j <  employeeSalary.size(); j++) {
			System.out.println(employeeSalary.get(j));
			 String[] salary1 = employeeSalary.get(j).split(":");
			 double salary = Integer.parseInt(salary1[1]);
			 budget = budget - salary;
		}
		System.out.println("Remaining budget : "+budget);
	}
}

package collectionPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
 

public class MainClass {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Pravin",23,"Male","IT"));
		emp.add(new Employee("Pooja",28,"Female","HR"));
		emp.add(new Employee("Priya",26,"Female","IT"));
		emp.add(new Employee("Kiran",30,"Male","HR"));
		
		emp.stream().map(Employee :: getDepartment).distinct().forEach(System.out :: println);
		
		Map<String, Double> obj = emp.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.averagingLong(Employee :: getAge)));
		System.out.println(obj);
		
		
	}
}

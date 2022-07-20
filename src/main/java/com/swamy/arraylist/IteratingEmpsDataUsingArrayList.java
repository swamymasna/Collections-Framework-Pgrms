package com.swamy.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingEmpsDataUsingArrayList {

	public static void main(String[] args) {

		// ArrayList Using Employee class
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(100, "swamy", 200000.00));
		employees.add(new Employee(200, "ntr", 300000.00));
		employees.add(new Employee(300, "venkatesh", 400000.00));
		employees.add(new Employee(400, "vijay", 500000.00));
		System.out.println("\n Emps Data : " + employees);

		// for loop //Traditional way
		System.out.println("\n*********for loop-Traditional way*********");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}

		// enhanced for-each loop
		System.out.println("\n*********enhanced for-each loop*********");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		// Using Java8 for each loop
		System.out.println("\n*********Using Java8 for each loop*********");
		employees.forEach(emp -> System.out.println(emp));

		// Using Java8 for each with Streams
		System.out.println("\n*********Using Java8 for each with Streams*********");
		employees.stream().forEach(emp -> System.out.println(emp));

		// Using Java8 for each + streams + method reference
		System.out.println("\n*********Using Java8 for each + streams + method reference*********");
		employees.stream().forEach(System.out::println);
	}
}

package com.swamy.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingEmpInArrayList {

	public static void main(String[] args) {

		// ArrayList Using Employee class
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(100, "swamy", 200000.00));
		employees.add(new Employee(200, "ntr", 300000.00));
		employees.add(new Employee(300, "venkatesh", 400000.00));
		employees.add(new Employee(400, "vijay", 500000.00));
		System.out.println("\n Emps Data : " + employees);

		// Sorting Operation - Traditional Way
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId() - o2.getEmpId();
			}
		});
		System.out.println("\nTraditional Way : " + employees);

		// Performing Sorting Operation using Java8 Lambda Expressions
		Collections.sort(employees, (o1, o2) -> o1.getEmpId() - o2.getEmpId());
		System.out.println("\nUsing Lambda Expressions ASC: " + employees); // Ascending Order

		// Performing Sorting Operation using Java8 Lambda Expressions
		Collections.sort(employees, (o1, o2) -> o2.getEmpId() - o1.getEmpId());
		System.out.println("\nUsing Lambda Expressions DSC: " + employees); // Descending Order

	}
}

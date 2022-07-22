package com.swamy.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingInLinkedList {

	public static void main(String[] args) {

		List<Employee> employees = new LinkedList<>();
		employees.add(new Employee(100, "swamy", 56000.00));
		employees.add(new Employee(101, "kiran", 92000.00));
		employees.add(new Employee(102, "tarak", 57000.00));
		System.out.println(employees);

//		Collections.sort(employees, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o2.getEmpId() - o1.getEmpId();
//			}
//		});

		Collections.sort(employees, (o1,o2)->o2.getEmpId() - o1.getEmpId());
		
		System.out.println(employees);
	}
}


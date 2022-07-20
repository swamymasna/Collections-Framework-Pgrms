package com.swamy.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
	private Integer empId;
	private String empName;
	private Double empSal;
}

public class ComparatorTest {

	public static void main(String[] args) {
		List<Employee>list = new ArrayList<>();
		list.add(new Employee(103, "Swamy", 56000.00));
		list.add(new Employee(100, "Tarak", 69000.00));
		list.add(new Employee(102, "Krishna", 74000.00));

		System.out.println("\n********Before Sorting********");
		list.forEach(System.out::println);
		
		Comparator<Employee> comparing = Comparator.comparing(Employee::getEmpId);
		Collections.sort(list, comparing);

		//Collections.sort(list, (o1, o2) -> o1.getEmpId() - o2.getEmpId());
		
		
		System.out.println("\n********After Sorting********");
		list.forEach(System.out::println);
	}
}

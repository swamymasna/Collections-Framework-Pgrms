package com.swamy.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee implements Comparable<Employee> {

	private Integer empId;
	private String empName;
	private Double empSal;

	@Override
	public int compareTo(Employee employee) {

		if (empId == employee.getEmpId()) {
			return 0;
		} else if (empId > employee.getEmpId()) {
			return 1;
		}

		return -1;

		// return empId.compareTo(employee.empId);
	}
}

public class ComparableTest {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(103, "Swamy", 56000.00));
		list.add(new Employee(101, "Tarak", 69000.00));
		list.add(new Employee(102, "Krishna", 74000.00));

		System.out.println("\n********Before Sorting********");
		list.forEach(System.out::println);

		System.out.println("\n********After Sorting********");
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}

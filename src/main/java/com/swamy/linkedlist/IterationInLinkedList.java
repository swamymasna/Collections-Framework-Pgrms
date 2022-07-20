package com.swamy.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterationInLinkedList {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("num1");
		list.add("num2");
		list.add("num3");
		list.add("num4");

		// for loop
		System.out.println("\n******for loop******");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// enhanced for loop
		System.out.println("\n******enhanced for loop******");
		for (String data : list) {
			System.out.println(data);
		}

		// using iterator with while loop
		System.out.println("\n******using iterator with while loop******");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String data = (String) iterator.next();
			System.out.println(data);
		}

		// using Java8 foreach loop
		System.out.println("\n******using Java8 foreach loop******");
		list.forEach(data -> System.out.println(data));

		// using Java8 foreach loop + streams
		System.out.println("\n******using Java8 foreach loop + streams******");
		list.stream().forEach(data -> System.out.println(data));

		// using Java8 foreach loop + streams + method ref
		System.out.println("\n******using Java8 foreach loop + streams + method ref******");
		list.stream().forEach(System.out::println);
	}
}

package com.swamy.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// Duplicates are not allowed
		// Not maintaining Insertion order
		// Allows NULL values
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add(null);
		System.out.println(fruits);

		Set<String> flowers = new HashSet<>(fruits);
		Set<String> setElements = new HashSet<>();
		setElements.add("Rose");
		setElements.add("Jasmine");
		setElements.addAll(flowers);
		System.out.println(setElements);

		// **Iterations**

		Set<String> set = new HashSet<>();
		set.add("January");
		set.add("February");
		set.add("March");
		System.out.println(set);

		// enhanced for-each loop
		System.out.println("\n*******enhanced for-each loop*******");
		for (String data : set) {
			System.out.println(data);
		}

		// using iterator
		System.out.println("\n*******using iterator*******");
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String data = iterator.next();
			System.out.println(data);
		}

		// using iterator with while loop
		System.out.println("\n*******using iterator with while loop*******");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String data = (String) iterator.next();
			System.out.println(data);
		}

		// java8 forEach + Lambda Exp
		System.out.println("\n*******java8 forEach + Lambda Exp*******");
		set.forEach(data -> System.out.println(data));

		// java8 forEach + Lambda Exp + Streams
		System.out.println("\n*******java8 forEach + Lambda Exp + Streams *******");
		set.stream().forEach(data -> System.out.println(data));

		// java8 forEach + Lambda Exp + Streams + Method Ref
		System.out.println("\n*******java8 forEach + Lambda Exp + Method Ref *******");
		set.forEach(System.out::println);
		
		set.clear();
		System.out.println(set);
	}
}


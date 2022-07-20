package com.swamy.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {

		// allows NULL values
		// duplicates not allowed
		Set<String>set = new LinkedHashSet<>();
		set.add("Apple");
		set.add(null);
		set.add("Apple");
		set.add("Banana");
		System.out.println(set);
		
		set.forEach(System.out::println);

		Set<String>setData = new LinkedHashSet<>(set);
		
		Set<String>setElements = new LinkedHashSet<>();
		setElements.add("Rose");
		setElements.add("Lilly");
		setElements.addAll(setData);
		System.out.println(setElements);
	}
}

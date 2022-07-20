package com.swamy.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		SortedSet<String>set = new TreeSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		System.out.println(set);
		
		String first = set.first();
		System.out.println("First Element : " + first);
		
		String last = set.last();
		System.out.println("Last Element : " + last);
		
		System.out.println("\n******Java8 Lambda Exp******");
		set.forEach(data -> System.out.println(data));
		
		System.out.println("\n******Java8 Lambda Exp + Streams******");
		set.stream().forEach(data -> System.out.println(data));
		
		System.out.println("\n******Java8 Lambda Exp + Streams + Method ref******");
		set.stream().forEach(System.out::println);
	}
}



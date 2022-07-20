package com.swamy.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// we can add duplicate elements
		List<String>list = new ArrayList<>();
		list.add("Element1");
		list.add("Element1");
		System.out.println("\n List Data : " + list);
		
		// we can add Null values also
		list.add(null);
		list.add(null);
		System.out.println("\n List Data : " + list);
		
		// ArrayList maintains Insertion Order
		List<Integer>numbers = new ArrayList<>();
		numbers.add(1);  
		numbers.add(3);  
		numbers.add(2);  
		System.out.println("\n Numbers : " + numbers);
		
		//Remove Operations
		System.out.println("******Remove Operations******");
		List<String>subs = new ArrayList<>();
		subs.add("Java");	//index: 0
		subs.add("SpringBoot");	//index: 1
		subs.add("Microservices");	//index: 2
		subs.add("Oracle");	//index: 3
		subs.add("ReactJS");	//index: 4

		System.out.println(" Subjects are: "+ subs);
		
		subs.remove(2);
		System.out.println(" Subjects After Remove Operation : "+ subs);
		
		subs.remove("SpringBoot");
		System.out.println(" Subjects After Removed SpringBoot : "+ subs);
		
		subs.removeAll(subs);
		System.out.println(" Subjects After removeAll() : "+ subs);
		
		subs.add("Hibernate");
		subs.add("RestfulServices");
		subs.add("Aws");
		System.out.println("Again Added Subs" + subs);
		
		subs.clear();
		System.out.println("Subs after clear() : " + subs);
		
		// Access the Elements from an ArrayList
		List<String>fruits = new ArrayList<>();
		fruits.add("banana");  //index: 0
		fruits.add("grapes");  //index: 1
		fruits.add("pineapple");  //index: 2
		System.out.println("\n Fruits Data : " + fruits);
		
		System.out.println(fruits.get(1)); //grapes
		
		//Adding the Elements using Index
		fruits.add(0, "APPLE");
		System.out.println(fruits);
		
		Collections.sort(fruits);
		System.out.println("ASC : " + fruits);
		
		Collections.reverse(fruits);
		System.out.println("DSC : " + fruits);

		List<Integer>first3EvenNumbers = new ArrayList<>();
		first3EvenNumbers.add(2);
		first3EvenNumbers.add(4);
		first3EvenNumbers.add(6);
		System.out.println(first3EvenNumbers);
		
		List<Integer>Next3EvenNumbers = new ArrayList<>(first3EvenNumbers);

		List<Integer>allEvenNumbers = new ArrayList<>();
		allEvenNumbers.add(8);
		allEvenNumbers.add(10);
		allEvenNumbers.add(12);
		allEvenNumbers.addAll(Next3EvenNumbers);
		System.out.println(allEvenNumbers);

		
	}
}







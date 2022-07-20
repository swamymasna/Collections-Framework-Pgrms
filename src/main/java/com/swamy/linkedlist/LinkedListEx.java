package com.swamy.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		//It allows Duplicates + nulls + Insertion Order
		List<String>fruits = new LinkedList<>();
		fruits.add("banana"); //0
		fruits.add("apple"); //1
		fruits.add("mango"); //2
		fruits.add("mango"); //3
		fruits.add(null);
		System.out.println("Fruits: " + fruits);
		
		fruits.add(4, "pineapple");
		System.out.println("Added Pineapple : " + fruits);
		
		boolean flag = fruits.contains("apple");
		System.out.println("Is Contains: " + flag);
		
		String fruit = fruits.get(3);
		System.out.println(fruit);

		int lastIndexOf = fruits.lastIndexOf("mango");
		System.out.println("lastIndex val : " + lastIndexOf);

		String remove = fruits.remove(0);
		System.out.println("removed 1st index val : " + remove);
		
		boolean remove2 = fruits.remove("apple");
		System.out.println("removed apple fruit : " + remove2);
		
		fruits.clear();
		System.out.println("clear() : " + fruits);

		
		List<String>first3days = new LinkedList<>();
		first3days.add("sunday");
		first3days.add("monday");
		first3days.add("tuesday");
		System.out.println(first3days);
		
		List<String>last4days = new LinkedList<>(first3days);
		List<String>weekDays = new LinkedList<>();
		weekDays.add("wednessday");
		weekDays.add("thurseday");
		weekDays.add("friday");
		weekDays.add("saturday");
		weekDays.addAll(last4days);
		System.out.println(weekDays);
	}
}







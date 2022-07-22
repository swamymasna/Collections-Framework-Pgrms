package com.swamy.list.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		// Allows Duplicate Elements 
		// Maintaining Insertion Order
		// Allows null values also
		Vector<String> vector = new Vector<>();
		vector.add("Apple"); //0
		vector.add("Banana"); //1
		vector.add("Mango"); //2
		vector.add("Mango"); //3
		vector.add(null); //4
		System.out.println(vector);
		
		vector.add(3, "Pineapple");
		System.out.println("Added Pineapple : " + vector);
		
		boolean flag = vector.contains("Apple");
		System.out.println("Is Vector Contains an Apple : " + flag);
		
		String firstElement = vector.firstElement();
		System.out.println(firstElement);
		
		String val = vector.get(2);
		System.out.println(val);
		
		String elementAt = vector.elementAt(1);
		System.out.println(elementAt);

		Vector<String> v = new Vector<>();
		v.add("R_Fruit");
		boolean retainAll = vector.retainAll(v);
		System.out.println(retainAll);
		
		//Adding data to Vector.
		vector.add("Element1");
		vector.add("Element2");
		vector.add("Element3");
		System.out.println(vector);
		
		System.out.println("\n***using iterator***");
		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			String data = (String) iterator.next();
			System.out.println(data);
		}
		
		System.out.println("\n*****Using Java8 Lambda Exp *****");
		vector.forEach(data -> System.out.println(data));
		
		System.out.println("\n*****Using Java8 Lambda Exp + streams*****");
		vector.stream().forEach(data -> System.out.println(data));

		System.out.println("\n*****Using Java8 Lambda Exp + streams + method ref *****");
		vector.stream().forEach(System.out::println);
		
		Vector<Integer>first2BaseNums = new Vector<>();
		first2BaseNums.add(1);
		first2BaseNums.add(3);
		System.out.println(first2BaseNums);
		
		Vector<Integer>next3BaseNums = new Vector<>(first2BaseNums);
		Vector<Integer>baseNums = new Vector<>();
		baseNums.add(5);
		baseNums.add(7);
		baseNums.add(9);
		baseNums.addAll(next3BaseNums);
		System.out.println(baseNums);
		
	}
}


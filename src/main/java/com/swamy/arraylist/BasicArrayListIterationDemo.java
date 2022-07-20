package com.swamy.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicArrayListIterationDemo {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		System.out.println(list);
		
		//basic for loop
		System.out.println("\n****basic for loop****");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Enhanced for-each loop
		System.out.println("\n****Enhanced for-each loop****");
		for (String data : list) {
			System.out.println(data);
		}
		
		//Using Traditional Iterator
		System.out.println("\n****Using Traditional Iterator****");
		for(Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String data = iterator.next();
			System.out.println(data);
		}
		
		//Iterator with while loop
		System.out.println("\n****Iterator with while loop****");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String result = (String) iterator.next();
			System.out.println(result);
		}
		
		//java8 for-each loop
		System.out.println("\n****java8 for-each loop****");
		list.forEach(emps -> System.out.println(emps));
		
		//Java8 for-each + streams
		System.out.println("\n****Java8 for-each + streams****");
		list.stream().forEach(emps -> System.out.println(emps));
		
		//Java8 for-each + streams + method reference
		System.out.println("\n****Java8 for-each + streams + method reference****");
		list.stream().forEach(System.out::println);
	}
}







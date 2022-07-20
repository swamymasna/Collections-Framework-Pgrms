package com.swamy.collection.intrface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {

	public static void main(String[] args) {
		
		Collection<String>collection = new ArrayList<String>();
		collection.add("Banana");
		collection.add("Apple");
		collection.add("Pineapple");
		collection.add("Grapes");
		System.out.println(collection); //[Banana, Apple, Pineapple, Grapes]
		
		System.out.println(collection.contains("Apple")); //True
		System.out.println(collection.contains("Mango")); //False

		collection.forEach((data)->{
			System.out.println(data);
		});

		// collection.forEach(System.out::println);
		
		System.out.println(collection.isEmpty()); //false
		System.out.println(!collection.isEmpty()); //true

		System.out.println(collection); //[Banana, Apple, Pineapple, Grapes]
		collection.remove("Apple");
		System.out.println(collection); //[Banana, Pineapple, Grapes]
		
		collection.clear();
		System.out.println(collection); // []
	}
}





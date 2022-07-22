package com.swamy.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Duplicate Keys are Not Allowed
		// Not Maintaining Insertion Order
		// Allows Nulls also.
		Map<Integer, String>map = new HashMap<>();
		map.put(1, "Val-1");
		map.put(2, "Val-2");
		map.put(3, "Val-3");
		map.put(4, null);
		map.put(null, null);
		System.out.println(map);
		
		String val1 = map.get(1);
		System.out.println(val1);
		
		boolean result = map.isEmpty();
		System.out.println("Is Map Empty : " + result);
		
		Set<Integer> keySet = map.keySet();
		System.out.println("Keys are: " + keySet);
		

		//Merging
		Map<Integer, Integer>mapNums = new HashMap<>();
		
//		mapNums.merge(1, 20, new BiFunction<Integer,Integer,Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				return t+u;
//			}
//		});
//		System.out.println(mapNums);
		
		//Using Java8 Lambda Expressions
		mapNums.merge(1, 15, (t, u) ->(t+u));
		
		System.out.println(mapNums);
		
		//-------------------------------------------//
		mapNums.compute(1, new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t*u;
			}
		});
		System.out.println("H"+mapNums);

		//-------------------------------------------//
		Map<Integer, String>mapFruits = new HashMap<>();
		mapFruits.put(1, "Mango");
		mapFruits.put(2, "Banana");
		mapFruits.put(3, "Grapes");
		System.out.println(mapFruits);
		
		mapFruits.replace(1, "Pineapple");
		System.out.println(mapFruits);
		
		mapFruits.replace(2, "Banana", "Watermelon");
		System.out.println(mapFruits);
		
		Collection<String> values = mapFruits.values();
		System.out.println(values);

		int size = mapFruits.size();
		System.out.println(size);

		boolean containsKey = mapFruits.containsKey(1);
		System.out.println(containsKey);
		
		boolean containsValue = mapFruits.containsValue("Grapes");
		System.out.println(containsValue);
		
		//------Using Java8 Lambda Expressions-----------------//
		mapFruits.forEach((k,v) -> System.out.println(k + " - "+ v));

	}
}

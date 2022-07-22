package com.swamy.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {

		//Duplicate Keys are not allowed
		// allowed one null key and multiple null values
		// Maintaining Insertion Order
		Map<Integer,String>map = new LinkedHashMap<>();
		map.put(1, "A");
		map.put(1, "B");
		map.put(2, null);
		map.put(2, null);
		map.put(3, null);
		map.put(null, null);
		System.out.println(map);
		
		map.forEach((k, v)->System.out.println(k +" - "+ v));
	}
}



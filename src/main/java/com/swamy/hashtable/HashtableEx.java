package com.swamy.hashtable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashtableEx {

	public static void main(String[] args) {

		// Duplicates are Not Allowed
		// Key and Values should not be null
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1, "V-1");
		map.put(2, "V-2");
		map.put(5, "V-3");
		map.put(5, "V-3");
		System.out.println(map);
		
		map.forEach((t, u) -> System.out.println(t +" - "+ u));
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		String val = map.get(2);
		System.out.println(val);
		
		boolean isEmpty = map.isEmpty();
		System.out.println(isEmpty);
		
		map.replace(1, "HELLO");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
	}
}







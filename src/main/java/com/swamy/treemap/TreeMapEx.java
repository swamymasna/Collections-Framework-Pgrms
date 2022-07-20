package com.swamy.treemap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		// Keys should be Unique
		// Allowed Multiple null values
		NavigableMap<Integer, String>map = new TreeMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, null);
		map.put(5, null);
		System.out.println(map);
		
		map.forEach((k, v) -> System.out.println(k +" - "+ v));

		//----------------------------//
		NavigableSet<Integer> descendingKeySet = map.descendingKeySet();
		System.out.println(descendingKeySet);
		
		//----------------------------//
		NavigableMap<Integer, String> descendingMap = map.descendingMap();
		System.out.println(descendingMap);
		
		//----------------------------//
		Entry<Integer, String> firstEntry = map.firstEntry();
		System.out.println(firstEntry);
		
		//----------------------------//
		Integer firstKey = map.firstKey();
		System.out.println(firstKey);
		
		//----------------------------//
		SortedMap<Integer, String> headMap = map.headMap(2);
		System.out.println(headMap);
		
		//----------------------------//
		NavigableSet<Integer> navigableKeySet = map.navigableKeySet();
		System.out.println(navigableKeySet);
		
		//----------------------------//
		Entry<Integer, String> pollFirstEntry = map.pollFirstEntry();
		System.out.println(pollFirstEntry);
		
		//----------------------------//
		SortedMap<Integer, String> subMap = map.subMap(1, 3);
		System.out.println(subMap);

		//----------------------------//
		SortedMap<Integer, String> tailMap = map.tailMap(3);
		System.out.println(tailMap);
	}
}





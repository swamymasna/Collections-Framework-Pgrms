package com.swamy.utils.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("YELLOW");
		list.add("GREEN");
		list.add("WHITE");
		list.add("BLUE");
		System.out.println("Before Sorting : " + list);
		
		Collections.sort(list);
		System.out.println("After Sorting : " + list);
		
		Collections.reverse(list);
		System.out.println("Reverse Sorting: " + list);
		
	}
}


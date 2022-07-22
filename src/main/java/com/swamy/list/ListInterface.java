package com.swamy.list;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		
		//List allows Duplicate Elements
		list.add("element1");
		list.add("element1");
		list.add("element5");
		list.add("element5");
		System.out.println(list); //[element1, element1, element5, element5]
		
		//List allows NULL values also
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list);
		// [element1, element1, element5, element5, null, null, null]
		
		list.clear();	
		System.out.println(list); //[]
		
		//List Must be follows Insertion Order
		list.add("Data1");
		list.add("Data3");
		list.add("Data4");
		list.add("Data2");
		System.out.println(list); // [Data1, Data3, Data4, Data2]
		
	}
}

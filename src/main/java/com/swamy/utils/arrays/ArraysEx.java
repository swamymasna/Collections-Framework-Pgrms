package com.swamy.utils.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysEx {

	public static void main(String[] args) {
		
		//Printing Arrays Elements
		String[] data = {"Swamy" , "Karthi" , "Akhil"};
		for (String vals : data) {
			System.out.println(vals);
		}
		
		//String Array Converting into List Collection
		List<String> listData = Arrays.asList(data);
		System.out.println(listData);
		
		//Sorting
		Arrays.sort(data);
		System.out.println("\n*******After Sorting*******");
		for (String vals : data) {
			System.out.println(vals);
		}
		
		//Binary Search
		int[] integers = {1,2,3,4,5,6};
		int index = Arrays.binarySearch(integers, 3);
		if(index >=0) {
			System.out.println("Index of Given Value is : " + index);
		}
		else {
			System.out.println("Not Found");
		}
		
		//Comparing Two Arrays
		int[] a1 = {1,2,3};
		int[] a2 = {1,2,3};
		boolean equals = Arrays.equals(a1, a2);
		
		if(equals) {
			System.out.println("Given Arrays Are Equal : " + equals);
		}
		else {
			System.out.println("Arrays Are Not Equal ?? " );
		}
		
	}
}






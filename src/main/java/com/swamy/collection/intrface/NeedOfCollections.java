package com.swamy.collection.intrface;

public class NeedOfCollections {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		// If we want represent 10,000 variables then this is the Bad Programing Practice.
		//To overcome this problem we prefer An Arrays
		
		int[] intArray = new int[10000];	
		intArray[1] = 10;
		intArray[9999] = 20;
		System.out.println(intArray[1]); //10
		
		//Limitations of an Array
		//1. Arrays are Fixed in Size
		//2. Arrays can store Homogeneous Elements only.
		
		Student[] stdArray = new Student[10];
		stdArray[1] = new Student();
		stdArray[2] = new Student();
		// stdArray[3] = new Book(); //Type mismatch
		
		//To overcome this Problem we have Object class is present in the Java
		Object[] objArray = new Object[10];
		objArray[1] = new Student();
		objArray[2] = new Student();
		objArray[3] = new Book(); 
		
		//3. Readymade API support is not available in an Arrays.
		
		//Collections: 
		// 1. Can hold both Homogeneous and Heterogeneous Elements
		// 2. Collections are implemented based on Standard Data Structures and Algorithms
		// 3. Ready made support is available in the Collections.
	}
	
}

class Book{
	
}
class Student{
	
}


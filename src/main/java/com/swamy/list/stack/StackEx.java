package com.swamy.list.stack;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		// Duplicates are allowed
		// null insertion possible
		// Maintaining Insertion Order
		Stack<String> stack = new Stack<>();
		stack.add("Num1");
		stack.add("Num2");
		stack.add("Num3");
		stack.add("Banana");
		System.out.println(stack);
		
		String fruit = stack.push("Apple");  //Pushes an element onto the top of stack
		System.out.println("Fruits: "+ fruit);
		System.out.println("Stack: "+stack);
		
		String popData = stack.pop(); //removed an item from the Stack
		System.out.println("popData: " + popData);
		System.out.println("stackData: " + stack);
		
		String peekData = stack.peek();
		System.out.println("peekData: " + peekData);
		System.out.println("stackData: " + stack);
		
		int search = stack.search("Banana");
		System.out.println(search);

		
		Stack<String>fruits = new Stack<>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		System.out.println(stack);
		stack.addAll(fruits);
		System.out.println(stack);
	}
}





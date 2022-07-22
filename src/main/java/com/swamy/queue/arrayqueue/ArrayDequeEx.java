package com.swamy.queue.arrayqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		Deque<String>deque = new ArrayDeque<>();
		deque.add("Zero");
		deque.add("One");
		deque.add("Two");
		deque.forEach(System.out::println);
	}
}
/*
output:
Zero
One
Two
*/

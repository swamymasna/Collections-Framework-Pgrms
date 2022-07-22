package com.swamy.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		PriorityQueue<String>queue = new PriorityQueue<>();
		queue.add("Zero");
		queue.add("One");
		queue.add("Two");
		System.out.println(queue);
		System.out.println("Head : " + queue.element());
		System.out.println("Head : " + queue.peek());
		
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String data = (String) iterator.next();
			System.out.println(data);
		}
		
		queue.remove();
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);
		
		Iterator<String> iterator2 = queue.iterator();
		while (iterator2.hasNext()) {
			String data = (String) iterator2.next();
			System.out.println(data);
		}
	}
}

/*
output:
[One, Zero, Two]
Head : One
Head : One
One
Zero
Two
[Two, Zero]
[Zero]
Zero
*/	
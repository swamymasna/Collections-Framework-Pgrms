package com.swamy.cursor.listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		LinkedList<String>list = new LinkedList<>();
		list.add("SWAMY");
		list.add("NTR");
		list.add("VICTORY");
		list.add("VENKATESH");
		list.add("SIMHA");
		System.out.println(list);
		
		ListIterator<String> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {
			String itr = (String) listIterator.next();
			if(itr.equals("NTR")) {
				listIterator.set("TIGER");
			}
			else if (itr.equals("VICTORY")) {
				listIterator.remove();
			}
		}
		System.out.println(list);
	}
}

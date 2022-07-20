package com.swamy.cursor.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {

		//Vector<String>monthNames = new Vector<>();
		List<String>monthNames = new ArrayList<>();
		monthNames.add("JAN");
		monthNames.add("FEB");
		monthNames.add("MAR");
		monthNames.add("APRL");
		
		Iterator<String> iterator = monthNames.iterator();
		while (iterator.hasNext()) {
			String data = (String) iterator.next();
			System.out.println(data);
		}
	}
}


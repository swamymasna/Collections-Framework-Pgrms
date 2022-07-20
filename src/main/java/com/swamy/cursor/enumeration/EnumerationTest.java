package com.swamy.cursor.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {

		Vector<String>vector = new Vector<>();
		vector.add("SUN");
		vector.add("MON");
		vector.add("TUE");
		vector.add("WED");
		Enumeration<String> enumeration = vector.elements();

		while (enumeration.hasMoreElements()) {
			String enumVals = (String) enumeration.nextElement();
			System.out.println(enumVals);
		}
	}
}


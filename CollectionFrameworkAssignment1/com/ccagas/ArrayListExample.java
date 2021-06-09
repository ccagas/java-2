package com.ccagas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Java Collection Framework 1
 * 
 * @author Candie
 *
 */

public class ArrayListExample {

	public static void main(String[] args) {
		// Creating an ArrayList and adding object
		ArrayList<String> languageList = new ArrayList<String>();

		languageList.add("English");
		languageList.add("French");
		languageList.add("Italian");
		languageList.add("Arabic");

		// Printing the Array List through Iterator
		System.out.println("Array List before sorting:");

		Iterator<String> itr = languageList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		} // end while

		// Sorting the Array List
		Collections.sort(languageList);

		// Printing the sorted Array List through Iterator
		System.out.println();
		System.out.println("Arraylist after sorting:");

		Iterator<String> itrSorted = languageList.iterator();
		while (itrSorted.hasNext()) {
			System.out.println(itrSorted.next());
		} // end while

	}// end main

}// end class

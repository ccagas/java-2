package com.ccagas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Java Collection Framework 2
 * 
 * @author Candie
 *
 */
public class HashMapExample {

	public static void main(String[] args) {
		// Creating HashMap and adding elements
		HashMap<String, String> countryMap = new HashMap<String, String>();

		countryMap.put("US", "United States");
		countryMap.put("CAN", "Canada");
		countryMap.put("UK", "United Kingdom");
		countryMap.put("FRC", "France");
		countryMap.put("IT", "Italy");

		System.out.println("countryID and countryName list of values:\n");

		// Returns set view
		Set<Map.Entry<String, String>> cm = countryMap.entrySet();

		// Loop through all the objects into countryMap
		for (Map.Entry<String, String> me : cm) {
			System.out.print(me.getKey() + ", ");
			System.out.println(me.getValue());
		} // end for

		// Remove France value from countryMap object
		countryMap.remove("FRC", "France");

		// Add new value with key SP and value Spain
		countryMap.put("SP", "Spain");

		System.out.println();
		System.out.println("countryID and countryName list with new values:\n");

		// Loop through all the objects into countryMap
		for (Map.Entry<String, String> me : cm) {
			System.out.print(me.getKey() + ", ");
			System.out.println(me.getValue());
		} // end for

	}// end of main

}// end of class

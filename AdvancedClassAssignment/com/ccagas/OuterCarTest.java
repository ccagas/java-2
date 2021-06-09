package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Java Advanced Class
 * 
 * @author Candie
 *
 */

// Demo class
public class OuterCarTest {

	public static void main(String[] args) {

		// create instance of outer class OuterCar
		OuterCar outerCar = new OuterCar();

		// call method drive,
		// which instantiates inner class InnerCar and calls its
		// methods start, stop, and shift
		outerCar.drive();

	}// end of main

}// end of class

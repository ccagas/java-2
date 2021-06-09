package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Java Advanced Class
 * 
 * @author Candie
 *
 */

// Outer class
public class OuterCar {

	// method to create instance of inner class
	public void drive() {

		InnerEngine innerEngine = new InnerEngine();

		// call methods in Inner class InnerCar
		innerEngine.start();
		innerEngine.stop();
		innerEngine.shift();

	}// end of drive method

	// Inner class with methods
	class InnerEngine {
		void start() {
			System.out.println("starting");
		}

		void stop() {
			System.out.println("stopping");
		}

		void shift() {
			System.out.println("shifting");
		}
	}// end of inner class

}// end of outer class

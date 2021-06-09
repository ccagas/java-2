package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Java Threads
 * 
 * @author Candie
 *
 */
public class MultipleThreads {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadRunnableExample());
		Thread t2 = new Thread(new ThreadRunnableExample());

// Alternative for initiating instance
// Comment line 15 & 16, then uncomment lines 20 to 22 below:
//		ThreadRunnableExample obj = new ThreadRunnableExample();
//		Thread t1 = new Thread(obj);
//		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();

	}// end of main method

}// end of class

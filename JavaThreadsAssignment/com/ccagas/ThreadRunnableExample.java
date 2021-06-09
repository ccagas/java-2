package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Java Threads
 * 
 * @author Candie
 *
 */

public class ThreadRunnableExample implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Current thread name: " + Thread.currentThread().getName());
		} // end for

	}// end of run method

}// end of class

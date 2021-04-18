package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment 1 - Java Generic Type
 * 
 * Car class which implements Vehicle interface
 * 
 * @author Candie
 *
 */
public class Car implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Car driving...");
	}

	@Override
	public void start() {
		System.out.println("Car stopping...");
	}

	@Override
	public void stop() {
		System.out.println("Car stopping...");
	}
}// end of class

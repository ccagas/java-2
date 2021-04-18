package com.ccagas;

public class Van implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Van driving...");
	}

	@Override
	public void start() {
		System.out.println("Van stopping...");
	}

	@Override
	public void stop() {
		System.out.println("Van stopping...");
	}
}// end of class

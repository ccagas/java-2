package com.ccagas;

public class MotorCycle implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Motorcyle driving...");
	}

	@Override
	public void start() {
		System.out.println("Motorcycle stopping...");
	}

	@Override
	public void stop() {
		System.out.println("Motorcycle stopping...");
	}
}// end of class

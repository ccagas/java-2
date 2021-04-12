package ca.mb.rrc.java1.exam;

public class Car implements Vehicle {
	// variables
	int doors;
	int wheels;
	String color;

	// constructor
	public Car() {
		this.doors = 4;
		this.wheels = 4;
		this.color = "red";
	}

	@Override
	public void drive() {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " driving...");
	}

	@Override
	public boolean stop() {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " stopping...");
		return true;
	}

	@Override
	public void steer(int a) {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " steering " + a + "x...");
	}

	@Override
	public String toString() {
		return "\n### I'm a " + getClass().getSimpleName() + ", my color is " + this.color + " and have " + this.doors
				+ " doors ###";
	}
} // end class

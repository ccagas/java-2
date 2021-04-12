package ca.mb.rrc.java1.exam;

public class Truck implements Vehicle {
	// variables
	int gears;
	int horn;

	// constructor
	public Truck() {
		this.gears = 10;
		this.horn = 2;
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

	public void honk() {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " honking...");

	}

	@Override
	public String toString() {
		return "\n*** I'm a " + getClass().getSimpleName() + ", and I have " + this.gears + " gears and " + this.horn
				+ " horn(s) ***";
	}

} // end class

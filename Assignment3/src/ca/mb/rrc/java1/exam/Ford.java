package ca.mb.rrc.java1.exam;

public class Ford extends Truck {
	// constructor
	public Ford() {
		super();
	}

	@Override
	public void drive() {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " truck driving...");
	}

	@Override
	public boolean stop() {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " truck stopping...");
		return true;
	}

	@Override
	public void steer(int a) {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " truck steering " + a + "x...");
	}

	@Override
	public void honk() {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " truck honking...");
	}

	@Override
	public String toString() {
		return "\n*** I'm a " + getClass().getSimpleName() + " truck, and I have " + this.gears + " gears and "
				+ this.horn + " horn(s) ***";
	}

} // end class

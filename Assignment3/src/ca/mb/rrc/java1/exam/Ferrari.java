package ca.mb.rrc.java1.exam;

public class Ferrari extends Car {
	// variables
	String badge;
	int year;
	double price;

	// constructor
	public Ferrari() {
		super();
		this.badge = "Prancing Hourse";
		this.year = 2015;
		this.price = 170000d;
	}

	public void race() {
		System.out.println("\nI'm a " + getClass().getSimpleName() + " car racing...");
	}

	@Override
	public String toString() {
		return "\n### I'm a " + getClass().getSimpleName() + " car, my color is " + this.color + " and have "
				+ this.doors + " doors ###";
	}

} // end class

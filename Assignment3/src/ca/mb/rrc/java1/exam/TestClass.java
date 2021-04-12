package ca.mb.rrc.java1.exam;

import java.util.ArrayList;

public class TestClass {
	public static void main(String[] args) {
		// instantiate classes into ArrayList
		ArrayList<Vehicle> myList = new ArrayList<Vehicle>();

		myList.add(0, new Ferrari());
		myList.add(1, new Truck());
		myList.add(2, new Car());
		myList.add(3, new Ford());

		// loop over ArrayList to call display method of objects
		for (Vehicle myVehicle : myList) {
			display(myVehicle);
		}
	} // end main

	// display method
	public static void display(Vehicle v) {
		System.out.println("\nThis is my vehicle:" + v);
	} // end display method
}// end class

package com.ccagas;

public class VehicleRental<T extends Vehicle> {
	// declare object of generic type Vehicle
	T vehicle;

	// method which accepts generic type of Vehicle and call drive method of passed
	// Vehicle object
	public void rent(T v) {
		vehicle = v;
		vehicle.drive();
	}

	// getter method to return object
	public T getVehicle() {
		return vehicle;
	}
}// end of class

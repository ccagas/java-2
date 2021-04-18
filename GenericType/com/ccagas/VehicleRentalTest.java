package com.ccagas;

public class VehicleRentalTest {

	public static void main(String[] args) {
		// instantiate objects
		VehicleRental<Vehicle> myVehicle = new VehicleRental<Vehicle>();
		Car myCar = new Car();
		Van myVan = new Van();
		MotorCycle myMotorcycle = new MotorCycle();

		// display objects
		System.out.println("My Rental: ");
		System.out.println();
		myVehicle.rent(myCar);
		myVehicle.rent(myVan);
		myVehicle.rent(myMotorcycle);
	}// end of main
}// end of class

package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Exception Handling
 * 
 * @author Candie
 *
 */

public class AccountExampleTest {

	public static void main(String[] args) {
		// Create instance
		AccountExample account = new AccountExample();

		try {
			// Try AccountException on addAmount method
			account.addAmount(123, 45);

			// Comment above lines to try AccountException on deleteAmount method
			// Uncomment below line
			// account.deleteAmount(987, 478);

		} catch (AccountException e) {

			// Print error code using getErrorCode method
			// Uncomment line below to print error message using getErrorCode method
			// System.out.println("Custom error message: " + e.getErrorCode() + ", " +
			// e.getMessage);

			// Print custom exception message
			e.getMessage();
		}

	}// end of main method

}// end of class

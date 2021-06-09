package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Exception Handling
 * 
 * @author Candie
 *
 */

// Custom exception class
public class AccountException extends Exception {
	// Uncomment line below to use getErrorCode method
	// private int errorCode;

	private static final long serialVersionUID = 1L;

	// Constructor which accepts errorCode and message
	public AccountException(int errorCode, String message) {
		super(message);
		// Uncomment line below to print error message using getErrorCode method
		// this.errorCode = errorCode;

		// Uncomment line below to print error message without getErrorCode method
		System.out.println("Error code " + errorCode + ": " + message);
	}

	// Getter for errorCode
	// Uncomment line below to use getErrorCode method
//	public int getErrorCode() {
//		return errorCode;
//	}

}// end of class

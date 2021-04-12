package ca.rrc.assignment;

/**
 * Assignment 2
 * 
 * Custom exception for invalid number input
 * 
 * @author Candie Cagas
 *
 */

public class CustomValidationException extends Exception
{
	// calling constructor of parent class
	public CustomValidationException(String msg)
	{
		super(msg);
	}
} // end of class

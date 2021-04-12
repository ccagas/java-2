package ca.rrc.assignment;

/**
 * Assignment 2
 * 
 * Custom exception for invalid operator
 * 
 * @author Candie Cagas
 *
 */

public class InvalidOperationException extends Exception
{
	// calling constructor of parent class
	public InvalidOperationException(String msg)
	{
		super(msg);
	}
} // end of class

package ca.rrc.assignment;

import static java.lang.Math.addExact;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.subtractExact;

import java.util.Scanner;

/**
 * Assignment 2
 * 
 * This is the Calculator class
 * 
 * @author Candie Cagas
 *
 */

public class Calculator
{
	// variable declaration
	private String userInput;
	private int numInput;
	private char opInput;
	private int num1;
	private int num2;
	private char operator;
	private int result;

	Scanner s = new Scanner(System.in);

	// method called from Main class to run program
	public void runCalculator()
	{
		num1 = askForNum1();
		num2 = askForNum2();
		operator = askForOp();

		// calls method to calculate input
		calculate(num1, num2, operator);
		System.out.println("The total is " + result);
	}

	// method asking user for first number with custom exception handling
	public int askForNum1()
	{
		try
		{
			System.out.print("Enter first value: ");
			userInput = s.nextLine();
			checkNum(); // calls method to validate first number input
		} catch (CustomValidationException e)
		{
			System.out.println(e.getMessage());
			askForNum1(); // re-prompt user if input is invalid
		}
		return numInput;
	}

	// method asking user for second number with custom exception handling
	public int askForNum2()
	{
		try
		{
			System.out.print("Enter second value: ");
			userInput = s.nextLine();
			checkNum(); // calls method to validate second number input
		} catch (CustomValidationException e)
		{
			System.out.println(e.getMessage());
			askForNum2(); // re-prompt user if input is invalid
		}
		return numInput;
	}

	// method asking user for operator with custom exception handling
	public char askForOp()
	{
		try
		{
			System.out.print("Enter operator (a=Add, s=Subtract, m=Multiply): ");
			opInput = s.next().charAt(0);
			checkOp(); // calls method to validate operator input
			return opInput;
		} catch (InvalidOperationException i)
		{
			System.out.println(i.getMessage());
			return askForOp(); // re-prompts user to enter operator
		}
	}

	// method to check user input for number that throws custom exception
	public int checkNum() throws CustomValidationException, NumberFormatException
	{
		try
		{
			numInput = Integer.parseInt(userInput);
			if (numInput <= 0)
			{
				throw new CustomValidationException("Value must be greater than zero.");
			}
		} catch (NumberFormatException f)
		{
			throw new CustomValidationException("Please enter a whole number.");
		}
		return numInput;
	}

	// method to check user input for operator that throws custom exception
	public char checkOp() throws InvalidOperationException
	{
		if (opInput != 'a' && opInput != 'A' && opInput != 's' && opInput != 'S' && opInput != 'm' && opInput != 'M')
		{
			throw new InvalidOperationException("Invalid operator.");
		}
		return opInput;
	}

	// method for calculation
	public int calculate(int num1, int num2, char operator)
	{
		if (operator == 'a' || operator == 'A')
		{
			result = addExact(num1, num2);
		} else if (operator == 's' || operator == 'S')
		{
			result = subtractExact(num1, num2);
		} else
		{
			result = multiplyExact(num1, num2);
		}
		return result;
	} // end of calculation method

} // end of class

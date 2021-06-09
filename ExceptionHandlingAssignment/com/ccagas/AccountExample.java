package com.ccagas;

/**
 * ADEV-1001 (OPEN) Programming (Java 2)
 * 
 * Assignment: Exception Handling
 * 
 * @author Candie
 *
 */

public class AccountExample {

	private int amount;

	final int ACCOUNT_NO = 777;
	final int ADD_ACCT_ERR = -10;
	final int DEL_ACCT_ERR = -20;

	// methods which throws custom Exception
	public int addAmount(int acctNo, int amt) throws AccountException {
		if (acctNo != ACCOUNT_NO) {
			throw new AccountException(ADD_ACCT_ERR, "Invalid account number, unable to add amount.");
		}
		return amount;
	}

	public int deleteAmount(int acctNo, int amt) throws AccountException {
		if (acctNo != ACCOUNT_NO) {
			throw new AccountException(DEL_ACCT_ERR, "Invalid account number, unable to delete amount");
		}
		return amount;
	}

}// end of class

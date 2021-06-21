package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAccounts {
	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) throws SQLException {

		String acct = "UPDATE accounts SET acct_type_id = ?, balance = ? WHERE account_id = ?";

		// NOTE: try-with-resources used here
		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(acct, Statement.RETURN_GENERATED_KEYS);)

		{
			// account_id_type
			stmt.setInt(1, 40);

			// balance
			stmt.setInt(2, 6000);

			// account_id to update
			stmt.setInt(3, 500);

			int result = stmt.executeUpdate();

			// Update successful if result ==1
			if (result == 1)
				System.out.println("One row updated succesfully");
			else
				System.out.println("No row updated");

		} catch (SQLException e) {
			System.err.println(e);
		}

	}// end of main

}// end of class

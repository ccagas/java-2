package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteAccountType {

	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) {

		String ttype = "DELETE FROM account_type WHERE acct_type_id = ?";

		// NOTE: try-with-resources used here
		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(ttype, Statement.RETURN_GENERATED_KEYS);)

		{
			// acct_type_id to delete
			stmt.setInt(1, 40);

			int result = stmt.executeUpdate();

			// Delete successful if result == 1
			if (result == 1)
				System.out.println("One row deleted with success");
			else
				System.out.println("No row deleted");
		} catch (SQLException e) {
			System.out.println(e);
		}

	}// end of main

}// end of class

package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertAccounts {

	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) throws SQLException {

		String acct = "INSERT INTO accounts VALUES (?, ?, ?)";

		// NOTE: try-with-resources used here
		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(acct, Statement.RETURN_GENERATED_KEYS);)

		{
			// INSERT INTO accounts VALUES
			// (500, 40, 8000);

			// account_id
			stmt.setInt(1, 500);

			// account_id_type
			stmt.setInt(2, 40);

			// balance
			stmt.setInt(3, 8000);

			int result = stmt.executeUpdate();

			// Insert successful if result ==1
			if (result == 1)
				System.out.println("One row inserted succesfully");

		} catch (SQLException e) {
			System.err.println(e);
		}

	}// end of main

}// end of class

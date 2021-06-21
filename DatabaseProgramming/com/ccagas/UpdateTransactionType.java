package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTransactionType {

	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) throws SQLException {

		String ttype = "UPDATE transaction_type SET transaction_desc = ? WHERE tran_type_id = ?";

		// NOTE: try-with-resources used here
		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(ttype, Statement.RETURN_GENERATED_KEYS);)

		{
			// transaction_desc to update
			stmt.setString(1, "E-transfer");

			// tran_type_id to update
			stmt.setString(2, "D");

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

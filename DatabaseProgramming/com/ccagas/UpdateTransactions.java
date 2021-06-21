package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTransactions {

	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) throws SQLException {

		String trans = "UPDATE transactions SET tran_type_id = ?, acct_id_from = ?, acct_id_to = ?, amount = ? WHERE trans_id = ?";

		// NOTE: try-with-resources used here
		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(trans, Statement.RETURN_GENERATED_KEYS);)

		{
			// tran_type_id to update
			stmt.setString(1, "D");

			// acct_id_from to update
			stmt.setInt(2, 500);

			// acct_id_to to update
			stmt.setInt(3, 200);

			// amount to update
			stmt.setInt(4, 300);

			// trans_id to update
			stmt.setInt(5, 4);

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

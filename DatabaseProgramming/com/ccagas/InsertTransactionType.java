package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTransactionType {

	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) throws SQLException {

		String ttype = "INSERT INTO transaction_type VALUES (?, ?)";

		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(ttype, Statement.RETURN_GENERATED_KEYS);) {
			// INSERT INTO transcation_type VALUES
			// ('D', 'Debit');

			// tran_type_id
			stmt.setString(1, "D");

			// transaction_desc
			stmt.setString(2, "Debit");

			int result = stmt.executeUpdate();

			// Insert successful if result ==1
			if (result == 1)
				System.out.println("One row inserted successfully");

		} catch (SQLException e) {
			System.err.println(e);
		}

	}// end of main

}// end of class

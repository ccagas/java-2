package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertAccountType {

	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) throws SQLException {

		String acctype = "INSERT INTO account_type VALUES (?, ?)";

		// NOTE: try-with-resources used here
		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(acctype, Statement.RETURN_GENERATED_KEYS);)

		{
			// INSERT INTO account_type VALUES
			// (40, Savings);

			// acct_type_id
			stmt.setInt(1, 40);

			// account_type_desc
			stmt.setString(2, "Savings");

			int result = stmt.executeUpdate();

			// Insert successful if result ==1
			if (result == 1)
				System.out.println("One row inserted succesfully");

		} catch (SQLException e) {
			System.err.println(e);
		}

	}// end of main

}// end of class

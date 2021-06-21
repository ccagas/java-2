package com.ccagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTransactions {

	private static final String USER_NAME = "root";
	private static final String PASS_WORD = "java";
	private static final String CONNECTION_STR = "jdbc:mysql://localhost/db_assignment";

	public static void main(String[] args) throws SQLException {
		String trans = "INSERT INTO transactions VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = DriverManager.getConnection(CONNECTION_STR, USER_NAME, PASS_WORD);

				PreparedStatement stmt = conn.prepareStatement(trans, Statement.RETURN_GENERATED_KEYS);) {
			// INSERT INTO transactions VALUES
			// (4, 'P' , 500, 400, 2000);

			// trans_id
			stmt.setInt(1, 4);

			// tran_type_id
			stmt.setString(2, "P");

			// acct_id_from
			stmt.setInt(3, 500);

			// acct_id_to
			stmt.setInt(4, 400);

			// amount
			stmt.setInt(5, 2000);

			int result = stmt.executeUpdate();

			// Insert successful if result ==1
			if (result == 1)
				System.out.println("One row inserted successfully");

		} catch (SQLException e) {
			System.err.println(e);
		}

	}// end of main

}// end of class

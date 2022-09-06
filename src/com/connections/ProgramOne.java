package com.connections;

import java.sql.*;

public class ProgramOne {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		String query = "select * from java_employees";
		Connection conn = DBConnection.connect();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			int id = rs.getInt(1);
			String fname = rs.getString(2);
			String lname = rs.getString(3);
			String email = rs.getString(4);
			System.out.println("ID : " + id + ", First Name : " + fname
					+ ", Last Name : " + lname + ", Email : " + email);
		}
	}
}

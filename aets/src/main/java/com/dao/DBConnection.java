package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection connect() throws SQLException,
			ClassNotFoundException {
		// load the driver
		Class.forName("oracle.jdbc.OracleDriver");

		// establish the connection between java app and oracle db
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@"
				+ "(DESCRIPTION =" + "(ADDRESS =" + "(PROTOCOL = TCP)"
				+ "(HOST = 192.168.1.12)" + "(PORT = 1521)" + ")\r\n"
				+ "(CONNECT_DATA =" + "(SERVER = dedicated)"
				+ "(SERVICE_NAME = domdev.hotcourses.co.in)" + ")" + ")",
				"HOT_ACADEMY", "c1assr00m");
		return conn;
	}
}
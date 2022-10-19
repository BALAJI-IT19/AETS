package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connections.DBConnection;

public class CheckLogin {

	public String hasUser(String email, String pwd) throws SQLException {
		String result = "success";
		Connection con = null;
		ResultSet rs = null;
		try {
			con = DBConnection.connect();
			String query = "select password from aets_emp_details where email=" + email;
			rs = con.createStatement().executeQuery(query);
			boolean flag = false;
			while (rs.next()) {
				flag = true;
				if (pwd.equals(rs.getString(1))) {
					result = "success";
				} else {
					result = " Incorrect password";
				}
			}
			if (flag == false)
				result = " No such user";
		} catch (ClassNotFoundException | SQLException e) {
			result = "Exception :" + e;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return result;
	}
}

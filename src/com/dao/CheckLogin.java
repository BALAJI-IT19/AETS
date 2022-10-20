package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
			System.out.print("\n\n\n"+email+"\n\n\n"+pwd+"\n\n\n");
			String query = "select * from aets_emp_details where email=?";
			PreparedStatement ps = con.prepareStatement(query);
			System.out.println(query);
			ps.setString(1, email);
			System.out.println("\n\n\n");
			rs = ps.executeQuery();
			boolean flag = false;
			while (rs.next()) {
				flag = true;
				String str = rs.getString(6);
				System.out.print(str+"\n\n\n");
				if (pwd.equals(str)) {
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

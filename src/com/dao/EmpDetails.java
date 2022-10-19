package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.RegisterEmp;
import com.connections.DBConnection;

public class EmpDetails {

	public String post(RegisterEmp emp) {
		Connection con;
		try {
			con = DBConnection.connect();
			String s = "insert into aets_emp_details values(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1, emp.getEmpId());
			ps.setString(2, emp.getPhone());
			ps.setString(3, emp.getLname());
			ps.setString(4, emp.getLocation());
			ps.setString(5, emp.getFname());
			ps.setString(6, emp.getPassword());
			ps.setString(7, emp.getEmail());
			ps.execute();
			return "Inserted successfully";
		} catch (ClassNotFoundException | SQLException e) {
			return "Exception :" + e;
		}
	}

}

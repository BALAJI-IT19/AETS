package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Employee;
import com.connections.DBConnection;

public class EmpDetails {

	public String post(Employee emp) {
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
			return "success";
		} catch (ClassNotFoundException | SQLException e) {
			return "Exception :" + e;
		}
	}

	public Employee get(String email) throws ClassNotFoundException, SQLException {
		Employee emp = new Employee();
		Connection con = DBConnection.connect();
	    String s = "select * [except password] from aets_emp_details where email="+email;
	    ResultSet rs = con.createStatement().executeQuery(s);
	    while(rs.next()){
	    	emp.setEmpId(rs.getString(1));
	    	emp.setPhone(rs.getString(2));
	    	emp.setLname(rs.getString(3));
	    	emp.setLocation(rs.getString(4));
	    	emp.setFname(rs.getString(5));
	        emp.setEmail(rs.getString(6));
	    }
		return emp;
	}

}

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.connections.DBConnection;

public class BookingQueue {
	public boolean addingToQueue() {
		Connection con;
		try {
			con = DBConnection.connect();
			String s = "insert into aets_booking_queue(ORIGIN,DESTINATION,STATUS,TIME,EMPLOYEE_ID,) values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1, emp.getEmpId());
			ps.setString(2, emp.getPhone());
			ps.setString(3, emp.getLname());
			ps.setString(4, emp.getLocation());
			ps.setString(5, emp.getFname());
			
			ps.execute();
			return true;
		}
		return true;
	}
}

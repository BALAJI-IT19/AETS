package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Booking;
import com.connections.DBConnection;

public class BookingQueue {
	public boolean addingToQueue(Booking bd) {
		Connection con;
		try {
			con = DBConnection.connect();
			String s = "insert into aets_booking_queue(ORIGIN,DESTINATION,STATUS,TIME,EMPLOYEE_ID) values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1, bd.getStart());
			ps.setString(2, bd.getEnd());
			ps.setString(3, "queued");
			ps.setString(4, bd.getTime());
			ps.setString(5, bd.getEmpId());
			ps.execute();
			return true;
		}catch(Exception e){
			return false;
		}
	}
}

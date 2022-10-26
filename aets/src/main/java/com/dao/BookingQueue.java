package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Booking;
import com.connections.DBConnection;

import java.time.LocalDate;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.util.ArrayList;

public class BookingQueue {
	public boolean addingToQueue(Booking bd) {
		Connection con;
		try {
			con = DBConnection.connect();
			String s = "insert into aets_booking_queue(ORIGIN,DESTINATION,STATUS,TIME,EMPLOYEE_ID,QUEUE_DATE) values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(s);
			String se = bd.getStart();
			if(se != null){
				ps.setString(1, se);
			}
			else{
				ps.setString(1, bd.getStartTxtOther());
			}
			se = bd.getEnd();
			if(se != null){
				ps.setString(2, bd.getEnd());
			}
			else{
				ps.setString(2, bd.getEndTxtOther());
			}
			ps.setString(3, "queued");
			ps.setString(4, bd.getTime());
			ps.setString(5, bd.getEmpId());
			LocalDate lt = LocalDate.now();
			ps.setString(6, lt.toString());
			ps.execute();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public ArrayList<Booking> rides(String empId){
		Connection con;
		try {
			con = DBConnection.connect();
			String s = "select ORIGIN,DESTINATION,STATUS,TIME,QUEUE_DATE,DRIVER_ID from aets_booking_queue where EMPLOYEE_ID = ?";
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1, empId);
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			ArrayList<Booking> rideList = new ArrayList<>();
			while(rs.next()){
				Booking bd = new Booking();
				bd.setStart(rs.getString(1));
				bd.setEnd(rs.getString(2));
				bd.setStatus(rs.getString(3));
				bd.setTime(rs.getString(4));
				bd.setDate(rs.getString(5));
				bd.setDriverId(rs.getString(6));
				rideList.add(bd);
			}
			return rideList;
		}catch(Exception e){
			System.out.println(e+"exception hehehe");
			return null;
		}
	}
}

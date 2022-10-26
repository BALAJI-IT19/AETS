package com.bean;

public class Booking {
	private String start;
	private String startTxtOther;
	private String end;
	private String endTxtOther;
	private String time;
	private String empId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStartTxtOther() {
		return startTxtOther;
	}

	public void setStartTxtOther(String startTxtOther) {
		this.startTxtOther = startTxtOther;
	}

	public String getEndTxtOther() {
		return endTxtOther;
	}

	public void setEndTxtOther(String endTxtOther) {
		this.endTxtOther = endTxtOther;
	}

}

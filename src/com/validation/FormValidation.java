package com.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.utility.CheckUtilities;

public class FormValidation {
	CheckUtilities utility = new CheckUtilities();

	public String checkEmpId(String empId) {
		String result = "success";
		String isEmpty = utility.isEmpty(empId);
		if (!(result.equals(isEmpty))) {
			return "Employee id : " + isEmpty;
		}
		boolean isNum = utility.isNumber(empId);
		if (isNum == false) {
			return "Employee id is not a number";
		}
		String isCrtSize = utility.isSize(empId, 6);
		if (!(result.equals(isCrtSize))) {
			return isCrtSize;
		}
		return result;
	}

	public String checkFname(String fname) {
		String result = "success";
		String isEmpty = utility.isEmpty(fname);
		if (!(result.equals(isEmpty))) {
			return "First name : " + isEmpty;
		}
		String cn = utility.isContainsNumber(fname);
		if (!(result.equals(cn))) {
			return "First name : " + cn;
		}
		String isCrtSize = utility.isSize(fname, 20);
		if (!(result.equals(isCrtSize))) {
			return isCrtSize;
		}
		return result;
	}

	public String checkLname(String lname) {
		String result = "success";
		String isEmpty = utility.isEmpty(lname);
		if (!(result.equals(isEmpty))) {
			return "Last name : " + isEmpty;
		}
		String cn = utility.isContainsNumber(lname);
		if (!(result.equals(cn))) {
			return "Last name : " + cn;
		}
		String isCrtSize = utility.isSize(lname, 25);
		if (!(result.equals(isCrtSize))) {
			return isCrtSize;
		}
		return result;
	}

	public String checkEmail(String email) {
		String result = "success";
		String isEmpty = utility.isEmpty(email);
		if (!(result.equals(isEmpty))) {
			return "Email : " + isEmpty;
		}
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches() == false) {
			result = "Email does not passes the pattern";
		}
		return result;
	}

	public String checkPhone(String phone) {
		String result = "success";
		String isEmpty = utility.isEmpty(phone);
		if (!(result.equals(isEmpty))) {
			return "Phone : " + isEmpty;
		}
		String regex = "^[0-9]{10,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		if (matcher.matches() == false) {
			result = "Phone does not passes the pattern";
		}
		return result;
	}

	public String checkJobId(String jobId) {
		String result = "success";
		String isEmpty = utility.isEmpty(jobId);
		if (!(result.equals(isEmpty))) {
			return "Job Id : " + isEmpty;
		}
		boolean isNum = utility.isNumber(jobId);
		if (isNum == false) {
			return "Job id is not a number";
		}
		String isCrtSize = utility.isSize(jobId, 10);
		if (!(result.equals(isCrtSize))) {
			return isCrtSize;
		}
		return result;
	}

	public String checkSalary(String salary) {
		String result = "success";
		String isEmpty = utility.isEmpty(salary);
		if (!(result.equals(isEmpty))) {
			return "Salary : " + isEmpty;
		}
		String regex = "^([0-9]{0,8}).([0-9]{1,2})|[0-9]{0,8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(salary);
		if (matcher.matches() == false) {
			result = "Salary does not passes the pattern";
		}
		return result;
	}

	public String checkCp(String cp) {
		String result = "success";
		String isEmpty = utility.isEmpty(cp);
		if (!(result.equals(isEmpty))) {
			return "Commision pct : " + isEmpty;
		}
		String regex = "^([0-9]{0,2}).([0-9]{1,2})|[0-9]{0,2}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(cp);
		if (matcher.matches() == false) {
			result = "Commission pct does not passes the pattern";
		}
		return result;
	}
	
	public String checkMngId(String mngId) {
		String result = "success";
		String isEmpty = utility.isEmpty(mngId);
		if (!(result.equals(isEmpty))) {
			return "Manager id : " + isEmpty;
		}
		boolean isNum = utility.isNumber(mngId);
		if (isNum == false) {
			return "Manager id is not a number";
		}
		String isCrtSize = utility.isSize(mngId, 6);
		if (!(result.equals(isCrtSize))) {
			return isCrtSize;
		}
		return result;
	}
	
	public String checkDptId(String dptId) {
		String result = "success";
		String isEmpty = utility.isEmpty(dptId);
		if (!(result.equals(isEmpty))) {
			return "Department id : " + isEmpty;
		}
		boolean isNum = utility.isNumber(dptId);
		if (isNum == false) {
			return "Department id is not a number";
		}
		String isCrtSize = utility.isSize(dptId, 4);
		if (!(result.equals(isCrtSize))) {
			return isCrtSize;
		}
		return result;
	}
	
	public String checkPass(String pwd){
		String result = "success";
		String isEmpty = utility.isEmpty(pwd);
		if (!(result.equals(isEmpty))) {
			return "Password : " + isEmpty;
		}
		return result;
	}

}

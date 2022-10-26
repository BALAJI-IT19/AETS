package com.validation;

import com.utility.CheckUtilities;

public class NumberValidation {
	CheckUtilities utility = new CheckUtilities();

	public String checkNum1(String num1) {
		String result = "success";
		String isEmpty = utility.isEmpty(num1);
		if (!(result.equals(isEmpty))) {
			return "Number 1 : " + isEmpty;
		}
		boolean isNum = utility.isNumber(num1);
		if (isNum == false) {
			return "Number 1 is not a number";
		}
		return result;
	}

	public String checkNum2(String num2, String num1) {
		String result = "success";
		String isEmpty = utility.isEmpty(num2);
		if (!(result.equals(isEmpty))) {
			return "Number 2 : " + isEmpty;
		}
		boolean isNum = utility.isNumber(num2);
		if (isNum == false) {
			return "Number 2 is not a number";
		} else if (isNum == true
				&& Integer.parseInt(num1) < Integer.parseInt(num2)) {
			return "Number 1 cannot be less than number 2";
		}
		return result;
	}

	public String checkAmnt(String amnt) {
		String result = "success";
		String isEmpty = utility.isEmpty(amnt);
		if (!(result.equals(isEmpty))) {
			return "Amount : " + isEmpty;
		}
		boolean isDecimal = utility.isDecimal(amnt);
		if (isDecimal == false) {
			return "Amount is not a decimal number";
		}
		return result;
	}

	public String checkPct(String pct) {
		String result = "success";
		String isEmpty = utility.isEmpty(pct);
		if (!(result.equals(isEmpty))) {
			return "Percentage : " + isEmpty;
		}
		boolean isDecimal = utility.isDecimal(pct);
		if (isDecimal == false) {
			return "Precentage is not a decimal number";
		}
		Double p = Double.parseDouble(pct);
		if (p > 100) {
			return "Rate cannot be greater than 100";
		}
		return result;
	}
}

package com.utility;

public class CheckUtilities {

	public String isEmpty(String num) {
		String result = "success";
		if (num.trim().length() == 0) {
			result = "Empty input!";
		}
		return result;
	}

	public boolean isDecimal(String num) {
		boolean result = true;
		try {
			Double.parseDouble(num);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public boolean isNumber(String num) {
		boolean result = true;
		try {
			Integer.parseInt(num);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public String isSize(String str, int s) {
		String result = "success";
		if (str.length() > s) {
			return str + " must be with in " + s + " length";
		}
		return result;
	}

	public String isContainsNumber(String str) {
		String result = "success";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				return " cannot contains numbers " + str.charAt(i);
			}
		}
		return result;
	}

	public boolean isPerfect(int n) {
		if (n == 1)
			return false;
		int sum = 1;
		for (int i = 2; i * i <= n; i++) {

			if (n % i == 0) {
				if (i * i == n)
					sum += i;
				else
					sum += i + (n / i);
			}
		}
		if (sum == n)
			return true;
		return false;
	}
}

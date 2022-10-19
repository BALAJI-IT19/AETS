package com.utility;

public class Encryption {

	public String encryptOrDecrypt(String pass){
		String newPass = "";
		for (int i = 0; i < pass.length(); i++) {
			char ch = pass.charAt(i);
			int val = ch;
			if(val >= 33 && val <= 79){
				val += 47;
			}
			else if(val >= 80 && val <= 126) {
				val -= 47;
			}
			newPass += (char)val;
		}
		return newPass;
	}
}

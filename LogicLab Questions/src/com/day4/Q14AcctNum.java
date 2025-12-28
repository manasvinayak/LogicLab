package com.day4;

class AccountNumber {
	private final String digits;
	
	public static boolean isValid(String s) {
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	public AccountNumber(String s) {
		if(isValid(s)) {
			digits = s;
		}
		else {
			System.out.println("Invalid account number. Setting the account number to a default number.");
			digits = "000000000000";
		}
	}

	public String getDigits() {
		return digits;
	}
}

public class Q14AcctNum {

	public static void main(String[] args) {
		AccountNumber a = new AccountNumber("123456789012"); 
		AccountNumber b = new AccountNumber("ABC");  
		System.out.println("Account number for a: " + a.getDigits());
		System.out.println("Account number for b: " + b.getDigits());
	}

}

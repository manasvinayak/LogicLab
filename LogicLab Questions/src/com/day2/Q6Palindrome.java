package com.day2;

import java.util.Scanner;

public class Q6Palindrome {
	public static boolean palindromeCheck(String str) {
		int i=0, j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		sc.close();
		if(palindromeCheck(str.toLowerCase())) {
			System.out.printf("\"%s\" is a Palindrome", str);
		}
		else {
			System.out.printf("\"%s\" is not a Palindrome", str);
		}
	}

}

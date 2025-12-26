package com.day3;

import java.util.Scanner;

public class Q8Passwordvalidator {
	public static boolean hasCorrectLength(String pwd) {
        return pwd.length() >= 8 && pwd.length() <= 20;
    }
	
	public static boolean hasSpaces(String pwd) {
        return pwd.contains(" ");
    }
	
	public static boolean containsUsername(String pwd, String user) {
        return pwd.toLowerCase().contains(user.toLowerCase());
    }
	
	public static boolean hasRequiredChars(String pwd) {
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean specialChar = false;
        String specials = "!@#$%^&*";
        for(int i=0; i<pwd.length(); i++) {
            char c = pwd.charAt(i);
            if(Character.isUpperCase(c)) {
                upper = true;
                continue; 
            }
            if(Character.isLowerCase(c)) {
                lower = true;
                continue;
            }
            if(Character.isDigit(c)) {
                digit = true;
                continue;
            }
            if(specials.contains(String.valueOf(c))) {
                specialChar = true;
                continue;
            }
        }
        return upper && lower && digit && specialChar;
    }
	
	public static boolean isValid(String pwd, String user) {
		return hasCorrectLength(pwd) && !hasSpaces(pwd) && !containsUsername(pwd, user) && hasRequiredChars(pwd);
	}
	
	public static void feedback(String pwd, String user) {
		System.out.println("Feedback:");
		if(!hasCorrectLength(pwd)) {
			System.out.println("- Length must be 8-20 characters.");
		} 
		if(hasSpaces(pwd)) {
            System.out.println("- Password must not contain spaces.");
        }
        if(containsUsername(pwd, user)) {
            System.out.println("- Avoid using parts of your username.");
        }
        if(!hasRequiredChars(pwd)) {
            System.out.println("- Must include uppercase, lowercase, digits, and special characters (!@#$%^&*).");
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String user = sc.nextLine();
		System.out.print("Enter password: ");
		String pwd = sc.nextLine();
		if (isValid(pwd, user)) {
            System.out.println("Password is Robust!");
        } else {
            System.out.println("Invalid Password.");
            feedback(pwd, user);
        }
		sc.close();
	}

}

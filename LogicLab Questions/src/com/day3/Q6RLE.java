package com.day3;

import java.util.Scanner;

public class Q6RLE {
	public static String compress(String str) {
		StringBuilder sbr = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			int cnt=1;
			char c = str.charAt(i);
			while(i+1<str.length() && str.charAt(i+1)==c) {
				cnt++;
				i++;
			}
			sbr.append(c).append(cnt);
		}
		return sbr.toString();
	}

	public static String decompress(String str1) {
		StringBuilder sbr1 = new StringBuilder();
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			int cnt = Character.getNumericValue(str1.charAt(i+1));
			for(int j=0; j<cnt; j++) {
				sbr1.append(c);
			}
			i++;
		}
		return sbr1.toString();
	}
	
	public static boolean isValidInput(String str) {
		if(str.isEmpty()) {
			return false;
		}
		for(char c: str.toCharArray()) {
			if(!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isValidEncoded(String str1) {
		if(str1.isEmpty()) {
			return false;
		}
		for(int i=0; i<str1.length(); i++) {
			if(!Character.isLetter(str1.charAt(i))) {
				return false;
			}
			if(!Character.isDigit(str1.charAt(i+1))) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. Compress\n2. Decompress\n3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			if(choice==3) {
				System.out.println("Exiting...");
				break;
			}
			switch(choice) {
				case 1:
					System.out.print("Enter string to compress: ");
                    String str = sc.next();
                    if(isValidInput(str)) {
                    	System.out.println("Compressed String: " + compress(str));
                    }
                    else {
                    	System.out.println("Invalid String. Please enter letters only.");
                    }
                    break;
				case 2:
					System.out.print("Enter string to decompress: ");
                    String str1 = sc.next();
                    if(isValidEncoded(str1)) {
                    	System.out.println("Decompressed String: " + decompress(str1));
                    }
                    else {
                    	System.out.println("Invalid format. Please enter input in format of e.g.-a3b2 only.");
                    }
                    break;
                default:
                	System.out.println("Invalid choice. Please try again");
                	continue;
			}
		}
		sc.close();
	}
}

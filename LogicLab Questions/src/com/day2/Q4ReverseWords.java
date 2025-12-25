package com.day2;

import java.util.Scanner;

public class Q4ReverseWords {
	public static String revWords(String str) {
		String words[] = str.split(" ");
		String res = "";
		for(String word: words) {
			String rev = "";
			for(int i=word.length()-1; i>=0; i--) {
				rev += word.charAt(i);
			}
			res += rev + " ";
		}
		return res.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String str = sc.nextLine();
		sc.close();
		String rev = revWords(str);
		System.out.println("Sentence after reversing words: " + rev);
	}

}

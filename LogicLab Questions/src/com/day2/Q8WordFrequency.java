package com.day2;

import java.util.Scanner;

public class Q8WordFrequency {
	public static void freqWord(String st) {
		String[] words = st.split(" ");
	    for (int i = 0; i < words.length; i++) {
	        if (words[i] == null) {
	            continue;
	        }
	        int count = 1;
	        for (int j = i + 1; j < words.length; j++) {
	            if (words[j]!=null && words[i].equals(words[j])) {
	                count++;
	                words[j] = null; 
	            }
	        }
	        System.out.println(words[i] + " : " + count);
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String st = sc.nextLine();
		sc.close();
		freqWord(st);
	}

}

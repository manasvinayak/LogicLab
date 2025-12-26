package com.day3;

import java.util.Scanner;

public class Q3StringAnalytics {
	public static int wordCount(String str) {
        if(str.isEmpty()) {
        	return 0;
        }
        String words[] = str.split(" ");
        int cnt = 0;
        for(String word: words) {
        	boolean letter = false;
        	for(char c: word.toCharArray()) {
        		if(Character.isLetter(c)) {
        			letter = true;
        			break;
        		}
        	}
        	if(letter) {
        		cnt++;
        	}
        }
        return cnt;
    }
	
	public static int sentenceCount(String str) {
        int cnt = 0;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '.' || c == '!' || c == '?') {
            	cnt++;
            }
        }
        return cnt;
    }
	
	public static int digitCount(String str) {
		int digits = 0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				digits++;
			}
		}
		return digits;
	}
	
	public static int letterCount(String str) {
		int letters = 0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				letters++;
			}
		}
		return letters;
	}
	
	public static String longestWord(String str) {
		String words[] = str.split(" ");
		String longest = "";
		for(String word: words) {
			String cleanWord = "";
			for(char c: word.toCharArray()) {
				if(Character.isLetter(c)) {
					cleanWord += c;
				}
			}
			if(cleanWord.length()>longest.length()) {
				longest = cleanWord;
			}
		}
		return longest;
	}
	
	public static int[] vowelCount(String str) {
        int counts[] = new int[5];
        // a->0, e->1, i->2, o->3, u->4
        char lower[] = str.toLowerCase().toCharArray();
        for(char c : lower) {
            if(c == 'a') {
            	counts[0]++;
            }
            else if(c == 'e') {
            	counts[1]++;
            }
            else if(c == 'i') {
            	counts[2]++;
            }
            else if(c == 'o') {
            	counts[3]++;
            }
            else if(c == 'u') { 
            	counts[4]++;
            }
        }
        return counts;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.print("Input: ");
            str = sc.nextLine();
        }while(str.isEmpty());
        int words = wordCount(str);
        int sentences = sentenceCount(str);
        int digits = digitCount(str);
        int letters = letterCount(str);
        String longest = longestWord(str);
        int v[] = vowelCount(str);
        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.println("Digits: " + digits + ", Letters: " + letters);
        System.out.printf("Longest word: \"%s\"\n", longest);
        System.out.printf("Vowel freq: a=%d e=%d i=%d o=%d u=%d\n", v[0], v[1], v[2], v[3], v[4]);
        sc.close();
    }
}
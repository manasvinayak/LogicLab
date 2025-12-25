package com.day1;

import java.util.Scanner;

public class Q4CharFrequency {
    public static void charFreq(String str){
        int freq[] = new int[26];
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                freq[str.charAt(i)-'a']++;
            }
        }
        System.out.println("Frequencies of letters: ");
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i)) && freq[str.charAt(i)-'a'] != 0){
                System.out.print(str.charAt(i) + ":" + freq[str.charAt(i)-'a'] + " ");
                freq[str.charAt(i)-'a'] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        sc.close();
        charFreq(str);
    }
}

package com.day1;

import java.util.Scanner;

public class Q1StringReverse{
    public static String reverse(String str){
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to be reversed: ");
        String str = sc.next();
        sc.close();
        String revStr = reverse(str);
        System.out.println("Reversed String: " + revStr);
    }
}

package com.day1;

import java.util.Scanner;

public class Q5ReverseStr {
    public static String reverse(String str){
        char arr[] = str.toCharArray();
        int i=0, j=str.length()-1;
        while(i<j){
            if(!Character.isLetter(arr[i])){
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
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

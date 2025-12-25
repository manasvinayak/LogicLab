package com.day2;

import java.util.Scanner;

public class Q9Factorial {
	public static int fact(int num) {
		if(num<=1) {
			return 1;
		}
		return num*fact(num-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int ans = fact(num);
		System.out.printf("Factorial of %d is %d", num, ans);
	}

}

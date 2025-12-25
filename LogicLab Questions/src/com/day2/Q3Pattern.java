package com.day2;

import java.util.Scanner;

public class Q3Pattern {
	public static void printPat(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		sc.close();
		printPat(rows);
	}

}

package com.day2;

import java.util.Scanner;

public class Q1TempConverter {
	public static double CtoF(double val) {
		double farenheit = (val*(9.0/5.0)) + 32;
		return farenheit;
	}
	
	public static double FtoC(double val) {
		double celsius = (val-32)*(5.0/9.0);
		return celsius;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		String str = sc.next();
		System.out.print("Enter your value: ");
		double val = sc.nextDouble();
		sc.close();
		if(str.equals("CtoF")) {
			System.out.printf("Temperature in Farenheit: %.2f",CtoF(val));
		}
		else if(str.equals("FtoC")) {
			System.out.printf("Temperature in Celsius: %.2f",FtoC(val));
		}
	}
}

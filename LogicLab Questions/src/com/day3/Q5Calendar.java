package com.day3;

import java.util.Scanner;

public class Q5Calendar {
	public static String dayOfWeek(int day, int month, int year) {
		if(month<3) {
			month += 12;
			year -= 1;
		}
		int k = year%100;
		int j = year/100;
		int h = (day + (13*(month+1) / 5 + k + (k/4) + (j/4) - (2*j)));
		int num = ((h%7)+7)%7;
		String days[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		return days[num];
	}
	
	public static boolean validFeb(int day, int year) {
		boolean leap = (year%4==0 && year%100!=0) || (year%400==0);
		if(leap) {
			return day<=29;
		}
		return day<=28;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date (dd mm yyyy): ");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		if(month<1 || month>12 || day<1 || day>31) {
			System.out.println("Invalid date.");
		}
		else if(month==2 && !validFeb(day, year)) {
			System.out.println("Date is invalid for February.");
		}
		else {
			String res = dayOfWeek(day, month, year);
			System.out.println("Day of Week: " + res);
		}
		sc.close();
	}

}

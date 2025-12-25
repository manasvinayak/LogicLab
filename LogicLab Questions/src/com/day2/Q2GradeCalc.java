package com.day2;

import java.util.Scanner;

public class Q2GradeCalc {
	public static double calPercent(int marks[]) {
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += marks[i];
		}
		double percent = sum/5.0;
		return percent;
	}
	
	public static char calGrade(double percentage) {
		if(percentage>=90.0) {
			return 'A';
		}
		else if(percentage>=75.0) {
			return 'B';
		}
		else if(percentage>=60.0) {
			return 'C';
		}
		else if(percentage>=40.0) {
			return 'D';
		}
		else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];
		System.out.print("Enter marks for 5 subjects: ");
		for(int i=0; i<5; i++) {
			marks[i] = sc.nextInt();
		}
		sc.close();
		double percentage = calPercent(marks);
		char grade = calGrade(percentage);
		System.out.printf("Percentage: %.1f\n", percentage);
		System.out.println("Grade: " + grade);
	}

}

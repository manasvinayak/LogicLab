package com.day3;

import java.util.Scanner;

public class Q2Gradebook {
	public static void printAll(int n, String names[], int grades[]) {
		if(n == 0) { //For no records
            System.out.println("No records found.\n");
            return;
        }
		System.out.println("All: ");
		for(int i=0; i<n; i++) {
			System.out.printf("%d. %s (%d)\n", i+1, names[i], grades[i]);
		}
	}
	
	public static void printTopper(int n, String names[], int grades[]) {
		if(n==0) {
			System.out.println("No records. No Topper.\n");
			return;
		}
		int highest = grades[0];
		for(int i=1; i<n; i++) {
			if(grades[i]>highest) {
				highest = grades[i];
			}
		}
		System.out.println("Topper: ");
		for(int i=0; i<n; i++) {
			if(grades[i]==highest) {
				System.out.printf("%s (%d)\n",names[i], grades[i]);
			}
		}
	}
	
	public static void classAvg(int n, int grades[]) {
		if(n == 0) {
            System.out.println("No records found. Hence, Average: 0.00\n");
            return;
        }
		int sum = grades[0];
		for(int i=1; i<n; i++) {
			sum += grades[i];
		}
		double avg = (double)sum/n;
		System.out.printf("Class Average: %.2f\n", avg);
	}
	
	public static void search(int n, String names[], int grades[], String str) {
		boolean found = false;
		for(int i=0; i<n; i++) {
			if(str.equalsIgnoreCase(names[i])) {
				System.out.printf("Found: %s (%d)\n",names[i], grades[i]);
				found = true;
			}
		}
		if(found==false) {
			System.out.println("Student not found.\n");
		}
	}
	
	public static void curve(int n, int grades[]) {
		for(int i=0; i<n; i++) {
			grades[i] = (grades[i]+5)>100? 100:(grades[i]+5);
		}
		System.out.println("Done!\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Gradebook-----");
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		String names[] = new String[n];
		int grades[] = new int[n];
		for(int i=0; i<n; i++) {
			names[i] = sc.next();
			int grade = sc.nextInt();
			grades[i] = (grade < 0) ? 0 : (grade > 100) ? 100 : grade;
		}
		while(true) {
			System.out.println("1. Print All");
			System.out.println("2. Print Topper");
			System.out.println("3. Class Average");
			System.out.println("4. Search by name (case-insensitive)");
			System.out.println("5. Curve grades by +5 (cap at 100)");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			if(choice==6) {
				System.out.println("Exiting...\n");
				break;
			}
			switch(choice) {
				case 1:
					printAll(n, names, grades);
					break;
				case 2:
					printTopper(n, names, grades);
					break;
				case 3:
					classAvg(n, grades);
					break;
				case 4:
					System.out.print("Enter the name: ");
					sc.nextLine();
					String str = sc.nextLine().trim();
					if(str.isEmpty()) {
						System.out.print("Name shouldn't be empty.");
					}
					else {
						search(n, names, grades, str);
					}
					break;
				case 5:
					curve(n, grades);
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					continue;
			}
		}
		sc.close();
	}
}

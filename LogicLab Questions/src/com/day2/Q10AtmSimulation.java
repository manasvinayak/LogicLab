package com.day2;

import java.util.Scanner;

public class Q10AtmSimulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 1000.00;
		int choice;
		do {
			System.out.println("-----ATM SIMULATION-----");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Balance: " + balance);
					System.out.println();
					break;
				case 2:
					System.out.print("Enter the amount: ");
					double amt1 = sc.nextDouble();
					balance += amt1;
					System.out.println("New Balance: " + balance);
					System.out.println();
					break;
				case 3:
					System.out.print("Enter the amount: ");
					double amt2 = sc.nextDouble();
					balance -= amt2;
					System.out.println("New Balance: " + balance);
					System.out.println();
					break;
				case 4:
					System.out.println("Exiting...");
					System.out.println();
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					System.out.println();
			}
		}while(choice!=4);
		sc.close();
	}

}

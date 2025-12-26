package com.day3;

import java.util.Scanner;

public class Q4AtmSimulator {
	static double balance = 1000.00;
    static int pin = 1234;
    static Scanner sc = new Scanner(System.in);
    
	public static void deposit() {
        System.out.print("Amount to deposit: ");
        double amount = sc.nextDouble();
        if(amount > 0) { //amount can never be negative
            balance += amount; 
            System.out.printf("Deposited. Balance: %.2f\n", balance);
        } 
        else {
            System.out.println("Amount must be positive.\n");
        }
    }
	
	public static void printBalance() {
        System.out.printf("Current Balance: %.2f\n", balance);
    }
	
	public static void withdraw() {
        System.out.print("Enter PIN: ");
        int inputPin = sc.nextInt();
        if(inputPin == pin) { 
            System.out.print("Amount to withdraw: ");
            double amount = sc.nextDouble();
            if(amount > 0 && amount <= balance) { //amount can never be negative and less than balance to withdraw
                balance -= amount;
                System.out.printf("Withdrawn. Balance: %.2f\n", balance);
            } 
            else if(amount > balance) { //amount should be less than balance to withdraw 
                System.out.println("Insufficient balance to withdraw your amount.\n");
            } 
            else{
                System.out.println("Amount must be positive.\n");
            }
        } 
        else {
            System.out.println("Incorrect PIN. Please try again.\n");
        }
    }
	
    public static void changePin() {
        System.out.print("Enter Current PIN: ");
        int currentPinInput = sc.nextInt();
        if(currentPinInput == pin) {
            System.out.print("Enter New PIN: ");
            int newPin = sc.nextInt();
            pin = newPin;
            System.out.println("PIN successfully changed.\n");
        } 
        else {
            System.out.println("Current PIN is incorrect.\n");
        }
    }
	
    public static void main(String[] args) {
        int choice;
        while(true) {
            System.out.println("----- MINI ATM SIMULATOR -----");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Change PIN\n5. Exit");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            if(choice == 5) {
                System.out.println("Exiting....\n");
                break; 
            }
            switch(choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    printBalance();
                    break;
                case 4:
                    changePin();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    continue; 
            }
        }
    }
}
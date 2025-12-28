package com.day4;

class BankAccount {
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		if(balance<0) {
			System.out.println("Balance should always be positive.");
		}
		else {
			this.balance = balance;
		}
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.printf("Amount Deposited.\nNew balance: %.2f\n", balance);
		}
		else {
			System.out.println("Amount must be positive");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.printf("Amount Withdrawn.\nRemaining balance: %.2f\n", balance);
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance to withdraw amount.");
		}
		else {
			System.out.println("Amount must be positive.");
		}
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void applyFee(double fee) {
		if(fee>0 && fee<=balance) {
			balance -= fee;
			System.out.printf("Fee of %.2f applied.\nNew balance: %.2f\n", fee, balance);
		}
		else {
			System.out.println("Fee cannot be applied on the account.");
		}
	}
}

public class Q6BankAc {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Manasvi", 1000.00);
		acc.deposit(500);
		acc.withdraw(300);
		System.out.printf("Balance: %.2f\n", acc.getBalance());
	}

}

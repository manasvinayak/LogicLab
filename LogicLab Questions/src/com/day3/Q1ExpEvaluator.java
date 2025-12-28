package com.day3;

import java.util.Scanner;

public class Q1ExpEvaluator {
	public static int evaluate(String exp) {
		int nums[] = new int[exp.length()];
		char operators[] = new char[exp.length()];
		int numCount = 0;
		int opCount = 0;
		
		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			if(c==' ') {
				continue;
			}
			if(Character.isDigit(c)) {
				int val = 0;
				while(i<exp.length() && Character.isDigit(exp.charAt(i))) {
					val = val*10 + (exp.charAt(i)-'0');
					i++;
				}
				i--;
				if(opCount>0 && (operators[opCount-1]=='*' || operators[opCount-1]=='/')) {
					int lastnum = nums[numCount-1];
					int lastop = operators[opCount-1];
					if(lastop=='*') {
						nums[numCount-1] = lastnum * val;
					}
					else {
						nums[numCount-1] = lastnum / val;
					}
					opCount--;
				}
				else {
					nums[numCount++] = val;
				}
			}
			else if(c=='+' || c=='-' || c=='*' || c=='/') {
				operators[opCount++] = c;
			}
			else {
				System.out.println("Invalid Charcter: " + c);
				System.exit(0);
			}
		}
		
		int res = nums[0];
		for(int i=0; i<opCount; i++) {
			if(operators[i]=='+') {
				res += nums[i+1];
			}
			else if(operators[i]=='-') {
				res -= nums[i+1];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your expression: ");
		String exp = sc.nextLine();
		if(exp.trim().isEmpty()) {
			System.out.println("Empty expressions are not allowed.");
		}
		else {
			int res = evaluate(exp);
			System.out.printf("Result of your expression: %d", res);
		}
		sc.close();
	}

}

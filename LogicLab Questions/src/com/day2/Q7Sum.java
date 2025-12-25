package com.day2;

import java.util.Scanner;

public class Q7Sum {
	public static int sumEven(int size, int arr[]) {
		int even = 0;
		for(int i=0; i<size; i++) {
			if(arr[i]%2==0) {
				even += arr[i];
			}
		}
		return even;
	}
	
	public static int sumOdd(int size, int arr[]) {
		int odd = 0;
		for(int i=0; i<size; i++) {
			if(arr[i]%2!=0) {
				odd += arr[i];
			}
		}
		return odd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter your elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int even = sumEven(size, arr);
		int odd = sumOdd(size, arr);
		System.out.println("Sum of Even numbers: " + even);
		System.out.println("Sum of Odd numbers: " + odd);
	}

}

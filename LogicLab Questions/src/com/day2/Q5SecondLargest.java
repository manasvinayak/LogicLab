package com.day2;

import java.util.Scanner;

public class Q5SecondLargest {
	public static int secLargestEle(int size, int arr[]) {
		int large = Integer.MIN_VALUE, seclarge = Integer.MIN_VALUE;
		for(int i=1; i<size; i++) {
			if(arr[i]>large) {
				seclarge = large;
				large = arr[i];
			}
			else if(arr[i]!=large && arr[i]>seclarge) {
				seclarge = arr[i];
			}
		}
		return seclarge;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter elements of the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int res = secLargestEle(size, arr);
		System.out.println("Second largest element: " + res);
	}

}

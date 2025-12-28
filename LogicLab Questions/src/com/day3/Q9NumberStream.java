package com.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9NumberStream {
	public static int getCount(ArrayList<Integer> nums) {
		return nums.size();
	}
	
	public static int getSum(ArrayList<Integer> nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
	
	public static int getMin(ArrayList<Integer> nums) {
		int mini = nums.get(0);
		for(int i=1; i<nums.size(); i++) {
			if(mini>nums.get(i)) {
				mini = nums.get(i);
			}
		}
		return mini;
	}

	public static int getMax(ArrayList<Integer> nums) {
		int maxi = nums.get(0);
		for(int i=1; i<nums.size(); i++) {
			if(maxi<nums.get(i)) {
				maxi = nums.get(i);
			}
		}
		return maxi;
	}
	
	public static double getAvg(ArrayList<Integer> nums) {
		double sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum/nums.size();
	}
	
	public static double getMedian(ArrayList<Integer> nums) {
		int n = nums.size();
		if(n%2!=0) {
			return nums.get(n/2);
		}
		else {
			return (nums.get(n/2 - 1) + nums.get(n/2)) / 2.0;
		}
	}
	
	public static int getMode(ArrayList<Integer> nums) {
		int mode = nums.get(0);
        int maxFreq = 0;

        for (int i = 0; i < nums.size(); i++) {
            int currentVal = nums.get(i);
            int currentFreq = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == currentVal) currentFreq++;
            }
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                mode = currentVal;
            }
        }
        return mode;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.print("Enter the numbers: ");
		while(true) {
			if (!sc.hasNextInt()) {
                sc.next(); 
                continue;
            }
            int input = sc.nextInt();
            if (input == -999) {
                break;
            }
            nums.add(input);
		}
		int cnt = getCount(nums);
		int sum = getSum(nums);
		int mini = getMin(nums);
		int maxi = getMax(nums);
		double avg = getAvg(nums);
		double med = getMedian(nums);
		int mode = getMode(nums);
		System.out.printf("Count=%d, Sum=%d, Min=%d, Max=%d, Avg=%.2f, Median=%.2f, Mode=%d", cnt, sum, mini, maxi, avg, med, mode);
		sc.close();
	}
}

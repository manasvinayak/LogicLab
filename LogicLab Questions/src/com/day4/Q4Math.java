package com.day4;

class MathUtil {
	public static int max(int a, int b) {
		int maximum = (a > b)? a : b;
		return maximum;
	}
	
	public static int clamp(int v, int min, int max) {
		if(min > max) {
			System.out.println("Minimum value cannot be greater than Maximum value");
			System.exit(0);
		}
		if(v < min) {
			return min;
		}
		else if(v > max) {
			return max;
		}
		else {
			return v;
		}
	}
}

public class Q4Math {

	public static void main(String[] args) {
		System.out.println(MathUtil.max(7, 3));
		System.out.println(MathUtil.clamp(15, 0, 10));
		System.out.println(MathUtil.clamp(-3, -2, 5));
	}

}

package com.day4;

class Counter {
	private int value;
	public static int instances = 0;
	
	public Counter() {
		this.value = 0;
		instances++;
	}
	
	public void increment() {
		value++;
		System.out.println("Value incremented.");
	}
	
	public void decrement() {
		value--;
		System.out.println("Value decremented.");
	}
	
	public int getvalue() {
		return value;
	}
}

public class Q7Count {

	public static void main(String[] args) {
		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();
		System.out.println("Counter instances are: " + Counter.instances);
	}

}

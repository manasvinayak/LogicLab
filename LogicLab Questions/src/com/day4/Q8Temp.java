package com.day4;

class Temperature {
	private final double celsius;
	
	public Temperature(double celsius) {
		this.celsius = celsius;
	}
	
	public double toFahrenheit() {
		double fahrenheit = (celsius * (9.0/5.0)) + 32;
		return fahrenheit;
	}
	
	public Temperature withCelsius(double c) {
		return new Temperature(c);
	}
	
	public double getCelsius() {
		return celsius;
	}
}

public class Q8Temp {

	public static void main(String[] args) {
		Temperature t = new Temperature(25.0);
		System.out.printf("Temperature in fahrenheit: %.2f\n", t.toFahrenheit()); 
		Temperature t2 = t.withCelsius(30.0); 
		System.out.printf("Temperature of second object: %.2f\n", t2.getCelsius());
		System.out.printf("Temperature of first object: %.2f\n", t.getCelsius());
	}

}

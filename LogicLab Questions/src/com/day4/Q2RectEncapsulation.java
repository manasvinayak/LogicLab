package com.day4;

class Rectangle {
	private double width;
	private double height;
	
	public void setWidth(double width) {
		if(width<=0) {
			System.out.println("Width should be greater than zero.");
			return;
		}
		this.width = width;
	}

	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		if(height<=0) {
			System.out.println("Height should be greater than zero.");
			return;
		}
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double area() {
		double areaRect = width * height;
		return areaRect;
	}
	
	public double perimeter() {
		double periRect = 2 * (width + height);
		return periRect;
	}
	
}

public class Q2RectEncapsulation {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setWidth(10);
		r.setHeight(5);
		System.out.printf("Area of rectangle: %.2f\n", r.area());      
		System.out.printf("Perimeter of rectangle: %.2f\n", r.perimeter()); 
		r.setWidth(0); 
	}

}

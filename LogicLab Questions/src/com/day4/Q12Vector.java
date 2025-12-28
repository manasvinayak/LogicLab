package com.day4;

class Vector2D {
	private double x;
	private double y;
	public static final Vector2D ZERO = new Vector2D(0, 0);
	public static final Vector2D UNIT_X = new Vector2D(1, 0);
	public static final Vector2D UNIT_Y = new Vector2D(0, 1);
	
	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static Vector2D fromPolar(double r, double theta) {
		return new Vector2D(r*Math.cos(theta), r*Math.sin(theta));
	}
	
	public Vector2D add(Vector2D other) {
		return new Vector2D(this.x + other.x,  this.y + other.y);
	}

	public Vector2D scale(double s) {
		return new Vector2D(s*this.x, s*this.y);
	}
	
	public double magnitude() {
		return Math.sqrt(x*x+y*y);
	}
	
	@Override
	public String toString() {
		return String.format("(%.2f, %.2f)", x, y);
	}
}

public class Q12Vector {

	public static void main(String[] args) {
		Vector2D v = Vector2D.fromPolar(2, Math.PI/2); 
		Vector2D w = Vector2D.UNIT_X.add(v); 
		System.out.println("Vector v: " + v);
		System.out.println("Vector w: " + w);
		System.out.printf("Magnitude of Vector v: %.2f", v.magnitude());
	}

}

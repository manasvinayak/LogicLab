package com.day4;

class IDGenerator {
	private static int next = 1000;
	
	public static int nextId() {
		return next++;	
	}
}

class User {
	private final int id;
	private String name;
	
	public User(String name) {
		id = IDGenerator.nextId();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}

public class Q10ID {

	public static void main(String[] args) {
		User u1 = new User("A");
		User u2 = new User("B");
		System.out.println("ID of User 1: " + u1.getId() + ", Name of User 1: " + u1.getName());
		System.out.println("ID of User 2: " + u2.getId() + ", Name of User 2: " + u2.getName());
	}

}

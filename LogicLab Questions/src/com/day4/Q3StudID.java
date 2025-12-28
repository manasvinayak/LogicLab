package com.day4;

class Student {
	final int id;
	private String name;
	
	public Student(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

public class Q3StudID {

	public static void main(String[] args) {
		Student s = new Student(101);
		s.setName("Alice");
		System.out.println(s.getId());
		System.out.println(s.getName());
		//s.id = 202;  //Generates error
	}

}

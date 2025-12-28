package com.day4;

class Employee {
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.isEmpty()) {
			System.out.println("Name cannot be empty.");
			return;
		}
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double s) {
		if(s<10000 || s>500000) {
			System.out.println("Salary must be between 10000 to 500000.");
			return;
		}
		salary = s;
	}
	
	public void raise(double percent) {
		if(percent<0 || percent>100) {
			System.out.println("Percent must be between 0 to 100.");
			return;
		}
		salary += salary * (percent/100.0);
		System.out.printf("Salary raised.\nNew Salary: %.2f\n", salary);
	}
}

public class Q13EmployeeEncap {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("");          
		e.setSalary(9000);      
		e.setSalary(120000);
		e.raise(10);        
		e.raise(200);
	}

}

package com.day4;

class AccessDemo {
	public void publicMethod() {
		System.out.println("This is a public method.");
	}
	
	protected void protectedMethod() {
		System.out.println("This is a protected method.");
	}
	
	void defaultMethod() {
		System.out.println("This is a default method.");
	}
	
	private void privateMethod() {
		System.out.println("This is a private method.");
	}
}

public class Q9AccessModifiers {

	public static void main(String[] args) {
		AccessDemo ad = new AccessDemo();
		ad.publicMethod();
		ad.protectedMethod();
		ad.defaultMethod();
		//ad.privateMethod(); //Gives error Exception in thread "main" java.lang.Error: Unresolved compilation problem: The method privateMethod() from the type AccessDemo is not visible
	}

}

package javaBasics;

public class VariableTypes {
	
	// Object -> representing class, something that has properties (state & behavior)
	
			// State -> variables
			// Behavior -> function/method
	
	// Types of Variable:
//		1. Class variable - variable created inside the class but outside of any method, is static in nature (with static keyword)
//		2. Instance variable - variable created inside the class but outside of any method, is non-static in nature (no static keyword)
//		3. Local variable - variable created inside a method, exit inside the method
	
	// parameters -> ???
	
	String fullName = "Jack Dorsey"; // instance variable
	static String emailAdd = "jackd@gmail.com"; // class variable
	
	void testMethod() {
		String name = "Jack"; // local variable
		System.out.println(name);
		System.out.println(fullName);
		System.out.println(emailAdd);
	}
		
	

	public static void main(String[] args) {
//		System.out.println(name); // not found/visible
		System.out.println(emailAdd);

	}

}

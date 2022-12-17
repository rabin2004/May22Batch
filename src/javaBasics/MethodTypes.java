package javaBasics;

public class MethodTypes {
	
	// OOPS -> Object Orientated Programming language
	
		// Object -> representing class, something that has properties (state & behavior)
		
			// State -> variables
			// Behavior -> function/method

	// Basic requirement to create a method: 
					// 1. return type (default void -> return nothing )
					// 2. method signature -> methodName()
					// 3. method block/code block -> {code}
	
	static void test() { // Method without parameter
		 System.out.println("Method without parameter");
	}
	
	// parameter -> allows method to accept data/values, defined inside method signature -> defined as dataType & referenceName
	static void parameterizedMethod(String name) { // Method with single parameter
		System.out.println(name.toUpperCase());
	}
	
	// Based on parameter - Method types
		// 1. Method without parameter: - no parameter
		// 2. Method with single parameter: 
		// 3. Method with multiple parameter: same or different parameter
	
	static void multipleParameters(String name, int age, boolean marriedUnmarried) {
		System.out.println(name.toUpperCase()+ "'s Profile:");
		System.out.println("Name: "+name.toUpperCase());
		System.out.println("Age: "+age);
		if(marriedUnmarried==true) {
			System.out.println("Married: "+"Yes");
		}else {
			System.out.println("Married: "+"No");
		}
	}
	
//	void test() { // duplicate method -> creating multiple with same method signature
//		
//	}
//	
//	void multipleParameters(String fullName, int age, boolean graduated) { // duplicate method -> creating multiple with same method signature
//		
//	}
	
	// Method Overloading -> creating multiple with same name but different parameter
	static void test(int a) {
		System.out.println(a);
	}
	
	static void test(String a) {
		System.out.println(a);
	}
	
	static void test(int a, String b) {
		System.out.println(a+b);
	}
	
	static void test(String b, int a) {
		System.out.println(a+b);
	}
	
	// Constructor -> 
		// 1. special method that carries className
		// 2. no return type
		// 3. will be called with instance/object creation
		// 4. if constructor isn't explicitly created will be created as soon as object/instance is created for the class
		// e.g placing code that needs to be executed first, assigning values to instance variable
		// Constructor overloading
	
	MethodTypes(){
		System.out.println("Constructor");
	}
	
	MethodTypes(String a){
		System.out.println(a);
	}
	
	MethodTypes(String a, String b){
		System.out.println(a+b);
	}
	
	// return type -> void-returning nothing
	
	static String returningCustomerInital(String firstName, String lastName) {
		String initial = firstName.substring(0, 1).toUpperCase()+lastName.substring(0,1).toUpperCase();
		return initial;
	}
	
	public static void main(String[] args) {
		test();
		test(500);
		test("jack dorsey");
		test(500, "jack");
		test("jack", 500);
		parameterizedMethod("jack");
		multipleParameters("jack", 40, false);
		
		MethodTypes mt = new MethodTypes(); // calling empty constructor
		MethodTypes mt1 = new MethodTypes("Jack"); // calling constructor with parameter
		MethodTypes mt2 = new MethodTypes("jack", "dorsey");
		
		System.out.println(returningCustomerInital("jack","dorsey"));
	}

}

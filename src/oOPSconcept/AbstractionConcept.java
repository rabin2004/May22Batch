package oOPSconcept;

public abstract class AbstractionConcept { 
	// class Vs abstract class ??
	// abstract class 	-> can handle abstract method | doesn't need to have one
					//	-> can't instantiate abstract class
	
	// Abstraction -> different than usual
	
	// Basic requirement to create a method: 
		// 1. return type (default void -> return nothing )
		// 2. method signature -> methodName()
		// 3. method block/code block -> {code}
	
	void test() {
		// code
	}
	
	// abstract method Vs method ??
	
	// abstract method 	-> no implementation -> abstract keyword -> class needs to be abstract
					//	-> can't be static
	public abstract void abstractMethod();

	public static void main(String[] args) {
//		AbstractionConcept ac = new AbstractionConcept();

	}

}

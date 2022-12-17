package javaBasics;

public class OperationsConcept {
	
	// Operation: 
		// 1. Arithmetic Operation: -> +,-,*,/
		// 2. Comparative Operation: -> output: boolean
			// Comparative operators:
				// a. equals to - "=="
				// b. not equal to - "!="
				// c. more than - ">"
				// d. less than - "<"
				// e. more than or equal to - ">="
				// f. less than or equal to - "<="

	public static void main(String[] args) {
		int a = 10;
		int b;
		b = 20;
		
		int c = a+b; // + -> addition
		System.out.println("Addition: "+c); // + -> place operator/concatenation
		
		c = a-b;
		System.out.println("Substraction: "+c);
		
		c = a*b;
		System.out.println("Multiplication: "+c);
		
		c = a/b;
		System.out.println("Division: "+c); // 0.5
		
		float x,y,z;
		x = 10f;
		y = 20f;
		z = x/y;
		System.out.println("Division using float dataType: "+z);
		System.out.println("Multiplication: "+(x*y));
		System.out.println("Multiplication: "+x*y);
		System.out.println("Addition: "+x+y); // Addition: 10.020.0
		System.out.println(x+y+" :Addition");
		System.out.println("Substraction: "+(x-y));
		
		
		// Temperature conversion: C->F / F->C
		int tempC, tempF;
		int expectedTempC, expectedTempF;
		
		expectedTempC = 37;
		expectedTempF = 98;
		
		tempC = 37;
		
		tempF = (tempC*9/5)+32;
		System.out.println("Temperature in F: "+tempF);
		System.out.println("Correct result: "+(tempF==expectedTempF));
		
		tempC = (tempF-32)*5/9;
		System.out.println("Temperature in C: "+tempC);
		System.out.println("Correct result: "+(tempC==expectedTempC));
		
		
		// Comparison:
		boolean result = x==y;
		System.out.println(result); // false
		result = x!=y;
		System.out.println(result); // true
		result = x>y;
		System.out.println(result); // false
		result = x<y;
		System.out.println(result); // true
		result = x>=y;
		System.out.println(result); // false
		result = x<=y;
		System.out.println(result); // true
		
		x=y;
		result = x==y;
		System.out.println(result); // true
		result = x!=y;
		System.out.println(result); // false
		result = x>y;
		System.out.println(result); // false
		result = x<y;
		System.out.println(result); // false
		result = x>=y;
		System.out.println(result); // true
		result = x<=y;
		System.out.println(result); // true
		
		// String comparison
		String actualName = "David";
		String expectedName = "David";
		System.out.println("Same person: "+(actualName==expectedName)); // true
		
		String expected = new String("David");
		System.out.println("Same person: "+(actualName==expected)); // false
		
	}
	// Assignment: Tax/Area of shape/Money exchange/Pay check -> actual & expected -> Comparison

}

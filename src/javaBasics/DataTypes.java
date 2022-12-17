package javaBasics;

public class DataTypes {
	
	// Data Types:
			// 1. Primitive Data Type: pre-defined data type
					// Numerical Data Type
						// Whole Numbers:
							// byte: smallest, +/-
							// short: bigger than byte, +/-
							// int (integer): bigger than short, +/-
							// long: biggest, +/-, "l" or "L"
		
						// Decimals:
							// float: small, +/-, "f" or "F"
							// double: big, +/-, "d" or "D"
		
					// Non Numerical Data Type
						// boolean: true or false -> condition
						// char (character): single alphabetic or numerical character
			
			// 2. Class/Object reference Data Type: not pre-defined data type, separate class it is referring
					// String: anything inside double quotation, can be alphabetic or numerical or special character or blank spaces or combination

	// Creating Variables: 
		// Requirement to create variables: 1. Data types	2. Reference Name	3. Data/Value assigned
	
	public static void main(String[] args) {
		byte byteData = 10;
		System.out.println(byteData);
		short shortData = 100;
		System.out.println(shortData);
		int integerData = 1000;
		System.out.println(integerData);
		long longData = 10000000000L;
		System.out.println(longData);
		
		int a; // variable not initialized/unassigned variable
		a=10; // assigning value
		int b,c;
		b=100;
		c=b; // assign reference name
//		int a = 1000; // duplicate variable
		a=1000; // re-assigning value
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		float floatData = 10.99F;
		System.out.println(floatData);
		floatData = 10.9999999F;
		System.out.println(floatData);
		
		double doubleData = 10.999999d;
		System.out.println(doubleData);
		doubleData = 10.999999999999999d;
		System.out.println(doubleData);
		
		boolean booleanTrueData = true;
		boolean booleanFalseData = false;
		System.out.println(booleanTrueData+" "+booleanFalseData);
		
		char characterUpperAlphData = 'A';
		char characterLowerAlphData = 'b';
		char characterNumData = '9';
		System.out.println(characterUpperAlphData+" "+characterLowerAlphData+" "+characterNumData);
		
		// Object/Class reference data Types
		String stringData = "123     (^*&%^%^%^&    sifhdiisdfhsdfhsdfjh"; // #1 creating String - Regular variable creation
		System.out.println(stringData);
		
		String objectTypeCreation = new String("Hello Java ##123!!"); // #2 creating String - Object/instance variable creation
		System.out.println(objectTypeCreation);
	}
	
	// Assignment: Printing/Comment/DataTypes/Creating Variable/Calling reference name/Assigning & Re-assigning

}

package javaBasics;

public class StringManipulation {

	public static void main(String[] args) {
		String actualName = "David";
		String expectedName = "David";
		System.out.println("Same person: "+(actualName==expectedName)); // true
		
		String expected = new String("David");
		System.out.println("Same person: "+(actualName==expected)); // false
		
	// comparing Strings
		
		// equals() -> boolean output, case sensitive
		System.out.println(actualName.equals(expectedName));
		System.out.println(actualName.equals(expected));
		System.out.println(expectedName.equals(expected));
		expected = "DAVID";
		System.out.println(actualName.equals(expected));
		System.out.println(expectedName.equals(expected));
		// equalsIgnoreCase() -> boolean output, not case sensitive
		System.out.println(actualName.equalsIgnoreCase(expected));
		System.out.println(expectedName.equalsIgnoreCase(expected));
		
		// compareTo() -> integer output-zero:same|non-zero:different, case sensitive
		System.out.println(actualName.compareTo(expectedName)); //0
		System.out.println(actualName.compareTo(expected)); //32
		
		// compareToIgnoreCase() -> integer output-zero:same|non-zero:different, not case sensitive
		System.out.println(actualName.compareToIgnoreCase(expected));
		
	// size of String -> number of characters
		String paragraph = "With Chrome profiles you can separate all your Chrome stuff. Create profiles for friends and family, or split between work "
				+ "and fun. With Chrome profiles you can separate all your Chrome stuff. Create profiles for friends and family, or "
				+ "split between work and fun.";
		System.out.println(paragraph.length());
		
	// Change casing
		// change to lower case
		String lowerCasedParagraph = paragraph.toLowerCase();
		System.out.println(lowerCasedParagraph);
		// change to upper case
		String upperCasedParagraph = paragraph.toUpperCase();
		System.out.println(upperCasedParagraph);
		
	// to capture specific section of string - substring()
		String name = "David Jackson";
		String lastName = name.substring(6);
		System.out.println(lastName);
		String lastNameShortHand = name.substring(6, 10);
		System.out.println(lastNameShortHand);
		
	// position of character -> position = index+1 | index = position-1
		int indexOfJ = name.indexOf('J');
		System.out.println(indexOfJ);
		int positionOfJ = indexOfJ+1;
		System.out.println(positionOfJ);
		
		name = "Davida Jacksona";
		System.out.println("First occurrence of a: "+name.indexOf('a')); // 1st occurrence
		System.out.println("Last occurrence of a: "+name.lastIndexOf('a'));
		System.out.println("Second occurrence of a: "+name.indexOf('a', 2));
		System.out.println("Second occurrence of a: "+name.indexOf('a', name.indexOf('a')+1));
		System.out.println("Third occurrence of a: "+name.indexOf('a', 6));
		System.out.println("Third occurrence of a: "+name.indexOf('a', name.indexOf('a', name.indexOf('a')+1)+1));
		
		System.out.println("First occurrence of chrome: "+paragraph.indexOf("Chrome"));
		System.out.println("Last occurrence of chrome: "+paragraph.lastIndexOf("Chrome"));
			
	// character at a given position	
		System.out.println("Character at 101: "+paragraph.charAt(101));
		
	// concat()	
		String FirstName = "David";
		String LastName = "Jackson";
		
		String fullName = FirstName+" "+LastName;
		System.out.println(fullName);
		fullName = FirstName.concat(" ".concat(LastName));
		System.out.println(fullName);
		
	// contains() -> boolean, case sensitive
		boolean result = paragraph.contains("Chrome");
		System.out.println(result);
		System.out.println(fullName.contains("J"));
		
	// replace()
		System.out.println(fullName.replace('J', 'j'));
		System.out.println(fullName.replace("Jack", "")); // remove 
		
	// trim()
		fullName = "      Jack K      ";
		System.out.println("Welcome"+" "+fullName+"!");
		System.out.println("Welcome"+" "+fullName.trim()+"!");
		
	// validating blank space and no character	
		String fullName1 = "";
		String fullName2 = "       ";
		System.out.println(fullName1.length());
		System.out.println(fullName2.length());
		
		System.out.println(fullName1.isEmpty());
		System.out.println(fullName1.isBlank());
		System.out.println(fullName2.isEmpty());
		System.out.println(fullName2.isBlank());
		
		if(fullName1.isBlank() || fullName1.isEmpty()) {
			System.err.println("Provided full name is invalid. Please Try again!");
		}
		
		if(fullName2.isBlank() || fullName2.isEmpty()) {
			System.err.println("Provided full name is invalid. Please Try again!");
		}
		
		// split() ---- ???????
		String cusName = "David johns";
		String[] cusNameSplit = cusName.split(" "); // Regular expression
		String firstName = cusNameSplit[0];
		lastName = cusNameSplit[1];
		String custInt = firstName.substring(0,1)+lastName.substring(0,1);
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName);
		System.out.println("Your Intial: "+custInt);
		
		
		// toCharArray() -> to convert string into array of characters
		char[] cusNameArray = cusName.toCharArray();
		for(char a: cusNameArray) {
			System.out.println(a);
		}
		
		for(int i=cusNameArray.length-1; i>=0; i--) {
			System.out.print(cusNameArray[i]);
		}
	}
	
	// Assignment: Library application | Student profile lookup | Login functionality | Registration functionality
	

}

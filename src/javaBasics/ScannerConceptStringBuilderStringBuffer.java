package javaBasics;

import java.util.Scanner;

public class ScannerConceptStringBuilderStringBuffer {
	
	// Scanner -> class, take user input

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // instance/object of Scanner class
//		System.out.print("Enter first value: ");
//		int a = scan.nextInt();
//		System.out.println();
//		System.out.print("Enter second value: ");
//		int b = scan.nextInt();
//		System.out.println();
//		scan.close();
		
		// mathematical operation
//		System.out.println("Addition: "+(a+b));
//		System.out.println("Substraction: "+(a-b));
//		System.out.println("Mutiple: "+(a*b));
//		System.out.println("Division: "+(a/b));

		
		// Print Initial
//		System.out.print("First name: ");
//		String firstName = scan.nextLine();
//		System.out.println();
//		System.out.print("Last name: ");
//		String lastName = scan.nextLine();
//		scan.close();
//		
//		String intial = firstName.substring(0, 1).concat(lastName.substring(0, 1)).toUpperCase();
//		
//		System.out.println();
//		System.out.println("Your initial is "+intial);
		
		
		// StringBuilder & StringBuffer -> String helper class
		
		// reversing String
		System.out.print("Enter your full name: ");
		String name = scan.nextLine();
		scan.close();
		System.out.println();
		
//		System.out.print("Reversed name: ");
//		for(int i=name.length()-1; i>=0; i--) {
//			System.out.print(name.charAt(i));
//		}
		
		// remove space between firstName & lastName
		String spaceRemovedString = name.replace(" ", "");
		System.out.println("Space removed name: "+spaceRemovedString);
		
		// Space back in name
//		String firstName = spaceRemovedString.substring(0, spaceRemovedString.indexOf(name.charAt(0)));
//		String lastName = spaceRemovedString.substring(spaceRemovedString.indexOf(name.indexOf(" ")));
//		System.out.println(firstName.concat(" ".concat(lastName)));
		
		StringBuilder sb = new StringBuilder(name);
//		System.out.println("Reveresed name: "+sb.reverse());
		System.out.println("Space removed name: "+sb.deleteCharAt(name.indexOf(" ")));
		System.out.println("Space back in name: "+sb.insert(name.indexOf(" "), " "));
		
		StringBuffer sbu = new StringBuffer(name);
		System.out.println("Reveresed name: "+sbu.reverse());
		System.out.println("Space removed name: "+sbu.deleteCharAt(name.indexOf(" ")));
		System.out.println("Space back in name: "+sbu.insert(name.indexOf(" "), " "));

	}

}

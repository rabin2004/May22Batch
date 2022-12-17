package javaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAssignment {

	public static void main(String[] args) {
		// Login Functionality
		
		// in DB
//		String userNameDB = "test12";
//		String passwordDB = "test@123";
//		
//		// input values
//		Scanner scan = new Scanner(System.in);
////		String userNameInput = "test12";
////		String passwordInput = "test123";
//		System.out.print("Username: ");
//		String userNameInput = scan.nextLine();
//		System.out.println();
//		System.out.print("Password: ");
//		String passwordInput = scan.nextLine();
//
//		// login logic
//		if(userNameInput.equals(userNameDB) && passwordInput.equals(passwordDB)) {
//			System.out.println("Login Successful!");
//		}else{
//			System.err.println("Incorrect username or pasword. Try again!");
////			userNameInput = "test1";
////			passwordInput = "test@123";
//			System.out.print("Username: ");
//			userNameInput = scan.nextLine();
//			System.out.println();
//			System.out.print("Password: ");
//			passwordInput = scan.nextLine();
//			scan.close();
//			if(userNameInput.equals(userNameDB) && passwordInput.equals(passwordDB)) {
//				System.out.println("Login Successful!");
//			}else{
//				System.err.println("Incorrect username or pasword. Multiple attempt, account blocked. Contact customer service!");
//			}
//		}
		
		String[] customer1 = {"David", "Johns", "30","Male"};
		String[] customer2 = {"Mike", "Johns", "35","Male"};
		String[] customer3 = {"Mary", "Johns", "36","Female"};
		
		ArrayList<String[]> customers = new ArrayList<String[]>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		
		String cusLookUp = "mike";
		for(String[] a: customers) {
			for(int i=0; i<a.length; i++) {
				if(cusLookUp.equalsIgnoreCase(a[0])) {
					System.out.println("Registered customer");
					break;
				}
			}
		}
		
	}

}

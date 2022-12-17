package oOPSconcept;

import java.util.Scanner;

public class UnderstandingEncapsulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 16 digit Debit Card number: ");
		String debitCardNumber = scan.nextLine();
		System.out.println("Security code (3 digit at of the card): ");
		String securityCode = scan.nextLine();
		System.out.println("Expiry date (MM/YYYY):");
		String expiryDate = scan.nextLine();
		scan.close();
		
		EncapsulationConcept ec = new EncapsulationConcept();
		ec.setDebitCardNumber(debitCardNumber);
		ec.setSecurityCode(securityCode);
		ec.setExpirationDate(expiryDate);
		
		System.out.println("Confirm following details provided: ");
		System.out.println("Last four of Card: "+ec.getDebitCardNumber());
		System.out.println("Security code: "+ec.getSecurityCode());
		System.out.println("Expiry date: "+ec.getExpirationDate());
	}

}

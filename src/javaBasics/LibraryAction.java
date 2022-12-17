package javaBasics;

import java.util.Scanner;

public class LibraryAction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter this month's value: ");
		System.out.println("---------------------------");
		System.out.println("Total book count: ");
		int bookCount = scan.nextInt();
		System.out.println("Total book category: ");
		int categories = scan.nextInt();
		System.out.println("Total staff: ");
		int libraryStaff = scan.nextInt();
		scan.close();
		
		LibraryClass lc = new LibraryClass(bookCount,categories,libraryStaff);
		lc.monthlyReport();

	}

}

package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	// ArrayList -> class, methods defined in ArrayList

	public static void main(String[] args) {
//		ArrayList ar = new ArrayList(); // non-parameterized/Raw type
		ArrayList<String> ar1 = new ArrayList<String>(); // parameterized
		
		// inserting data
//		ar.add(123);
//		ar.add("Test");
//		ar.add(true);
		ar1.add("David");
//		ar1.add(123);
		ar1.add("Micheal");
		ar1.add("Mary");
		ar1.add("John");
		ar1.add("Tan");
		
		// number of rows
		System.out.println("Number of rows: "+ar1.size());
		
		System.out.println(ar1);
		
		// add data in the middle
		ar1.add(1, "Jack");
		System.out.println(ar1);
		
		// to check data
		System.out.println("If Mike is present? "+ar1.contains("Mike"));
		System.out.println("If Mike is present? "+ar1.contains("John"));
		
		// remove data
		ar1.remove(4);
		System.out.println(ar1);
		
		// extract value
		System.out.println(ar1.get(4));
		
		// duplicate the table
		Object copy = ar1.clone();
		
		// compare data table
		System.out.println(ar1.equals(copy));
		ArrayList<String> ar2 = new ArrayList<String>();
//		ar2.add("David");
		ar2.add("Jack");
		ar2.add("Micheal");
		ar2.add("Mary");
		ar2.add("Tan");
		ar2.add("David");
		System.out.println("Are they same? "+ar1.equals(ar2));
		
		// empty arrayList
		ar1.clear();
		System.out.println(ar1);
		System.out.println(ar1.isEmpty());
		
		System.out.println(ar1.equals(copy));

		// Traversing ArrayList
		// 1. for
//		for(int i=0; i<ar2.size(); i++) {
//			System.out.print(ar2.get(i)+" ");
//		}
		// 2. while
//		int i=0;
//		while(i<ar2.size()) {
//			System.out.print(ar2.get(i)+" ");
//			i++;
//		}
		// 3. for each loop
//		for(String a: ar2) {
//			System.out.print(a+" ");
//		}
		// 4. iterator concept
		Iterator<String> it = ar2.iterator();
//		System.out.println("Customer from first row: "+it.next());
//		System.out.println("Is there 2nd row? "+it.hasNext());
//		System.out.println("Customer from 2nd row: "+it.next());
//		System.out.println("Customer from 3rd row: "+it.next());
//		System.out.println("Customer from 4th row: "+it.next());
//		System.out.println("Customer from 5th row: "+it.next());
//		System.out.println("Is there 2nd row? "+it.hasNext());
//		System.out.println("Customer from 6th row: "+it.next()); // NoSuchElementException
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
	// Assignment: Library application | Student profile lookup | Login functionality | Registration functionality

}

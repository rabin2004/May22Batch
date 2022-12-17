package javaBasics;

public class ArrayConcept {
	
	// Array -> to create a data table
			// 1-Dimensional (1-D) array -> one column
			// 2-D array -> multiple column

	public static void main(String[] args) {
		// 1-D array
		// #1 creating 1-D array
//		String[] customerName = new String[4]; // String customerName[] = new String[4];
		// inserting data
//		customerName[0] = "David";
//		customerName[1] = "Thomas";
//		customerName[2] = "Lacy";
//		customerName[3] = "Maria";
//		customerName[4] = "Luis"; // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		
		// #2 creating 1-D array
//		String customerName[] = {"Daivd","Thomas","Lacy","Maria","Luis","Micheal","Lena"};
//		
//		// extracting data
//		System.out.println(customerName[1]);
//		System.out.println(customerName[3]);
//		
//		// size of array => number of rows
//		System.out.println("Number of rows: "+customerName.length);
//		
//		// looping concept
//		for(int i=0; i<customerName.length; i++) {
////			System.out.print(customerName[i]+" | ");
//			if(customerName[i].equals("Maria")) {
//				System.out.println("Old Customer");
//				break;
//			}
//		}
		
		// 2-D array:
		// #1 creating array
//		int[][] numbers = new int[3][4];  // int numbers[][] = new int[3][4]; -> int[row][column];
		
		// inserting data
		// 1st row
//		numbers[0][0] = 10; 
//		numbers[0][1] = 20;
//		numbers[0][2] = 30;
//		numbers[0][3] = 40;
//		// 2nd row
//		numbers[1][0] = 100;
//		numbers[1][1] = 200;
//		numbers[1][2] = 300;
//		numbers[1][3] = 400;
//		// 3rd row
//		numbers[2][0] = 1000;
//		numbers[2][1] = 2000;
//		numbers[2][2] = 3000;
//		numbers[2][3] = 4000;
		
		// #2 creating array
		int numbers[][] = {{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}};
		
		// extracting value
		System.out.println(numbers[2][1]);
		System.out.println(numbers[0][3]);
		
		// Row count
		System.out.println("Row count: "+numbers.length);
		// Column
		System.out.println("Column count: "+numbers[0].length);
		
		// traversing through 2-D array
		for(int i=0; i<numbers.length; i++) { // traverse through rows
			for(int j=0; j<numbers[i].length; j++) { // traverse through columns
				System.out.print(numbers[i][j]+"|");
			}
			System.out.println();
		}
		
	}

	// Assignment: Library application | Student profile lookup | Login functionality | Registration functionality
}

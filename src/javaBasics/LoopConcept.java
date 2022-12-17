package javaBasics;

public class LoopConcept {
	
	// Loop -> repeating action
	
	// Creating loops: -> 1. counter variable (start point)		2. condition (Stop point)	3. increment/decrement (pattern/sequence)
		// 1. for: ->  for(1; 2; 3){action}
		// 2. while: -> 1; while(2){action; 3;}

	public static void main(String[] args) {
		// 1 - 100
		// for
//		for(int i=1; i<=100; i=i+1) {
//			System.out.println(i);
//		}
		
//		int i = 1;
//		while(i<=100) {
//			System.out.print(i+"|");
//			i=i+1;
//		}
		
		// 0-1000
//		for(int i=0; i<=1000; i++) { // i++ -> i=i+1
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
//		
//		int i = 0;
//		while(i<=1000) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		// 1000-1
//		for(int i = 1000; i>=1; i=i-1) { // i=i-1 -> i--
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		int i = 1000;
//		while(i>=1) {
//			System.out.print(i+" ");
//			i--;
//		}
		
		// Odd values 1-100/100-1
//		for(int i=1; i<=100; i=i+2) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		int i = 99;
//		while(i>=1) {
//			System.out.print(i+" ");
//			i=i-2;
//		}
		
		
//		System.out.println();
		
		// Even values 1-100/100-1
//		for(int i=2; i<=100; i=i+2) {
//			System.out.print(i+" ");
//		}
//		int i = 100;
//		while(i>=1) {
//			System.out.print(i+" ");
//			i=i-2;
//		}
		
		//modulus operator - %
		for(int i=1; i<=100; i++) {
			// even number
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=100; i++) {
			// odd number
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
	
	// Assignment: 1-1000, 1000-1 -> for/while loop | Odd & Even numbers | Modulus operator

}

package javaBasics;

public class ConditionsConcept {
	
	// Conditions:
		// if: -> if(condition1){code-1}
		// else if: -> else if(condition2){code-2}
		// else: -> else{code-3}
	
	// Increase number of condition in "if" or "else if"
		// 1. And -> && -> condition1 && condition2
		// 2. Or -> || -> condition1 || condition2

	public static void main(String[] args) {
		int tempC, tempF;
		int expectedTempC, expectedTempF;
		
		expectedTempC = 37;
		expectedTempF = 98;
		
		tempC = 37;
		
		tempF = (tempC*9/5)+32;
//		System.out.println("Temperature in F: "+tempF);
//		System.out.println("Correct result: "+(tempF==expectedTempF));
		// if & else
		if(tempF==expectedTempF) {
			System.out.println("Temperature in F: "+tempF);
			System.out.println("Correct Calculation.");
		}else {
			System.out.println("Wrong calculation");
		}
	
		// if
		tempC = (tempF-32)*5/9;
		if(tempC==expectedTempC)
			System.out.println("Correct Calculation.");
		
		// if, else if & else
//		int actualRoomTemp, expectedRoomTemp;
//		actualRoomTemp = 68;
//		expectedRoomTemp = 70;
//		
//		if(actualRoomTemp==expectedRoomTemp) {
//			System.out.println("Maintain AC.");
//		}
//		else if(actualRoomTemp<expectedRoomTemp) {
//			System.out.println("Turn off AC.");
//		}
//		else {
//			System.out.println("Turn on AC.");
//		}
		
		// if, else if
		int actualRoomTemp, expectedRoomTemp, freezingRoomTemp;
		actualRoomTemp = 90;
		expectedRoomTemp = 70;
		freezingRoomTemp = 55;

		if (actualRoomTemp == expectedRoomTemp) {
			System.out.println("Maintain AC.");
		} else if (actualRoomTemp < expectedRoomTemp && actualRoomTemp>freezingRoomTemp) {
			System.out.println("Turn off AC.");
		} else if(actualRoomTemp<freezingRoomTemp || actualRoomTemp==freezingRoomTemp) {
			System.out.println("Turn on heater.");
		} else if(actualRoomTemp>expectedRoomTemp){
			System.out.println("Turn off the heater.");
			System.out.println("Turn on AC."); 
		}

	}
	// Assignment: Tax/Area of shape/Money exchange/Pay check -> actual & expected -> Comparison -> CONDITIONS!!

}

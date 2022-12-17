package javaBasics;

public class PrintingConcept { // class body

	public static void main(String[] args) { // code block/method body
		// println() VS print()
		System.out.println("Hello Java"); // println -> print in a line
		System.out.println("Learning Automation.");
		System.out.println("Learning coding language.");

		// shortcut -> System.out.println() -> sysout+ctrl+spaceBar
		System.out.println(); // println() -> can be kept blank
		System.out.println("Learning coding language.");
		
		System.out.print("Print anywhere"); // print anywhere | print() -> can't be empty
		System.out.println("Trying to print again.");
		System.out.println("Trying again!!");
		
		// Error message
		System.err.println("Incorrect username or password. Please try again!");
		
		System.out.println("Incorrect username or password.");
		System.out.println("Please try again!");
		
		// breaking statement -> \n
		System.err.println("Incorrect username or password. "+"\n"+"Please try again!");
		System.out.println("Hello Java. "+"\n"+"Learning Automation. "+"\n"+"Learning coding language. "+"\n"+"Learning coding language. "
				+ ""+"\n"+"Print anywhereTrying to print again."+"\n"+"Trying again!!");
		
		System.out.println("NAME      	Email Address            Phone              	Address");
		System.out.println("Myron    	myron@gmail.com    		1234242424  			123 Green St, NY");
		System.out.println("Jackson    	jack@gmail.com    		1234272724  			123 Bay St, CAL");
		
		System.out.println();
		
		// creating proper spacings -\t
		System.out.println("NAME"+"\t\t"+"Email Address"+"\t\t\t"+"Phone"+"\t\t\t"+"Address");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Myron"+"\t\t"+"myron@gmail.com"+"\t\t\t"+"1234242424"+"\t\t"+"123 Green St, NY");
		System.out.println("Jackson"+"\t\t"+"jack@gmail.com "+"\t\t\t"+"1234272724 "+"\t\t"+"123 Bay St, CAL");
		System.out.println("Jack"+"\t\t"+"jac@gmail.com "+"\t\t\t"+"1255272724 "+"\t\t"+"123 Gray St, NJ");
	}
}


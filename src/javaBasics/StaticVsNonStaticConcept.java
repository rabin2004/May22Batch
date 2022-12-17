package javaBasics;

public class StaticVsNonStaticConcept {
	// Static Vs Non static -> static keyword in properties (method/variable)
		// if static keyword is used -> called static/class property (closely related to class)
		// if not static keyword -> called non-static/instance property (closely related to instance/object of a class)
	
	// Static non static mismatch - static goes with static / non-static goes with static
		// 1. non-static -> more restrictive
		// 2. static -> less restrictive
	
	String firstName; // instance/non-static variable
	static String lastName; // static/class variable
	
	void printCustomerName() { // non-static/instance method
		System.out.println(firstName+lastName);
		System.out.println(firstName+StaticVsNonStaticConcept.lastName);
	}
	
	static void printCustomerDetails() { // static/class method
		StaticVsNonStaticConcept svn = new StaticVsNonStaticConcept();
		System.out.println(svn.firstName+lastName);
	}

	public static void main(String[] args) { // main method always static
		// accessing static property
				// 1. direct call
		lastName = "dorsey";
				// 2. By className
		StaticVsNonStaticConcept.lastName = "Ma";
			// 3. By instance/object reference name
		StaticVsNonStaticConcept svn1 = new StaticVsNonStaticConcept();
		svn1.lastName = "Ma"; // not a preferred way
		
		
		// accessing non-static property
			// 1. no direct call 
//		firstName = "jack";
			// 2. no By className
//		StaticVsNonStaticConcept.firstName();
			// 3. By instance/object reference name
		StaticVsNonStaticConcept svn = new StaticVsNonStaticConcept();
		svn.firstName = "Jack";
		

	}

}

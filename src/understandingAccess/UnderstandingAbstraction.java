package understandingAccess;

import oOPSconcept.AbstractionConcept;

public class UnderstandingAbstraction extends AbstractionConcept{
	
	// Create inheritance 	-> to implement abstract method
		// options to follow -
			// 1. implement the abstract method
			// 2. turn class into abstract

	public static void main(String[] args) {
		UnderstandingAbstraction ua = new UnderstandingAbstraction();
		ua.abstractMethod();

	}

	@Override
	public void abstractMethod() {
		System.out.println("Abstract method");
	}

}

package oOPSconcept;

public class ParentClass extends GrandParentClass{
	
	public void parentMethod1() {
		System.out.println("Parent method-1");
	}
	
	public static void parentMethod2() {
		System.out.println("Parent method-2");
	}
	
	void defaultMethod() {
		System.out.println("Default method");
	}
	
	protected void protectedMethod() {
		System.out.println("Protected method");
	}
	
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Parent common method");
	}

}

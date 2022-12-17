package oOPSconcept;

public class ChildClass extends ParentClass{
	
	void childMethod() {
		System.out.println("Child method");
	}
	
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Child common method");
	}

	public static void main(String[] args) {
		// accessing parent property
		parentMethod2();
		ChildClass.parentMethod2();
		ChildClass cc = new ChildClass(); // #1
		cc.parentMethod1();
		// accessing grand Parent property
		grandParentMethod2();
		ChildClass.grandParentMethod2();
		cc.grandParentMethod1();

		// Polymorphism
		cc.childMethod();
		ParentClass pc = new ChildClass(); // #2
//		pc.childMethod(); // can't accessed
		pc.parentMethod1();
		pc.grandParentMethod1();
		GrandParentClass gpc = new ChildClass(); // #3
//		gpc.childMethod(); // can't accessed
//		gpc.parentMethod1();
		gpc.grandParentMethod1();
		
		// Method Overriding Vs Method loading
		cc.commonMethod();
		pc.commonMethod();
		gpc.commonMethod();
	}

}

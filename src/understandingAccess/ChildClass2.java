package understandingAccess;

import oOPSconcept.ChildClass;
import oOPSconcept.ParentClass;

public class ChildClass2 extends ParentClass {

	public static void main(String[] args) {
		// accessing parent property
		parentMethod2();
		ChildClass.parentMethod2();
		ChildClass2 cc = new ChildClass2();
		cc.parentMethod1();
		// accessing grand Parent property
		grandParentMethod2();
		ChildClass.grandParentMethod2();
		cc.grandParentMethod1();
		
		// default Vs Protected
		cc.protectedMethod(); // can be accessed though different package due to inheritance
//		cc.defaultMethod(); // can't access default property though inheritance from different package
		
	}
}

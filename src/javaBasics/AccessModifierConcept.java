package javaBasics;

public class AccessModifierConcept {
	// Access Modifier -> properties (variables & methods)
	
		// Types of Access Modifier:
			// 1. public -> available from anywhere (from different class of same package or different package)
			// 2. private -> only available within class
			// 3. default -> available within class, from class of same package but not from different package | not available even from sub-class(child class) from different package
			// 4. protected -> available within class, from class of same package but not from different package | available from sub-class (child class) from different package
		
			// default VS protected -- ??
	
		// final -> to restrict access to change data assigned
		
		// Access Modifier for Class:
			// 1. public: able to create instance/object from same package or different package
			// 2. final: able to create instance/object from same package only
			// 3. abstract: ??? - will be covered in OOPS concept

	public final String concept = "Access Modifier";
	
	public String publicAccessModifier;
	public void publicMethod() {
		System.out.println(publicAccessModifier);
	}
	
	private String privateAccessModifier;
	private void privateMethod() {
		System.out.println(privateAccessModifier);
	}
	
	String defaultAccessModifier;
	void defaultMethod() {
		System.out.println(defaultAccessModifier);
	}
	
	protected String protectedAccessModifier;
	protected void protectedMethod() {
		System.out.println(protectedAccessModifier);
	}
	
	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
//		amc.concept = "change";
		System.out.println(amc.concept);
		// public access modifier
		amc.publicAccessModifier = "public method";
		amc.publicMethod();
		// private access modifier
		amc.privateAccessModifier = "private method";
		amc.privateMethod();
		// default access modifier
		amc.defaultAccessModifier = "default method";
		amc.defaultMethod();
		// protected access modifier
		amc.protectedAccessModifier = "protected method";
		amc.protectedMethod();

	}

}

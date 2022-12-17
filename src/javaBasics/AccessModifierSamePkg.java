package javaBasics;

public class AccessModifierSamePkg {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
//		amc.concept = "change";
		System.out.println(amc.concept);
		// public access modifier
		amc.publicAccessModifier = "public method";
		amc.publicMethod();
		// private access modifier
//		amc.privateAccessModifier = "private method";
//		amc.privateMethod();
		// default access modifier
		amc.defaultAccessModifier = "default method";
		amc.defaultMethod();
		// protected access modifier
		amc.protectedAccessModifier = "protected method";
		amc.protectedMethod();

	}

}

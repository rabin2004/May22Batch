package javaBasics;

public class LibraryClass {
	
	// variables
	int bookCount;
	int categories;
	static int libraryStaff;
	
	// through constructor instance variable value will be assigned
	public LibraryClass(int bookCount, int categories, int libraryStaff){
		this.bookCount = bookCount;
		this.categories = categories;
		LibraryClass.libraryStaff = libraryStaff;
	}
	
	// methods
	void dispenseBook() {
		System.out.println("Dispensing Books");
	}
	
	void acceptReturnBook() {
		System.out.println("Accepting Return Books");
	}
	
	void keepBookCategoryWise() {
		System.out.println("Maintaining books in category order.");
	}
	
	void monthlyReport() {
		System.out.println("Total books: "+bookCount);
		System.out.println("Total categories: "+categories);
		System.out.println("Total staffs: "+libraryStaff);
		System.out.println("Total expense on staff: "+totalStaffExpense());
	}
	
	static int totalStaffExpense() {
		return libraryStaff*1000;
	}
}

package oOPSconcept;

public class EncapsulationConcept {
	// Encapsulation -> data hiding
	
		// Achieving encapsulation:
				// 1. create variable as private
				// 2. each variable 2 public methods -> setter & getter method
	
	private String debitCardNumber;
	private String securityCode;
	private String expirationDate;
	
	
	public String getDebitCardNumber() { //16 digit -> 14-16
		debitCardNumber = debitCardNumber.substring(12);
		return debitCardNumber;
	}
	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	public String getSecurityCode() { 
		securityCode = "***";
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getExpirationDate() { // MM/YYYY
		expirationDate = expirationDate.substring(3);
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
}

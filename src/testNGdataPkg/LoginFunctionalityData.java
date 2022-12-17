package testNGdataPkg;

import org.testng.annotations.DataProvider;

public class LoginFunctionalityData {
	
	// Keyboard: 
		// name -> to provide separate name for a method

	@DataProvider (name="Both invalid credentials")
	public String[][] negativeLoginData() {
		String[][] data = {	{"test@gmail.com", "test12"},
//							{"test12@gmail.com", "test123"},
//							{"test123@gmail.com", "test1234"}
							
		};
		return data;
	}	
}

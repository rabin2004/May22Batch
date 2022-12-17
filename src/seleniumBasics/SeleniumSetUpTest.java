package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetUpTest {

	public static void main(String[] args) {
		// 1. set property for system -> which browser? | what is the path for driver?
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); // windows -> \\, fileName with extension | mac -> no need \\ | no extension		
		
		// 2. Create instance of ChromeDriver class and refer to WebDriver class - Polymorphism
		WebDriver driver = new ChromeDriver();
		
		// 3. Loading application -> get()
		driver.get("https://amazon.com");
		
		// Automation testing code
		
		// 4. Close application
		driver.close();
	}

}

package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownCheckBoxRadioButton {
	// Drop Down -> 1. Static drop down 		2. Dynamic drop down -> Mouse & Keyboard???
		// 1. Static drop down -> select tagName -> Select class -> pass webElement in Select class constructor
				// to identify option -> a. visible txt		b. index	c. value
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		// Handle drop down
//		WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
//		Select select = new Select(allDropDown);
//		Thread.sleep(3000);
//		select.selectByVisibleText("Amazon Fresh");
//		Thread.sleep(3000);
//		select.selectByIndex(14); // Books
//		Thread.sleep(3000);
//		select.selectByValue("search-alias=amazon-pharmacy");
//		Thread.sleep(3000);
//		
//		int allDropDownOptionTotal = 58;
//		for(int i=0; i<=allDropDownOptionTotal; i++) {
//			select.selectByIndex(i);
//			Thread.sleep(1000);
//		}
		
		// Handle check box
//		driver.findElement(By.id("nav-link-accountList")).click();
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("continue")).click();
//		WebElement rememberMeCheckBox = driver.findElement(By.name("rememberMe"));
//		Thread.sleep(3000);
//		rememberMeCheckBox.click();
//		if(rememberMeCheckBox.isSelected()) {
//			System.out.println("Selected: Correct interaction");
//		}else {
//			System.out.println("Couldn't interact");
//		}
//		Thread.sleep(3000);
//		rememberMeCheckBox.click();
//		if(!rememberMeCheckBox.isSelected()) {
//			System.out.println("Deselected: Correct interaction");
//		}else {
//			System.out.println("Couldn't interact");
//		}
		
		// Handle Radio button
		driver.findElement(By.id("icp-nav-flyout")).click();
		WebElement englishRadioBtn = driver.findElement(By.xpath
				("//*[@id=\"icp-language-settings\"]/div[2]/div/label/input"));
		WebElement spanishRadioBtn = driver.findElement(By.xpath
				("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i"));
		System.out.println("English Default select: "+englishRadioBtn.isSelected());
		System.out.println("Spanish Default select: "+spanishRadioBtn.isSelected());
		
		WebElement languageChangeHeader = driver.findElement(By.id("icp-language-heading"));
		System.out.println(languageChangeHeader.getText());
		Thread.sleep(3000);
		spanishRadioBtn.click();
		System.out.println(languageChangeHeader.getText());
		
		Thread.sleep(3000);
		driver.close();
	}
	
	// Assignment: Any application: Any feature -> any number test case -> automation all or whatever number can automation

}

package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {

	// Synchronization -> synch between application loading and automation execution
	
			// Types of synchronization:
				// 1. Static wait -> pause in execution, Thread.sleep(5000);
			
				// 2. Dynamic wait -> pause execution for defined amount of time until element is found, if found continue execution
						// a. Implicit wait: -> global wait, defined once applicable for all elements where action is going to be performed -> implicitlyWait()
						// b. Explicit wait: -> defined for a specific element -> WebDriverWait class
								
								// Fluent wait: -> polling/frequency of search can be adjusted -> FluentWait class
		// E.g
		//Implicit wait -> 15 seconds -> default frequency of search every 5 seconds
		//Explicit wait -> 30 seconds -> default frequency of search every 5 seconds
		// 0-5-10-15-20-25-30 -> 1 element 16th sec - 4 sec wastage
		// Fluent wait -> 30 seconds/polling:2sec ->
			// 0-2-4-6-8-10.... -> 1 element 16th sec - no wastage
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); // to define wait for page load
		// implicit wait:
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // Selenium 3 -> implicitlyWait(15, TimeUnit.SECONDS) | Selenium 4 -> implicitlyWait(Duration.ofSeconds(15))
		driver.get("https://www.amazon.com");
		
		WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(allDropDown);
//		Thread.sleep(5000); // static wait
		select.selectByVisibleText("Amazon Fresh");
		
		// explicit wait:
		// 1. WebDriverWait class instance
		WebDriverWait explicitWait = new WebDriverWait(driver,30);
		// 2. create webElement to apply wait on
		WebElement accountlist = driver.findElement(By.id("nav-link-accountList"));
		// 3. define condition to wait for
		explicitWait.until(ExpectedConditions.visibilityOf(accountlist)).click();
		
		// Fluent wait:
		FluentWait<WebDriver> fl = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement userNameTxtField = driver.findElement(By.name("email"));
		fl.until(ExpectedConditions.elementToBeClickable(userNameTxtField))
		.sendKeys("test@gmail.com");
		WebElement contiueBtn = driver.findElement(By.id("continue"));
//		fl.until(ExpectedConditions.invisibilityOfElementLocated(By.id("continue"))); // TimeoutException: Expected condition failed: waiting for element to no longer be visible: By.id: continue (tried for 30 second(s) with 2000 milliseconds interval)
		fl.until(ExpectedConditions.visibilityOf(contiueBtn)).click();
//		WebElement rememberMeCheckBox = driver.findElement(By.name("rememberMe"));

//		Thread.sleep(5000);
		driver.close();
	}
}

package testNGbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGintro {
	// @Test -> write automation script for a test case/scenario -> test method under the annotation
	// Handling pre-requisite & post-requisite script -> pre/post-requisite annotations
	// Validation point -> Assertion
	// TestNG report - html format
 	
	Properties prop;
	WebDriver driver;
	
	@BeforeMethod
	public void intialization() {
		try {
			prop = new Properties();	
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace"
					+ "\\May22Batch\\src\\seleniumBasics\\config.properties"));
			// 3. Load information read from file into Properties class instance
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.valueOf(prop.
				getProperty("pageLoadTimeDuration")), TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(Long.
				valueOf(prop.getProperty("implicitWaitDuration")), TimeUnit.SECONDS); 
		driver.get(prop.getProperty("qaEnvTestUrl"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void searchFunctionality() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("Screenshot/amazonHomePage.png"));

		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtbox.sendKeys(prop.getProperty("product"));
		
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("Screenshot/enteringSearchProduct.png"));
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		Assert.assertTrue(driver.getTitle().contains(prop.getProperty("product")));
		
		WebElement searchResultHeader = driver.findElement(By.
				xpath("//span[@class='a-color-state a-text-bold']"));
		Assert.assertTrue(searchResultHeader.getText().contains(prop.getProperty("product")));
		WebElement resultHeader = driver.findElement
				(By.xpath("//span[@class='a-color-state a-text-bold']/parent::div"));
		File src4 = resultHeader.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4, new File("Screenshot/searchResultHeader.png"));
	}
	
	@Test
	public void searchDrownDownTest() {
		WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(allDropDown);
		select.selectByVisibleText(prop.getProperty("category"));
		Assert.assertTrue(allDropDown.isSelected());
	}
	
	@Test
	public void defaultLanguageChangeFunctionalityTest() {
		driver.findElement(By.id("icp-nav-flyout")).click();
		WebElement englishRadioBtn = driver.findElement(By.xpath
				("//*[@id=\"icp-language-settings\"]/div[2]/div/label/input"));
		WebElement spanishRadioBtn = driver.findElement(By.xpath
				("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i"));
		Assert.assertTrue(englishRadioBtn.isSelected());
		Assert.assertFalse(spanishRadioBtn.isSelected());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

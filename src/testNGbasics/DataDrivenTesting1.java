package testNGbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting1 {

	Properties prop;
	WebDriver driver;
	String homepageTitle = "Amazon.com. Spend less. Smile more.";
	
	@BeforeClass
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
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@BeforeMethod
	public void validationHomePage() {
		Assert.assertTrue(driver.getTitle().contains(homepageTitle));
	}
	
	@AfterMethod
	public void backToHomePage() {
		if(driver.findElement(By.cssSelector("#nav-logo-sprites")).isDisplayed()) {
			driver.findElement(By.cssSelector("#nav-logo-sprites")).click();
		}else if(driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']"))
				.isDisplayed()) {
			driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']")).click();
		}else {
			System.err.println("Amazon icon not present in the page.");
		}
	}
	
	// Data Driven in TestNG:
		// 1. Annotation: @DataProvider -> data providing method -> store data in Array
		// 2. Keyword: dataProvider | dataProviderClass -> defined in test method
		// 3. Test method needs to be parameterized -> parameter will be used in code
	
	// if data is defined in same class
//	@Test (dataProvider="positiveSearchFunctionalityData")
//	public void searchFunctionality(String product) throws IOException {
//		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxtbox.sendKeys(product);
//	
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ENTER).build().perform();
//		
//		Assert.assertTrue(driver.getTitle().contains(product));
//		
//		WebElement searchResultHeader = driver.findElement(By.
//				xpath("//span[@class='a-color-state a-text-bold']"));
//		Assert.assertTrue(searchResultHeader.getText().contains(product));
//	}
	
	// if data is defined in different class of same package
//	@Test (dataProviderClass=SearchFunctionalityData.class, 
//			dataProvider="positiveSearchFunctionalityData")
//	public void searchFunctionality(String product) throws IOException {
//		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxtbox.sendKeys(product);
//	
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ENTER).build().perform();
//		
//		Assert.assertTrue(driver.getTitle().contains(product));
//		
//		WebElement searchResultHeader = driver.findElement(By.
//				xpath("//span[@class='a-color-state a-text-bold']"));
//		Assert.assertTrue(searchResultHeader.getText().contains(product));
//	}
	
	// if data is defined in different class of different package
	@Test(dataProviderClass = testNGdataPkg.SearchFunctionalityData.class, 
			dataProvider = "positiveSearchFunctionalityData")
	public void searchFunctionality(String product) throws IOException {
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtbox.sendKeys(product);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		Assert.assertTrue(driver.getTitle().contains(product));

		WebElement searchResultHeader = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
		Assert.assertTrue(searchResultHeader.getText().contains(product));
	}
	
	@DataProvider
	public String[] positiveSearchFunctionalityData() {
		String[] data = {"apple","samsung","lg","pixel"}; 
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

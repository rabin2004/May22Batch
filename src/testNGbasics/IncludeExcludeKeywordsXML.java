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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IncludeExcludeKeywordsXML {
	Properties prop;
	WebDriver driver;
	String homepageTitle = "Amazon.com. Spend less. Smile more.";
	
	// Annotations:
		// @Parameters
	
	@Parameters ("browser") // @Parameters ({"browser","anotherParameterName"})
	@BeforeClass(alwaysRun=true)
	public void intialization(String browser) {
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
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox") || 
				browser.equalsIgnoreCase("ff")) {
			System.setProperty(prop.getProperty("ffKey"), prop.getProperty("ffPath"));
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie") || 
				browser.equalsIgnoreCase("internet explorer")) {
			System.setProperty(prop.getProperty("ieKey"), prop.getProperty("iePath"));
			driver = new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("msEdge") || 
				browser.equalsIgnoreCase("microsoft edge")) {
			System.setProperty(prop.getProperty("msEdgeKey"), prop.getProperty("msEdgePath"));
			driver = new EdgeDriver();
		}else {
			System.err.println("Not a valid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.valueOf(prop.
				getProperty("pageLoadTimeDuration")), TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(Long.
				valueOf(prop.getProperty("implicitWaitDuration")), TimeUnit.SECONDS); 
		driver.get(prop.getProperty("qaEnvTestUrl"));
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	
	@BeforeMethod(alwaysRun=true)
	public void validationHomePage() {
		Assert.assertTrue(driver.getTitle().contains(homepageTitle));
	}
	
	@AfterMethod(alwaysRun=true)
	public void backToHomePage() {
		if(driver.findElement(By.xpath("//a[@href='/ref=ap_frn_logo']"))
				.isDisplayed()) {
			driver.findElement(By.xpath("//a[@href='/ref=ap_frn_logo']")).click();
		}else if(driver.findElement(By.cssSelector("#nav-logo-sprites")).isDisplayed()) {
			driver.findElement(By.cssSelector("#nav-logo-sprites")).click();
		}
		else {
			System.err.println("Amazon icon not present in the page.");
		}
	}
	
	@Test(dataProviderClass = testNGdataPkg.SearchFunctionalityData.class, 
			dataProvider = "positiveSearchFunctionalityData", groups="End-to-End")
	public void searchFunctionality(String product) throws IOException {
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtbox.sendKeys(product);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		Assert.assertTrue(driver.getTitle().contains(product));

		WebElement searchResultHeader = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
		Assert.assertTrue(searchResultHeader.getText().contains(product));
	}
	
	@Test(dataProviderClass=testNGdataPkg.LoginFunctionalityData.class, 
			dataProvider="Both invalid credentials", 
			dependsOnMethods="accountListLinkFunctionalityTest", groups="End-to-End")
	public void negativeLoginFunctionalityTest(String emailAdd, String password) {
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys(emailAdd);
//		driver.findElement(By.id("continue")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		
		if(driver.findElement(By.xpath("//form[@class='a-spacing-none']/h2"))
				.isDisplayed()) {
			Assert.assertTrue(driver.findElement(By.xpath("//form[@class='a-spacing-none']/h2"))
					.isDisplayed());
		}else if(driver.findElement(By.id("auth-error-message-box")).isDisplayed()) {
			Assert.assertTrue(driver.findElement(By.id("auth-error-message-box")).isDisplayed());	
			}
		else {
			System.out.println("Valid element not present");
		}
	}
	
	@Test (groups="Smoke")
	public void accountListLinkFunctionalityTest() {
		driver.findElement(By.id("nav-link-accountList")).click();
		String expectedSignInPageTitle = "Amazon Sign-In";
		String actualSignInPageTitle = driver.getTitle();
		Assert.assertEquals(actualSignInPageTitle, expectedSignInPageTitle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrossBrowserTesting {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		Properties prop = new Properties();	
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace"
				+ "\\May22Batch\\src\\seleniumBasics\\config.properties"));
		prop.load(fis);
		
		// Cross browser: 
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox") || 
				prop.getProperty("browser").equalsIgnoreCase("ff")) {
			System.setProperty(prop.getProperty("ffKey"), prop.getProperty("ffPath"));
			driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("ie") || 
				prop.getProperty("browser").equalsIgnoreCase("internet explorer")) {
			System.setProperty(prop.getProperty("ieKey"), prop.getProperty("iePath"));
			driver = new InternetExplorerDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("msEdge") || 
				prop.getProperty("browser").equalsIgnoreCase("microsoft edge")) {
			System.setProperty(prop.getProperty("msEdgeKey"), prop.getProperty("msEdgePath"));
			driver = new EdgeDriver();
		}else {
			System.err.println("Not a valid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.
				valueOf(prop.getProperty("pageLoadTimeDuration")), TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(Long.
				valueOf(prop.getProperty("implicitWaitDuration")), TimeUnit.SECONDS); 
		driver.get(prop.getProperty("qaEnvTestUrl"));
		
		WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(allDropDown);
		select.selectByVisibleText(prop.getProperty("category"));
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 
				Long.valueOf(prop.getProperty("explicitWaitDuration")));
		WebElement accountlist = driver.findElement(By.id("nav-link-accountList"));
		explicitWait.until(ExpectedConditions.visibilityOf(accountlist)).click();
		
		FluentWait<WebDriver> fl = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(Long.valueOf(prop.getProperty("fluentWaitDuration"))))
				.pollingEvery(Duration.ofSeconds(Long.valueOf(prop.getProperty("pollingDuration"))))
				.ignoring(NoSuchElementException.class);
		
		WebElement userNameTxtField = driver.findElement(By.name("email"));
		fl.until(ExpectedConditions.elementToBeClickable(userNameTxtField))
		.sendKeys(prop.getProperty("userName"));
		WebElement contiueBtn = driver.findElement(By.id("continue"));
		fl.until(ExpectedConditions.visibilityOf(contiueBtn)).click();

		driver.close();
	}
}

package seleniumBasics;

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

public class TakingScreenshotConcept {
	// Taking screenshot 	-> 1. of the page		2. of the element
						//	-> common io jar files
						// 	-> TakesScreenshot class
						// 	-> getScreenshotAs() -> return file -> need to handle file
						//	-> need to convert file into picture file -> store in defined location
	
	static Properties prop;

	public static void main(String[] args) throws IOException {
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
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.valueOf(prop.
				getProperty("pageLoadTimeDuration")), TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(Long.
				valueOf(prop.getProperty("implicitWaitDuration")), TimeUnit.SECONDS); 
		driver.get(prop.getProperty("qaEnvTestUrl"));
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("Screenshot/amazonHomePage.png"));

		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtbox.sendKeys(prop.getProperty("product"));
		
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("Screenshot/enteringSearchProduct.png"));
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		// Verification point
		if(driver.getTitle().contains(prop.getProperty("product"))) {
			System.out.println("Search functionality Test: Passed");
			File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src3, new File("Screenshot/searchResultPage.png"));
		}else {
			System.out.println("Search functionality Test: Failed");
		}
		
		WebElement searchResultHeader = driver.findElement(By.
				xpath("//span[@class='a-color-state a-text-bold']"));
		if(searchResultHeader.getText().contains(prop.getProperty("product"))) {
			System.out.println("Search functionality Test: Passed");
			WebElement resultHeader = driver.findElement
					(By.xpath("//span[@class='a-color-state a-text-bold']/parent::div"));
			File src4 = resultHeader.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src4, new File("Screenshot/searchResultHeader.png"));
		}else {
			System.out.println("Search functionality Test: Failed");
		}
		
		driver.quit();
	}

}

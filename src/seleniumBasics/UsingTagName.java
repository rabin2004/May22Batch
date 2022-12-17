package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		// input -> txtBox/CheckBox/RadioBtn/Button/Tab 
		// a -> links/hyperlink
		// img -> images
		// table -> webTables -> tr-rows | td-columns
		// div
		// select -> static drop down
		// iframe -> frame
		
		// findElements() -> return list of webElements with the tagName
//		List<WebElement> inputElements = driver.findElements(By.tagName("input"));
//		System.out.println("Number of input webElement: "+inputElements.size());
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+linkElements.size());
		
		for(WebElement link: linkElements) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		
//		List<WebElement> imageElements = driver.findElements(By.tagName("img"));
//		System.out.println("Number of images: "+imageElements.size());
//		
//		List<WebElement> selectElements = driver.findElements(By.tagName("select"));
//		System.out.println("Number of static dropdown: "+selectElements.size());
//		
//		List<WebElement> tableElements = driver.findElements(By.tagName("table"));
//		System.out.println("Number of tables: "+tableElements.size());
//		
//		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
//		System.out.println("Number of iframes: "+iframeElements.size());

		driver.close();
	}

}

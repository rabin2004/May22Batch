package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperationAndHandlingIframe {
	// Constraint of Selenium -> both drag and drop element should be part of the same page
	
	// Handling iframe -> by 1. webElement 2. index 3. text -> switchTo().frame(1/2/3)

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		// Handling iframe
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		WebElement dragAndDropFrame = frames.get(0);
//		String frameTxt = dragAndDropFrame.getText();
//		driver.switchTo().frame(0);
		driver.switchTo().frame(dragAndDropFrame);
//		driver.switchTo().frame(frameTxt);
		
		// drag & drop
		Actions action = new Actions(driver);
		WebElement dragObject = driver.findElement(By.id("draggable"));
		WebElement dropLocation = driver.findElement(By.id("droppable"));
		
		// #1
//		action.moveToElement(dragObject).clickAndHold().moveToElement(dropLocation).release()
//		.build().perform();
		
		// #2
//		action.clickAndHold(dragObject).release(dropLocation).build().perform();
		
		// #3
		action.dragAndDrop(dragObject, dropLocation).build().perform();

		Thread.sleep(3000);
		driver.close();
	}

}

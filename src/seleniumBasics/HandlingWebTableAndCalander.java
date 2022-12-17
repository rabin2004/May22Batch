package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableAndCalander {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
//		String offer1DestinationTxt = driver.findElement(By.
//				xpath("//table[@width='270']/tbody/tr[1]/td[1]/font")).getText();
//		System.out.println("Offer1 destination: "+offer1DestinationTxt);
		
//		String offer1PriceTxt = driver.findElement(By.
//				xpath("//table[@width='270']/tbody/tr[1]/td[2]/div/font/b")).getText();
//		System.out.println("Offer1 price: "+offer1PriceTxt);
		
//		WebElement offerTable = driver.findElement(By.xpath("//table[@width='270']/tbody"));
		
//		String offer1DestinationTxt = offerTable.findElement(By.
//				xpath("//tr[1]/td[1]/font")).getText();
//		System.out.println("Offer1 destination: "+offer1DestinationTxt);
//		String offer1PriceTxt = offerTable.findElement(By.
//				xpath("//tr[1]/td[2]/div/font/b")).getText();
//		System.out.println("Offer1 price: "+offer1PriceTxt);
		
//		for(int i=1; i<=5; i++) {
//			String Istring = String.valueOf(i);
//			String offerDestinationTxt = offerTable.findElement(By.
//					xpath("//tr["+Istring+"]/td[1]/font")).getText();
//			String offerPriceTxt = offerTable.findElement(By.
//					xpath("//tr["+Istring+"]/td[2]/div/font/b")).getText();
//			System.out.println("Offer "+Istring+" :"+offerDestinationTxt+"|"+offerPriceTxt);
//		}
		
		driver.get("https://www.timeanddate.com/calendar/?country=1");
		//table[@id='mct1']/tbody/tr[10]/td[5]/table/tbody/tr[4]/td[7]
//		1st tr -> 3 month in a row ->2, 6, 10, 14 -> difference of 4
//		1st td -> month in row of 3 -> 1, 3, 5 -> odd numbers
//		2nd tr -> 2 to 7 - weeks of the month
//		2nd td -> 1 to 7 - days of the week
		
		String dateSelected = "01/20/2022";
		
		String month = dateSelected.substring(0, 2);
		String day = dateSelected.substring(3, 5);
		
		if(month.equals("01") || month.equals("02") || month.equals("03")) {
			if(month.equals("01")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[2]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("02")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[2]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("03")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[2]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}
		
		if(month.equals("04") || month.equals("05") || month.equals("06")) {
			if(month.equals("05")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[6]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("05")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[6]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("06")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[6]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}
		
		if(month.equals("07") || month.equals("08") || month.equals("09")) {
			if(month.equals("07")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[10]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("08")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[10]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("09")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[10]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}
		
		if(month.equals("10") || month.equals("11") || month.equals("12")) {
			if(month.equals("10")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[14]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("11")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[14]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("12")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[14]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}

		driver.close();
	}

}

package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackWebPage {
	public static void main(String[]args) {
		
		//Open the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//WebDriver  driver = new ChromeDriver();
		
		//Maximize the webpage
		driver.manage().window().maximize();
		
		//enter a demo website
		driver.get("https://www.brandbucket.com/names/shopperstack");
		
		//driver.navigate().to("https://www.brandbucket.com/names/shopperstack");
		
		//close the website
		
		driver.close();
		
		driver.quit();
	}

}

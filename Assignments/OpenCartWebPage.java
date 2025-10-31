package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartWebPage {
public static void main(String[]args) {
		
		//Open the Browser
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		 
		 //Maximize The Browser
		 driver.manage().window().maximize();
		  
		 //Enter into Demo WebShop
		// driver.get("https://www.opencart.com/index.php?route=cms/demo");
		 
		driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		 
		 //close the browser
		 
		 //driver.close();
		 driver.quit();

	}

	
}

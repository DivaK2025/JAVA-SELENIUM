package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLoginLinkUsingDirectLocators {

	public static void main(String[]args)throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
}

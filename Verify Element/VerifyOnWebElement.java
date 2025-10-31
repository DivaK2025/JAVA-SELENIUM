package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyOnWebElement {
	
	public static void main(String[]args)throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		if(excellent.isEnabled()) {
			System.out.println("Excellent radio button is enabled");
			excellent.click();
			System.out.println("pass");
		}
		else {
			
			driver.close();
			System.out.println("Excellent radio button is not enabledand testscript fail");
		}
		driver.close();
	}
}

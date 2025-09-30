package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchfeild =  driver.findElement(By.tagName("input"));
		searchfeild.sendKeys("PlayStation 5");
		Thread.sleep(4000);
		driver.close();
		
	}

}

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
//      driver.findElement(By.id("small-searchterms")).sendKeys("Lights");
//      Thread.sleep(3000);
//      driver.findElement(By.cssSelector("input[type='submit']")).click();
        
        //id = #
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Lights");
        Thread.sleep(3000);
        
        //class = .
        driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
        Thread.sleep(3000);
		driver.close();
		
		/*Drawbacks of CSS Selectors
		 * 1)Text Function we cannot perform with CSS Selectors
		 * 2)Specifying the element is not possible 
		 * 3)We can perform only forward Traversing*/
	}
}

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyOnWebElement2 {

	public static void main(String[]args)throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		searchBox.sendKeys("Computers");
		
		WebElement search = driver.findElement(By.className("search-box-button"));
	
		//isEnabled
      
		if(search.isEnabled()) {
			System.out.println("search button is enabled and test case is pass");
			search.click();
			System.out.println("Pass");
		}
		else {
			driver.close();
			System.out.println("search button is disabled and test case fail");
		}
		driver.close();
	
	}
}

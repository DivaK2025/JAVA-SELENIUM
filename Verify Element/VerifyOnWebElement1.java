package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyOnWebElement1 {
	
	public static void main (String []args)throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement books = driver.findElement(By.partialLinkText("Books"));
		
		if(books.isEnabled()) {
			System.out.println("books button is enabled");
			books.click();
			System.out.println("pass");
			}
		else {
		    driver.close();
			System.out.println("booksbutton is disabled and testcase is failed");
			
		}
		driver.close();
	}

}

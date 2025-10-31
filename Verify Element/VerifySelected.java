package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySelected { 
	
	public static void main(String[]args)throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		//excellent.click();
		
		if(excellent.isSelected()) {
			System.out.println("excellent button is selected and Testcase pass");
		}
		else {
			driver.close();
			throw new Exception("excellent button is not selected and Testcase fail");
		}
		driver.close();	
	}

}

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextFeild {
	public static void main(String[] args) throws InterruptedException {
		
		String data = "Slenium";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement searchfeild = driver.findElement(By.id("small-searchterms"));
		searchfeild.sendKeys(data);
		
		String currentData = searchfeild.getAttribute("value");
		if(data.equals(currentData)) {
			System.out.println("both are euals and testcase is pass");
		}
		else {
			driver.close();
			System.out.println("both are not equal and testcase is fail");
		}
		driver.close();
		
	}

}

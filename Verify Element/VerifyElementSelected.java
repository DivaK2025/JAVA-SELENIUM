package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementSelected {
	
	
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement excellent =driver.findElement(By.id("pollanswers-1"));
		// here we verify the web element is selected or not
		excellent.click();
		if(excellent.isSelected()) {
			System.out.println("Excellent radio button is selected");
			System.out.println("Pass");
		}else {
			driver.close();
			throw new Exception("Excellent radio button is not selected and testScript fail");
		}
		Thread.sleep(2000);
		driver.close();
	}
}

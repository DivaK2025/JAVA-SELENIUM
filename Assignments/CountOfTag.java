package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfTag {
	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		List<WebElement> tag  = driver.findElements(By.xpath("//div"));
		System.out.println("Tag Count is :"+(tag.size()+1));
		
		driver.close();
	}
	

}

package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsSecondWay {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		//STALEELEMENETREFERENCEEXCEPTION
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		
		for(int i =0;i<links.size();i++ ) {
			links.get(i).click();
			links=driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
			Thread.sleep(1000);
			
			//driver.navigate().back(); // IF YOU PERFORM THIS OPERATION THEN WILL NOT GET THE EXCEPTION SO PLEASE YOU SHOULD NOT PERFORM THIS OPERATION  HERE 
		}
		Thread.sleep(1000);
		driver.close();
   }
}

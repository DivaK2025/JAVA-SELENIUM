package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceFooterByUsingFindElements {

public static void main(String[] args) throws Exception {
	
	    String rss_url ="https://demowebshop.tricentis.com/news/rss/1";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		String current_tab = driver.getWindowHandle();
//		
//		
//		List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='footer']//div[@class='column follow-us']/ul/li/a"));
//		
//		for(WebElement web :follow_us ) {
//			
//			try {
//				web.click();
//				Thread.sleep(6000);
//				
//			}
//			catch(Exception e) {
//				driver.navigate().back();
//				Thread.sleep(1000);			}
//		driver.switchTo().window(current_tab);
//		}
//		driver.quit();
		
		
		                                  //Another way
		
		List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='footer']//div[@class='column follow-us']/ul/li/a"));
		for(WebElement web : follow_us) {
			String actual_url= driver.getCurrentUrl();
			if(actual_url.equals(rss_url)) {
				driver.navigate().back();
			}
			web.click();
			Thread.sleep(1000);
		}
		driver.quit();
		
		
}
}

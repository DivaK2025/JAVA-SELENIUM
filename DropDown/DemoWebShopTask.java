package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShopTask {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(1000);
		
		WebElement sortBy = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(sortBy);
		Thread.sleep(1000);
		int i =0;
		
		List<WebElement> position = sel.getOptions();
		for(WebElement web :position) {
			sortBy = driver.findElement(By.id("products-orderby"));
			sel = new Select(sortBy);
			sel.selectByIndex(i++);
			Thread.sleep(1000);
			
		
			
			
		}
	}

}

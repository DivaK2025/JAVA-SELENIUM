package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContineousSelect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("file:///C:/Users/divya/Downloads/demo.html");
	Thread.sleep(2000);
	
	WebElement singleSelect = driver.findElement(By.id("standard_cars"));
	Select sel = new Select(singleSelect);
	
	List<WebElement> cars = sel.getOptions();
	for(WebElement web :cars) {
		web.click();
		Thread.sleep(1000);
	}
	
	Thread.sleep(1000);
	driver.close();
}
}

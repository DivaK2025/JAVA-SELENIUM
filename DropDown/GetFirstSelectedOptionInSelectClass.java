package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionInSelectClass{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("file:///C:/Users/divya/Downloads/demo.html");
		
		WebElement multipleSelect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multipleSelect);
		Thread.sleep(1000);
		
		List<WebElement> cars = sel.getOptions();
		sel.selectByValue("jgr");
		Thread.sleep(1000);
		sel.selectByVisibleText("Mini");
		Thread.sleep(1000);
		sel.selectByIndex(3);
		
		WebElement first = sel.getFirstSelectedOption();
		System.out.println("first data:"+first.getText());
		
		driver.close();
	

	}

}

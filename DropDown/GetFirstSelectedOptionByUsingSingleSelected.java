package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionByUsingSingleSelected {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("file:///C:/Users/divya/Downloads/demo.html");
		
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
        //if we use the standard_cars here will select the data in order way then it will give the first option  but you entered data in unordered way that time it will return the last data  whichever give you in script.
		
		//WebElement singleSelect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(singleSelect);
		Thread.sleep(1000);
		
		List<WebElement> cars = sel.getOptions();
		sel.selectByValue("jgr");
		Thread.sleep(1000);
		sel.selectByIndex(3);
		Thread.sleep(1000);
		sel.selectByVisibleText("Mini");
		
		WebElement first = sel.getFirstSelectedOption();
		System.out.println("first data:"+first.getText());
        Thread.sleep(1000);		
		driver.close();
		
	}

}

package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContineousSelectInMultipleSelectDropDown {
	
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/divya/Downloads/demo.html");
		
		WebElement multipleSelect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multipleSelect);
		List<WebElement>cars = sel.getOptions();
		
		int i=0;
		for(WebElement web :cars) {
			sel.selectByIndex(i++);
			Thread.sleep(1000);
				}
		if(sel.isMultiple()) {
			sel.deselectAll();
			System.out.println("pass");
		}
		else {
			driver.close();
			throw new Exception("fail");
		}
		driver.close();
	}

}

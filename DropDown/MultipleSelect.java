package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/divya/Downloads/demo.html");
		Thread.sleep(2000);
		
		WebElement multipleSelect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multipleSelect);
		
		//SELECT OPERATIONS
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		
		sel.selectByValue("for");
		Thread.sleep(2000);
		
		//DESELECT OPERATION
		
//		sel.deselectByIndex(1);
//		Thread.sleep(2000);
//		
//		sel.deselectByVisibleText("BMW");
//		Thread.sleep(2000);
//		
//		sel.deselectByValue("for");
//		Thread.sleep(2000);
		
		sel.deselectAll();

		
		driver.close();
	}

}

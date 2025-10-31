package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssignment {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.name("firstname")).sendKeys("Divyarani");
	 driver.findElement(By.name("lastname")).sendKeys("Khade");
	 
	 WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		
//		d.selectByIndex(29);
//		Thread.sleep(1000);
		
//		d.selectByValue("30");
//		Thread.sleep(1000);
		
		d.selectByVisibleText("30");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
//		
//		m.selectByIndex(0);
//     	Thread.sleep(2000);
//		
//		m.selectByValue("1");
//      Thread.sleep(1000);
		
		m.selectByVisibleText("Jan");
		Thread.sleep(1000);
		
		WebElement year= driver.findElement(By.id("year"));
		Select y = new Select(year);
		
//		y.selectByIndex(22);
//    	Thread.sleep(1000);
//	
//		y.selectByValue("2003");
//      Thread.sleep(1000);
//		
		y.selectByVisibleText("2003");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(1000);
		
	    driver.findElement(By.name("reg_email__")).sendKeys("divyarani@gmail.com");
	    
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Divyarani@123");
	    
	    driver.findElement(By.name("websubmit")).click();
	    Thread.sleep(1000);
	    
	    driver.close();
		

		
	
		
}
}

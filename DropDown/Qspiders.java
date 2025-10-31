package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qspiders {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/section[1]/a[1]/div/main/p[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("name")).sendKeys("DivyaraniVasantKhade");
		Thread.sleep(1000);
		
		driver.findElement(By.name("email")).sendKeys("divyaranikhade@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Divyarani@2003");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("divyaranikhade@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Divyarani@2003");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/button")).click();
		Thread.sleep(1000);
		
		//SELECT CLASS 
		
		driver.findElement(By.xpath("//section[contains(.,'Elements')]")).click();
        Thread.sleep(2000);
        
     
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/li[2]"));
        dropdown.click();
        Select path =  new Select(dropdown);
        
        path.selectByVisibleText("Login 1.0"); 
        Thread.sleep(1000); 
        
        path.selectByVisibleText("Login 2.0"); 
        Thread.sleep(1000);
        
        path.selectByVisibleText("Login 3.0"); 
        Thread.sleep(1000);
       

       
	}
      
}

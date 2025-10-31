package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartVerification2 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");
		driver.findElement(By.xpath("//a[@href = '/login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("nmankar017@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("Ninad@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(1000);
		
	}

}




package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssignmentForFacebook {
	public static void main(String []args)throws InterruptedException
	{
	   ChromeDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.facebook.com/");
	   
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divyarani");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Khade");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("30");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Jan");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//select[@name ='birthday_year']")).sendKeys("2003");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("divyaranikhade@gmail.com");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Divyarani@2003");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	   Thread.sleep(1000);

	   driver.close();
	}

}

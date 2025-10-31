package Basics;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmAssignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("Admin");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin123");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");

		Thread.sleep(4000);

		if(driver.findElement(By.xpath("//span[text()='Admin']")).isDisplayed()) {

			System.out.println("Admin is present testscript is pass");

		}else

		{

			System.out.println("Admin is not present testscript is failed");

		}
		

		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();

		Thread.sleep(4000);

		driver.close();

	}



}


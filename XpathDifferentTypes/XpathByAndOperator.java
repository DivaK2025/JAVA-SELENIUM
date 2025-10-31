package XpathDiffrenttypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAndOperator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']"));
		men.click();
		Thread.sleep(1000);
		driver.close();
	}


}

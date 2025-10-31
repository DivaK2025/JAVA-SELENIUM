package XpathDiffrenttypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTagName {
	
	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement poll=driver.findElement(By.xpath("(//strong)[5]"));
		System.out.println(poll.getText());
		
		Thread.sleep(2000);
		driver.close();
	}

}

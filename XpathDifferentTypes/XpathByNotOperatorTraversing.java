package XpathDiffrenttypes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathByNotOperatorTraversing {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		
		ChromeDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		List<WebElement> ec = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a[not (text()='RSS')]"));
		
		for(WebElement web : ec)
		{
			System.out.println(web.getText());
			Thread.sleep(2000);
		}
		
		driver.close();
		
}
}

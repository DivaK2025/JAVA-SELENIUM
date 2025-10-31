package XpathDiffrenttypes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathByOROperator {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		List<WebElement>ecommerce = driver.findElements(By.xpath("//a[@target='_blank' or text()='RSS']"));
		for(WebElement web : ecommerce)
   {
	System.out.println("web.getText()");
	Thread.sleep(1000);
   }
		driver.close();
		
	}

}

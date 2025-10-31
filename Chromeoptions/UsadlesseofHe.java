package ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsadlesseofHe {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
	    System.out.println("Open the Chrome Browser");
	    driver.manage().window().maximize();
	    
	    driver.get("https://yesmovies-to.to/");
	    Thread.sleep(2000);
	    
	   WebElement homepage= driver.findElement(By.xpath("//a[@rel='nofollow']"));
	   System.out.println(homepage.getText());
	   Thread.sleep(2000);	   
	   driver.close();
	   System.out.println("Browser has been closed");
	}

}

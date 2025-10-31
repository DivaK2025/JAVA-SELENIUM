package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveHighestPriceProductInCart {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();
		Thread.sleep(1000);
		 
		List<WebElement> addtocart=driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
		for(WebElement web : addtocart)
		{
			web.click();
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//span[@class='cart-label'][1]")).click();
		Thread.sleep(2000);
		
		List<WebElement>price=driver.findElements(By.xpath("//span[@class='product-unit-price']"));
		List<Double> prices = new ArrayList<>();
		
		
		for(WebElement web : price)
		{
			String getPrices = web.getText();
			prices.add(Double.parseDouble(getPrices));
		}
		
		double highestPrice=Collections.max(prices);
		int index=prices.indexOf(highestPrice);
		
		System.out.println("All Prices of Products : "+ prices);
		System.out.println("Products with highest Price : "+highestPrice);
		
		
		List<WebElement>remove=driver.findElements(By.xpath("//input[@name='removefromcart']"));
		remove.get(index).click();
		
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
		
		 driver.close();
		 

	}

}
package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl {
	public static void main(String[] args) {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_url = driver.getCurrentUrl();
		if(expected_url.equals(actual_url)) {
			System.out.println("Successfullyentered on expected url");
		}
		else {
			System.out.println("Defect is found");
		}
		
		driver.close();
	}

}

package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//VERIFY THE TITLE OF PAGE
		
			String expected_title = "Demo Web Shop";
			String actual_title = driver.getTitle();
			if(expected_title.equals(actual_title)) {
				System.out.println("title is correct");
			}else {
				System.out.println("title is not correct");
				System.out.println("Defeect is not found");
			}
			Thread.sleep(1000);
			driver.close();
	}

}

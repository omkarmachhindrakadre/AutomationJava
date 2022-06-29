package Navigationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigatePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	   
		//open URL
		driver.get("https://www.amazon.in/");
		System.out.println("Opening the amazon page through driver.get()");
		
		//Max
		driver.manage().window().maximize();
		
		//Navigate to the ebay page
		
	    driver.navigate().to("https://www.ebay.com/");
		System.out.println("Opening the ebay page through driver.navigate.to()");
		
		//Enter same values
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T-shirts Mens");
		
		//refresh the browser
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Refresh the browser");
	
	    //back to amazon
		Thread.sleep(200);
		driver.navigate().back();
		System.out.println("the page is navigatedback to amazon");
		
		//navigate Forward to ebay
		Thread.sleep(200);
		driver.navigate().forward();
		System.out.println("the page is navigate forward");
		
		//close browser
		driver.close();
		
		
	}

}

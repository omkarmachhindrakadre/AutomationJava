package Navigationcommands;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatepart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//Max windows
		driver.manage().window().maximize();
		//Open the URL
		driver.navigate().to("https://wordpress.com/");

	   //click on start
		driver.findElement(By.xpath("//a[@title='Get Started']")).click();
		
		//back
		Thread.sleep(200);
		driver.navigate().back();
			
				
		//refresh
		Thread.sleep(200);
		driver.navigate().refresh();
		
		//forward
		Thread.sleep(200);
		 driver.navigate().forward();
      
		//close
		driver.close();
	}

}

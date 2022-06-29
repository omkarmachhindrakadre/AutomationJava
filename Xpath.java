package New2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
        //OpenBrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	    //Maximize Windows
		driver.manage().window().maximize();
	    
	    //navigate to  the URL
	    driver.get("https://www.ebay.com/");
	    
	    //Absolute Xpath
	    //driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T_Shirts");
	   // driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
	
	    //relativeXpath
	  //  driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T_Shirts");
	    //driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	
	    //Or Operator
	   // driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_nkw']")).sendKeys("T_Shirts");
	
	    //AND Operator
	    //driver.findElement(By.xpath("//input[@id='gh-ac' and  @name='_nkw']")).sendKeys("T_Shirts");
	    
	    
	    //contains method
	   // driver.findElement(By.xpath("//input[contains(@name,'_n')]")).sendKeys("T-Shirts kids");
		 
	    
	    //Start-with
	   // driver.findElement(By.xpath("//input[starts-with(@name,'_n')]")).sendKeys("Mobile");
	
	
	    //text()
        driver.findElement(By.xpath("//a[text()=Sell']")).click();
	}

}

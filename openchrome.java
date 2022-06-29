package New2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//1.OPEN THE CHROME DRIVER
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		//2.NAVIGATE TO THE URL
		driver.get("https://automationpractice.com/index.php");
		
        //3. ByID
		//driver.findElement(By.id("search_query_top")).sendKeys("T-Shrits");
		   //OR
	    //WebElement search = driver.findElement(By.id("search_query_top"));
	    //search.sendKeys("T_Shirst");
	  
	    //4.BY NAME
	    driver.findElement(By.name("search_query")).sendKeys("dress"); 
	   

	   
	}

}

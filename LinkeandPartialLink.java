package New2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkeandPartialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       
        driver.manage().window().maximize();
        
        driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
	   
        //BY LINKTEXT
        //driver.findElement(By.linkText("Printed Dress")).click();
        
        //BY PARTIALLINKTEXT
	    //driver.findElement(By.partialLinkText("		Printed Summer ")).click();
	    
	    //TagName
	    driver.findElement(By.tagName("a")).click();
	    
	}

}

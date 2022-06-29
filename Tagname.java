package New2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   
   driver.get("https://www.google.com/");

   //ByTagname
   List<WebElement> link = driver.findElements(By.tagName("a"));
	System.out.println(link.size());
	
	
	//name5 of link
	for(WebElement l:link) 
	{
		System.out.println(l.getText());
	}

}
}
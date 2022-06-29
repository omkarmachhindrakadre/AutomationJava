package XpathAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("http://money.rediff.com/gainerss");
	   
	   //Xpath axes
	   //self node
	    String selfnode=driver.findElement(By.xpath("//a[contains(text(),'G S Auto Interna')]/self:: a")).getText();
	   System.out.println("The self node is present"+selfnode);
	
	   //parent node
	    String str=driver.findElement(By.xpath("//a[contains(text(),'G S Auto Interna')]/parent::td")).getText();
        System.out.println("the parent node is present" +str);
        
        //CHild nodes
        List<WebElement> childenode= driver.findElements(By.xpath("//a[normalize-space()='G S Auto Interna']/ancestor::tr/child::*"));
	     System.out.println("the no of child nodes are"+childenode.size());
	     
	     //Ancestor node
	     String ancenstornode=driver.findElement(By.xpath("//a[normalize-space()='G S Auto Interna']/ancestor::tr")).getText();
	     System.out.println("The ancestor node is"+ancenstornode);
	  
	     //Following
	     List<WebElement> following= driver.findElements(By.xpath("//a[contains(.,'Raj Television Netwo')]/following::*"));
	     System.out.println("The no of following elements from the current HTML tag is"+following.size() );
	     
	     
	     //Following _Sibling
	     List<WebElement> ancenstornode2=driver.findElements(By.xpath("//a[normalize-space()='G S Auto Interna']/ancestor::tr"));
	     System.out.println("The no of following elements from the current HTML tag is"+ancenstornode2.size());
	     
	     //Preceding
	     List<WebElement> Preceding=driver.findElements(By.xpath("//a[contains(.,'G S Auto Interna')]/ancestor::tr/preceding::*"));
	     System.out.println("The presebling elements from the current HTML Tag is"+Preceding.size());
	   
	     //-sibling::
	     List<WebElement> Precedingsibling=driver.findElements(By.xpath("//a[contains(.,'G S Auto Interna')]/ancestor::tr/preceding-sibling::*"));
	     System.out.println("The presebling elements from the current HTML Tag is"+Precedingsibling.size());
	   
	       driver.close();
	}

}

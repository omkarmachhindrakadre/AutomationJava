package NodeSelfandParent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup");
	    
		//ChildElements  Example - the sing-up button from the registration form present in the Facebook application.
		driver.findElements(By.xpath("//div[@id='reg_form_box']/child::div[11]/button"));
		
		//Parent node Example -  locate Firstname form SingUp button in faceboo
		driver.findElement(By.xpath("//div[@id='reg_form_box']/parent::*/parent::*/child::*/div/div/div/div/div/div/div"));
		
		//Following Example - Identify the Password from mobile filed in facebook.
		driver.findElement(By.xpath("//input[@id='u_m_g_tz']/following::input"));
		
		//preceding Example- Locate Mobile number frm new PAssword field in facebook
		driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[2]"));
		
		//Ancestor Example- Locate surname femaale radio button in faceebook
	    driver.findElement(By.xpath("//label[@for='u_m_4_Bc']/ancestor::div[2]/div[1]/div/div[2]"));
	    
	    //Ancestor Example- Identify the search text box from the google seaarch button present in the Google search home page/
	     driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']/ancestor::div/form/div/div/div[1]"));
	
	    //Following Example- Identify the Today's Deals link from the amazon search text box present inthe amzon home page
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[@href='/deals?ref_=nav_cs_gb']"));
	    
	    //Parent Example: Identify the hello, singin from the amazon search text box parent in the amazon home page
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[@href='/deals?ref_=nav_cs_gb']"));
	    
	    //Descendant Example: Identify Mobiles link which is part of Menu bar- Amazon
	    driver.findElement(By.xpath("//div[@id='nav-xshop-container']/descendant::a[contains(text(),'Mobiles')]"));
	}
	

}

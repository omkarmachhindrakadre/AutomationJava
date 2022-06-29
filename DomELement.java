package DomElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomELement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://books-pwakit.appspot.com/");
		
		//Host
		WebElement host =driver.findElement(By.tagName("book-app"));//Shadow Host  /root Element
        //shadow dom
		JavascriptExecutor js =(JavascriptExecutor)driver;
	    WebElement shadowDom= (WebElement) js.executeScript("return arguments[0].shadowRoot", host);
	
	    //app-header
	    WebElement appheader = shadowDom. findElement(By.tagName("app-header"));
	    //app-toolbar
	    WebElement apptool = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
	    //book-input
	    WebElement book= apptool.findElement(By.tagName("book-input-decorator"));
	    //input
	    book.findElement(By.cssSelector("input#input")).sendKeys("Testing");
	}

}

package GetWindowsHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open the URL
		driver.get("http://demoqa.com/browser-windows/");
		
		//print parent windows handle
		String parentwindowshandle= driver.getWindowHandle();
		System.out.println("the parent windos handle is"+parentwindowshandle);
	
		//click 3 times
		for(int i=0;i<=3;i++) {
			driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(1000);
		
		
		Set<String> windowshandle=driver.getWindowHandles();
		for(String handle:windowshandle) {
		   System.out.println("The windows handle are" +handle);
		   driver.switchTo().window(handle);
		   //Navigate  to the google
			Thread.sleep(1200);	   
		   driver.get("https://ww.google.com/");
		   driver.manage().window().maximize();
		   
		}
		//close parent windows
		Thread.sleep(1000);
		driver.switchTo().window(parentwindowshandle);
		driver.close();
		
		}
		
	}

}

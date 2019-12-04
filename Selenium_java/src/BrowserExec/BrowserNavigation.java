/**
 * 
 */
package BrowserExec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author rekha.bhatnagar
 *
 */
public class BrowserNavigation {

	/**
	 * @param args
	 */
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		String drvPath = "\\driver\\chromedriver.exe";
		System.setProperty("WebDriver.chrome.driver",drvPath);
		driver = new ChromeDriver();
		
		//String drvUrl ="http://Shop.DemoQA.com/" ;
		String drvUrl ="https://diligenta.test.evolution-system.com/Home" ;
		driver.navigate().to(drvUrl);
		//driver.navigate().forward();*/
		
		 Thread.sleep(1000);
		 
		 
		// Open ToolsQA web site
		 String appUrl = "http://www.DemoQA.com";
		 driver.navigate().to(appUrl);
		 
		 
		 Thread.sleep(1000);
		 
		 // Click on Registration link
		//driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
		
		driver.findElement(By.cssSelector("#menu-top > li:nth-child(2) > a")).click();
		 
		 Thread.sleep(1000);
		 
		 // Go back to Home Page
		 driver.navigate().back();
		
		 Thread.sleep(1000);
		 
		 // Go back to Home Page
		 driver.navigate().back();
		
		 Thread.sleep(1000);
		 
		 // Go forward to Registration page
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 driver.navigate().to("http://newtours.demoaut.com/");
		 
		 
		
		 
		 // Go back to Home page
	//	 driver.navigate().to(appUrl);
		 
		 // Refresh browser
	//	 driver.navigate().refresh();
		 
		 // Close browser
		// driver.close();
		 
		

	}

}

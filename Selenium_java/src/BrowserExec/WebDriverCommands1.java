/**
 * 
 */
package BrowserExec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author rekha.bhatnagar
 *1 Launch a new Chrome browser.
2 Open ToolsQA Practice Automation Page for Switch Windows: https://www.toolsqa.com/automation-practice-switch-windows/
3 Use this statement to click on a New Browser Window button “driver.findElement(By.id(“New Browser Window”)).click();”
4 Close the browser using close() command
5 Close the browser using quit () command - See effect
 */
public class WebDriverCommands1 {

	/**
	 * @param args
	 */
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver","E:\\My-Program Files\\eclipse\\Test_Workspace\\Selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		//driver.findElement(By.id("button1")).click();
		
		//driver.findElement(By.linkText("New Browser Window")).click();
		
		driver.findElement(By.xpath("//*[@id='button1']")).click();	
		
		Thread.sleep(1000);
		//driver.close();
		driver.quit();
	}


}
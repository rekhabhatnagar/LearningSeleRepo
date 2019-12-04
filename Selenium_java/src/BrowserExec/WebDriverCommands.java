/**
 * 
 */
package BrowserExec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author rekha.bhatnagar
 *Launch a new Chrome browser.
Open Shop.DemoQA.com
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.
 */
public class WebDriverCommands {

	/**
	 * @param args
	 */
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","E:\\My-Program Files\\eclipse\\Test_Workspace\\Selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String drvUrl ="http://Shop.DemoQA.com/" ;
		driver.get(drvUrl);
		
		String drvTitle = driver.getTitle();
		int drvTitleLen = driver.getTitle().length();
		
		System.out.println("Title of Current window =" + drvTitle);
		System.out.println( "Length of titile =" + drvTitleLen);
		
		String curUrl = driver.getCurrentUrl();
		
		//if (curUrl.equals(drvUrl))
		if (curUrl.equalsIgnoreCase(drvUrl))			
		{
			System.out.println( "Correct Url =" + curUrl);
		}
		else
		{
			System.out.println( "Incorrect Url");
			System.out.println( "Actual Url should be =" + drvUrl);
			System.out.println( "Current Url is =" + curUrl);
		}
		
		int pageSrcLen = driver.getPageSource().length();
		
		System.out.println( "Page source =" + driver.getPageSource());
		System.out.println( "Length of Page source =" + pageSrcLen);
		
		Thread.sleep(1000);
		driver.close();
	}

}

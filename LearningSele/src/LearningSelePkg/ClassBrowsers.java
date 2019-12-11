package LearningSelePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ClassBrowsers {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String path = "E:\\My-Program Files\\eclipse\\";
		
	/*	String browserType = "mozilla"; //"null;
		
		if (browserType.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		driver = new ChromeDriver();
		} 
		else if (browserType.equals("mozilla"))
		{
		System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", path+"msedgedriver.exe");
			driver = new InternetExplorerDriver();
		}*/
		try
		{
		System.setProperty("webdriver.ie.driver","E:\\My-Program Files\\eclipse\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(2000);	
		driver.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}



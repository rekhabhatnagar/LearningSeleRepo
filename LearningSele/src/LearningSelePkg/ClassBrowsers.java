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
		
		String browserType = "mozilla"; //"null;
		
		/*if (browserType.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		driver = new ChromeDriver();
		} 
		/*else if (browserType.equals("mozilla"))
		{
		System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		{
			System.setProperty("webdriver.ie.driver", path+"msedgedriver.exe");
			driver = new InternetExplorerDriver();
		}*/
		
		System.setProperty("webdriver.ie.driver","E:\\My-Program Files\\eclipse\\msedgedriver.exe");
		driver = new InternetExplorerDriver();
		
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(2000);	
		driver.close();
	}

}

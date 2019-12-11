package JavaSchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffTest {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try
		{
		String exePath = "E:\\My-Program Files\\eclipse\\chromedriver.exe";  
		System.setProperty("webdriver.chrome.driver", exePath);
		
		driver = new ChromeDriver();
		driver.navigate().to("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

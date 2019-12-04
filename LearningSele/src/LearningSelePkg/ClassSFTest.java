package LearningSelePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ClassSFTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String path = "E:\\My-Program Files\\eclipse\\";
		String error ="";
	
		System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.navigate().to("https://login.salesforce.com/");
		
		//driver.findElement(By.id("username")).sendKeys("Rekha");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Rekha");
		driver.findElement(By.name("pw")).sendKeys("Rekha");
		driver.findElement(By.name("Login")).click();
		
		error = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println(error);
		
		//Thread.sleep(2000);	
		//driver.close();
	}

}

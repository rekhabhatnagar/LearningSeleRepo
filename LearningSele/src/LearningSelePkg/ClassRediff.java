package LearningSelePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ClassRediff {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String path = "E:\\My-Program Files\\eclipse\\";
		String error ="";
				System.out.println("Rekha");
	
		System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.navigate().to("https://rediff.com/");
		
		driver.findElement(By.cssSelector("a[class='signin']")).click();
		//driver.findElement(By.name("pw")).sendKeys("Rekha");
	//	driver.findElement(By.name("Login")).click();
		
		//error = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		//System.out.println(error);
		
		//Thread.sleep(2000);	
		//driver.close();
	}

}

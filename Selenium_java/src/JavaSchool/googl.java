package JavaSchool;
//Sample code for download explaining xpath text/siblings/parent
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googl {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try
		{
		String exePath = "E:\\My-Program Files\\eclipse\\chromedriver.exe";  
		System.setProperty("webdriver.chrome.driver", exePath);
		
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("thaggu");
		driver.findElement(By.partialLinkText("Image")).click();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		//
 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

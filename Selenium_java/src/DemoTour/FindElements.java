package DemoTour;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElements {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String drvPath = "\\driver\\chromedriver.exe";
		System.setProperty("WebDriver.chrome.driver",drvPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String drvUrl ="http://newtours.demoaut.com/"; //"http://Shop.DemoQA.com/" ;
		driver.navigate().to(drvUrl);
		//driver.navigate().forward();*/
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Thread.sleep(1000);
		 
		 WebElement element = driver.findElement(By.linkText("REGISTER"));
		 element.click();
		 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 WebElement FName = driver.findElement(By.name("firstName"));
		 FName.sendKeys("Sridharan");
		 
		 WebElement LName = driver.findElement(By.name("lastName"));
		 LName.sendKeys("Mokhopadyay");
		 
		 WebElement Phone = driver.findElement(By.name("phone"));
		 Phone.sendKeys("7878111103");
		 
		WebElement email = driver.findElement(By.name("email"));
		 email.sendKeys("rekha");
		 
		 WebElement UName = driver.findElement(By.name("userName"));
		 UName.sendKeys("abc@gmail.com");
		 
		 WebElement pwd = driver.findElement(By.name("password"));
		 pwd.sendKeys("rekha");
		 
		 WebElement Cpwd = driver.findElement(By.name("confirmPassword"));
		 Cpwd.sendKeys("rekha");
		 
		 WebElement ddlCountry = driver.findElement(By.name("country"));
		 Select ddl1 = new Select(ddlCountry);
		 ddl1.selectByVisibleText("INDIA");
		 
		if (ddl1.isMultiple()) {
	
		System.out.println("DDL is Multiple " );
		}
		else 
		{
			System.out.println("DDL is not Multiple " );
		}
		ddl1.getOptions().add(FName);
		 System.out.println(ddl1.getOptions().add(FName));
	
		 System.out.println(ddl1.getOptions().size());
		 
		/* Thread.sleep(3000);
		 
		 WebElement submit = driver.findElement(By.name("register"));
		submit.click();*/
		 
	}

}

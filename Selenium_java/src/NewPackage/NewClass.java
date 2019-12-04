package NewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewClass {

	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","E:\\My-Program Files\\eclipse\\Test_Workspace\\Selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		//Or can be written as 

		String URL = "https://diligenta.test.evolution-system.com/"; //"http://www.DemoQA.com";
		driver.navigate().to(URL);   		
		driver.getTitle();
		String drvUrl= driver.getCurrentUrl();
		System.out.println(drvUrl);
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='Username']/input[2]")).sendKeys("Ankur.Diligenta");
		//div[@id='Username']/input[2]
		
	  //driver.findElement(By.id("_Username")).sendKeys("Ankur.Diligenta");
	driver.findElement(By.xpath("//div[@id='Password']/input")).sendKeys("Testing1!");
	driver.findElement(By.xpath("//div[@class='col-sm-2 login-layout']/a[@class='btn']")).click();
	
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(8000);
	
	driver.findElement(By.xpath("//div[@class='col-lg-6 col-sm-6 col-xs-6 header-left']//div[2]//img[1]")).click();
	
	driver.switchTo().frame("MenuIFrame");
	
	//driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Timesheets")).click();
	driver.findElement(By.linkText("Process Timesheets")).click();
	
	WebElement dropdown1 = driver.findElement(By.id("selStatusFilter"));
	Select Status = new  Select(dropdown1);
	Status.selectByIndex(0);
	

	driver.findElement(By.id("ctl00_Main_Submit")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("ctl00$Main$btnExportToCSV")).click();
	
	//driver.findElement(By.xpath("//body/div/form[@id='theForm']/div[@id='ctl00_Main_MenuContainer']/ul[@id='menu']/li[@id='mnu1']/a[1]")).click();
	//driver.findElement(By.xpath("//div[@id='ctl00_Main_MenuContainer']/ul[@id='menu']/li[@id='mnu1']/a[1]")).click();
		//String PageSource = driver.getPageSource();
		//System.out.println(PageSource);
		//driver.close();
	}

}

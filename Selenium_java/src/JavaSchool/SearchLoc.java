package JavaSchool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
 import java.awt.event.KeyEvent;

 public class SearchLoc {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver","E:\\My-Program Files\\eclipse\\Test_Workspace\\Selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String drvUrl ="http://Shop.DemoQA.com/" ;
		driver.get(drvUrl);
		Thread.sleep(1000);
		
	//	driver.findElement(By.linkText("Dismiss")).click();
		//Thread.sleep(1000);
		
	//	driver.findElement(By.linkText("My Account")).click();
		
//		driver.findElement(By.xpath("//*[@id='noo-site']/header/div[1]/div/ul[2]/li[2]/a")).click();
		
		/*driver.findElement(By.id("reg_username")).sendKeys("rekha");
		driver.findElement(By.id("reg_email")).sendKeys("rekha.bhatnagar@espire.com");
		
		driver.findElement(By.id("reg_password")).sendKeys("rekha");
		Thread.sleep(1000);
		
		driver.findElement(By.name("register")).click();
		System.out.println("Registration Successful");
		Thread.sleep(1000);*/
		
		
		// Login
		
		/*driver.findElement(By.id("username")).sendKeys("rekha");
		driver.findElement(By.id("password")).sendKeys("rekha");
		
		driver.findElement(By.name("rememberme")).click();
		driver.findElement(By.name("login")).click();
		System.out.println("Logged in Successful");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='noo-site']/header/div[2]/div/div/div/div/a/img")).click();
		
		Thread.sleep(1000);*/
		
		//driver.findElement(By.partialLinkText("Tokyo Talkies")).click();
		
		//driver.findElement(By.xpath("//*[@id='noo-site']/header/div[2]/div/a")).sendKeys("Tokyo");
	
		driver.findElement(By.className("noo-search")).click();
		
		WebElement search = driver.findElement(By.name("s"));
		search.sendKeys("Tokyo");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		WebElement btn = driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt'][@type='submit']"));
		
		int quantity;
	//	WebElement qty = driver.findElement(By.cssSelector("#noo-quantity-773"));
		//WebElement add = driver.findElement(By.xpath("//i[@class='icon_plus']"));
		
		// for dynamically generated id of textbox qty
		WebElement qty = driver.findElement(By.xpath("//input[contains(@id,'noo-quantity')]"));
		qty.clear();
		qty.sendKeys("5");
		
		WebElement ddl1 = driver.findElement(By.id("size"));
		Select size = new Select(ddl1);
		size.selectByVisibleText("S");
		
		WebElement ddl2 = driver.findElement(By.id("color"));
		Select color = new Select(ddl2);
		color.selectByIndex(2);
		
		
		//div[@class='woocommerce-message']
		
		
		if (btn.isDisplayed())
		{
			btn.click();
			WebElement msg = driver.findElement(By.className("woocommerce-message"));
			
			System.out.println("Displayed " + msg.getText() );
			
			WebElement btn1 = driver.findElement(By.linkText("View cart"));
			btn1.click();
		}
		else
		{
			System.out.println("Not Displayed");
		}
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		driver.findElement(By.xpath("//a[contains(@class,'continue')]")).click();
		//driver.findElement(By.className("woocommerce-Price-amount amount")).click();
		
		
		/*WebElement AddtoCart = driver.findElement(By.name("add-to-cart"));
		System.out.println("Got Element");
		System.out.println(AddtoCart.getText());
		
		Actions actions = new Actions(driver);
		actions.moveToElement(AddtoCart);
		
		System.out.println(AddtoCart.getText());
		// actions.click();
		actions.perform();*/
	
		//	driver.findElement(By.partialLinkText("Dress"));
	//	driver.findElement(By.linkText("Log out")).click();
	//	System.out.println("Log out Successful");
		
		
	}

}

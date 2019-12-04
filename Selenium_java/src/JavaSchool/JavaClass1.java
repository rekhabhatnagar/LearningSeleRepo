package JavaSchool;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaClass1 {

	public static WebDriver driver = null;
	static String drvPath = "\\driver\\chromedriver.exe";
	static String drvUrl ="http://Shop.DemoQA.com/" ;
	
	
	public static void main(String[] args) throws AWTException, InterruptedException, NumberFormatException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",drvPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		drvUrl = "http://shop.demoqa.com/shop/";
		driver.navigate().to(drvUrl);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement ddl1 = driver.findElement(By.name("orderby"));
		Select order = new Select(ddl1);
		order.selectByIndex(2);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		List<WebElement> totalItem = driver.findElements(By.xpath("//span[@class='woocommerce-Price-amount amount'] "));

		List<WebElement> txtItem = driver.findElements(By.xpath("//div[@class='noo-product-inner']/h3/a"));
		List<WebElement> txtSale = driver.findElements(By.xpath("//span[@class='onsale']"));
						
		
	/*		System.out.println(totalItem.size());
		
	for (int i=1; i<(txtItem.size()) ; i++)
		{
		System.out.println("Product = " + txtItem.get(i).getText() + totalItem.get(i).getText());
		String fullTxt = totalItem.get(i).getText().substring(1,2);
		//System.out.println(fullTxt.substring(1) );
		
		
		/*if (Integer.parseInt((fullTxt)) >20)
		{
			System.out.println("High Price Product = " + txtItem.get(i).getText()+ totalItem.get(i).getText());
		}
		System.out.println("Low Price Product = " + txtItem.get(i).getText()+ totalItem.get(i).getText());
		}*/
		
		for (int i=0 ; i< txtSale.size() ; i++)
		{
			System.out.println("High Price Product = " + txtItem.get(i).getText()+ totalItem.get(i).getText());
			
			}
		
		
		}
		
		
		}
		//noo-product-inner
		
		
	




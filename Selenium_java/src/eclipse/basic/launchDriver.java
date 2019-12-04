package eclipse.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchDriver {

public static WebDriver driver = null;

public static void main(String[] args) throws InterruptedException
{
System.setProperty("WebDriver.chrome.driver","E:\\My-Program Files\\eclipse\\Test_Workspace\\Selenium_java\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.navigate().to("https://amazon.in");

String Title = driver.getTitle();
System.out.println(Title);

driver.findElement(By.linkText("Best Sellers")).click();

WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"));

Select ddl1 = new Select(dropdown1);

ddl1.selectByIndex(11);

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("the power of your subconscious mind");

driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();

Thread.sleep(5000);

//driver.quit();

}

}


/*public class launchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

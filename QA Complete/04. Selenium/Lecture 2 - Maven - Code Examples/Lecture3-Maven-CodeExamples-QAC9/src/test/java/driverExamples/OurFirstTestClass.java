package driverExamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class OurFirstTestClass {
	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/selenium_drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://pragmatic.bg/automation/example4.html");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testExamples() throws Throwable{
		
		WebElement textElement = driver.findElement(By.id("nextBid"));		
		textElement.sendKeys("100");
		Thread.sleep(1000);
		
		WebElement butonche = driver.findElement(By.xpath("//*[@id='selectLoad']"));
		butonche.click();
		
		Thread.sleep(3000);
	}
}

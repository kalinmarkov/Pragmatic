package pragmatic;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckLogin {
	
	 private static WebDriver driver;

	@Before
    public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:/selenium_drivers/geckodriver.exe");
		driver = new FirefoxDriver();
    	driver.get("http://shop.pragmatic.bg/admin");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	@Test
    public void testCheckLogin() throws InterruptedException {
		
		WebElement usernameField = driver.findElement(By.id("input-username"));
		usernameField.sendKeys("admin");
		Thread.sleep(1000);
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("parola123!");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/div[3]/button"));
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement sales = driver.findElement(By.xpath("//html/body/div[1]/nav/ul/li[5]/a"));
		sales.click();
		Thread.sleep(1000);
		
		WebElement orders = driver.findElement(By.xpath("//html/body/div[1]/nav/ul/li[5]/ul/li[1]/a"));
		orders.click();
		Thread.sleep(1000);
		
		WebElement dropDownOrderStatus = driver.findElement(By.id("input-order-status"));
 		Select inputOrderStatus = new Select(dropDownOrderStatus);
 		
 		assertEquals(16, inputOrderStatus.getOptions().size());
 		
    
    	List<String> exp_options = Arrays.asList(new String[]{"MissingOrders", "Canceled", "Canceled Reversal","Chargeback","Complete",
    			"Denied","Expired","Failed","Pending","Processed","Processing","Refunded","Reversed","Shipped","Voided"});
    	List<String> act_options = new ArrayList<String>();
    	
    	List<WebElement> allOptions = inputOrderStatus.getOptions();
    	
    
    	for(WebElement option : allOptions)
    		 act_options.add(option.getText());
		
//		WebElement message = driver.findElement(By.id("input-username"));
//		message.sendKeys("admin");
//		
//		message = driver.findElement(By.id("input-password"));
//		message.sendKeys("parola123!");
//		
//		WebElement button = driver.findElement(By.xpath("//button[.=' Login']"));
//		button.click();
//		
//		WebElement dropDown = driver.findElement(By.xpath("//ul[@id='menu']/li[5]/a[.=' Sales']"));
//		Select sales = new Select(dropDown);
	}
	
	@After
    public void tearDown() {
	 //	driver.close();
     //   driver.quit();
    }
}

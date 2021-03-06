package bg.pragmatic.lecture4.waits;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {
 	
	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testExplicitWait()
 	{
 		
// 		WebDriverWait myWait = new WebDriverWait(driver, 5, 200);
 		
        driver.get("http://pragmatic.bg/automation/ajax/demo.html");
        
//        ExpectedCondition<WebElement> loginButtonIsPresent = new ExpectedCondition<WebElement>() {
//			@Override
//        	public WebElement apply(WebDriver input) {
//				return input.findElement(By.id("loginButton"));
//			}
//		};
//        
//        
        
        try {
 			WebElement page4button = driver.findElement(By.linkText("Page 4"));
 			page4button.click();
 			
// 			vtp example 1:
 			/*
 			WebElement moqElement = myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div")));
 			
 			myWait.until(loginButtonIsPresent).click();
 			*/
 		
 			Wait<WebDriver> wait = new WebDriverWait(driver, 5);
 			
 			
 			WebElement message = wait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver d) {
					return d.findElement(By.xpath("//div[contains(text(),'XNunc nibh tortor')]"));
				}
			});
 			
 			
// 			WebElement message = (new WebDriverWait(driver, 5))
// 					  .until(new ExpectedCondition<WebElement>(){
// 						public WebElement apply(WebDriver d) {
// 							return d.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
// 						}});
 			
 			assertTrue(message.getText().contains("Nunc nibh tortor"));
 			System.out.println("Success123");
 			
 		} catch (NoSuchElementException e) {
 			fail("Element not found!!");
 			e.printStackTrace();
 		} finally {
 			driver.close();
 		}
 	}
	
	
	@Test
	public void testExplicitWaitByTitle()
	{

		 driver.get("http://www.google.us");
		 
		 WebElement query = driver.findElement(By.name("q"));
		 query.sendKeys("selenium");
		 query.submit();
		 		 
		boolean expectedTitleFound =  (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			 public Boolean apply(WebDriver d) {
				 return d.getTitle().toLowerCase().startsWith("selenium");
		 }});

		 assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
		 System.out.println("assert 1 pass");
//		 or
		 assertTrue(expectedTitleFound);
		 System.out.println("assert 2 pass");
		

		 driver.quit();
	}
	
	@Test
	public void testExplicitWaitTitleContains() throws InterruptedException
	{

		//Go to the Google Home Page
		driver.get("http://www.google.us");
	
		//Enter a term to search and submit
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("selenium");
		query.submit();
		
		Thread.sleep(2000);
		
		//Create Wait using WebDriverWait. 
		//This will wait for 10 seconds for timeout before title is updated with search term
		//If title is updated in specified time limit test will move to the text step 
		//instead of waiting for 10 seconds
		Wait<WebDriver> wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.titleContains("selenium"));
//		wait.until(ExpectedConditions.titleContains("lenium"));
		//Verify Title
		assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
		System.out.println("Success!");
		
		driver.quit();
	}
	
	
}

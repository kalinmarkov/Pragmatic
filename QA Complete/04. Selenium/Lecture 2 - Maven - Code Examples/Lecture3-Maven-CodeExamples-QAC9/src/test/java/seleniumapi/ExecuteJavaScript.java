package seleniumapi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExecuteJavaScript {
	@Test   //open class ExecuteJavaScript
	public void testJavaScriptCalls() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/selenium_drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
			
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String title = (String) js.executeScript("return document.title");
		assertEquals("Google", title);

		long links = (Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
		System.out.println("count= " + links);
		assertEquals(44, links);
			
		driver.quit();
			
	}
}
package bg.pragmatic.lecture4.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementStateTests {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\selenium_drivers\\geckodriver.exe");
		// driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
	}

	@Test
	public void testElementIsEnabled() throws InterruptedException {
		// Get the Checkbox as WebElement using it's name attribute
//		WebElement checkbox = driver.findElement(By.xpath("//input[@name='ledheadlamp']"));
		 WebElement checkbox = driver.findElement(By.xpath("//input[@name='parksensor']"));

		// Check if its enabled before selecting it
		if (checkbox.isEnabled()) {
			// Check if its already selected? otherwise select the Checkbox

			if (!checkbox.isSelected())
				checkbox.click();
			
			System.out.println(checkbox.getAttribute("value") + " selected");

			Thread.sleep(2000);
		} else {
			fail("Checkbox [" + checkbox.getAttribute("value") + "] is disabled!!");
		}
	}

	@Test
	public void testIsElementPresent() throws Throwable {
		// Check if element with locator criteria exists on Page
		if (isElementPresent(By.name("airbags"))) {
			// Get the checkbox and select it
			WebElement airbag = driver.findElement(By.name("airbags"));

			if (!airbag.isSelected()) {
				Thread.sleep(2000);
				airbag.click();
				System.out.println("kliknah go");
				Thread.sleep(2000);
			}

			System.out.println("Elementa e tuk");
		} else {
			fail("Airbag Checkbox doesn't exists!!");
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
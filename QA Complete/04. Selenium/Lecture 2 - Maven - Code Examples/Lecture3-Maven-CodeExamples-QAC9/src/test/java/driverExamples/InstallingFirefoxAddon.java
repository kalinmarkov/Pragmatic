package driverExamples;
import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.junit.*;



public class InstallingFirefoxAddon {
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver19.exe");
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		File file = new File ("C:/Users/Strahinski/Desktop/Automated Testing Course/Libraries - JUnit and Selenium/firebug-1.12.6-fx.xpi");
		profile.addExtension(file);
		options.setProfile(profile);
	    driver = new FirefoxDriver(options);
	    driver.get("http://pragmatic.bg/automation/example4.html");
	}
	
	@After
	public void tearDown() {
	    driver.quit();
	}
	
	@Test
	public void testExamples()  {
	    WebElement element = driver.findElement(By.id("nextBid"));
	    element.sendKeys("100");
	}
}

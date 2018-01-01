package automatedtests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automatedtests.utils.Browser;

public class AdminLogin {

	/**
	 * Using this method you will open http://shop.pragmatic.bg/admin
	 * in your web browser.
	 */
	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	/**
	 * Using this method you will login in the admin back end 
	 * with the provided user name and password as parameters.
	 * It fills the username and the password, then it clicks
	 * on the login button.
	 * 
	 * @param username this is the username you would like to be typed
	 * @param password this is the password you would like to be typed
	 * @author Strahinski
	 * @since 2.11.2017
	 */
	public static void login(String username, String password) {
		WebElement usernameInputField = Browser.driver.findElement(By.id("input-username"));
		usernameInputField.sendKeys(username);
		Browser.driver.findElement(By.id("input-password")).sendKeys(password);
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
	}

	/**
	 * blablablabla
	 * @param messageOnFailure
	 * @param expectedValidationMessage
	 */
	public static void verifyValidationMessage(String messageOnFailure, String expectedValidationMessage) {
		String actualValidationMessage = Browser.driver.findElement(By.cssSelector(".alert-danger")).getText();
	
		Assert.assertTrue(messageOnFailure, actualValidationMessage.contains(expectedValidationMessage));
	}

}

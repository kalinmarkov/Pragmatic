package automatedtests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import automatedtests.pages.AdminDashboard;
import automatedtests.pages.AdminLogin;
import automatedtests.utils.Browser;

public class AdminLoginTest {

	
	@Before
	public void setup() {
		Browser.openBrowser();
	}
	
	@Test
	public void successfulLogin() {
		AdminLogin.open();
		AdminLogin.login("admin", "parola123!");
		AdminDashboard.verifyTitle("You did not login successfully so there might"
				+ "be a bug in that functionatlity because the Dashboard"
				+ "was not present.", "Dashboard");
	}
	
	@Test
	public void unsuccessfulLogin() {
		AdminLogin.open();
		AdminLogin.login("asdfasdf", "dsafaasdfasdf");
		AdminLogin.verifyValidationMessage("The expecte validation message was not present", "No match for Username and/or Password.");
	}
	
	@After
	public void tearDown() {
		Browser.quit();
	}
}

package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.Logout;

public class LogoutPageTest extends BaseTest {

	@BeforeClass
	public void logoutPageSetup() {
		login = new Login(driver);
		logout = login.doLogin("bimleshm@gmail.com", "Password@123");
	}

	@Test
	public void doLogoutTest() {
		logout.doLogout();
	}
}

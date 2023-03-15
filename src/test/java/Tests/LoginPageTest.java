package Tests;

import org.testng.annotations.Test;

import Pages.Login;

public class LoginPageTest extends BaseTest {

	@Test
	public void doLoginTest() {
		login = new Login(driver);
		login.doLogin("bimleshm@gmail.com", "Password@123");
	}
}

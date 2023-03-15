package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import BrowserFactory.BrowserFactory;
import Pages.Login;
import Pages.Logout;

public class BaseTest {

	static WebDriver driver;
	Login login;
	Logout logout; 
	
	@BeforeTest
	public void setup() {
		driver = BrowserFactory.LaunchBrowser("chrome", "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	

	
}

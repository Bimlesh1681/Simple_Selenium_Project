package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	private WebDriver driver;
	
	private By emailId = By.id("input-email");
	private By pass = By.id("input-password");
	private By loginBtn = By.cssSelector("input.btn-primary");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public Logout doLogin(String username, String password) {
		driver.findElement(emailId).sendKeys("bimleshm@gmail.com");
		driver.findElement(pass).sendKeys("Password@123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(loginBtn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Logout(driver);
	}
}

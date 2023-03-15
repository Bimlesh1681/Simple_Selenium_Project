package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	private WebDriver driver;
	
	private By myAccount = By.xpath("//span[text()='My Account']");
	private By logout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']");
	
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doLogout() {
		driver.findElement(myAccount).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(logout).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

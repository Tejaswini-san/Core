package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	WebDriver driver;

	public RediffLoginpage(WebDriver driver) {
		this.driver = driver;

	}

	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@name='proceed']");
	By Home=By.linkText("Home");
	

	public WebElement emailId() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Go() {
		return driver.findElement(login);
	}
	public WebElement home() {
		return driver.findElement(Home);
	}
}

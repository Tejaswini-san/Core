package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {
	WebDriver driver;

	public RediffHomepage(WebDriver driver) {
		this.driver = driver;

	}
By search=By.id("srchword");
By butten=By.xpath("//input[@type='submit']");
public WebElement search() {
return driver.findElement(search);
	}
public WebElement butten() {
return driver.findElement(butten);
	}
}

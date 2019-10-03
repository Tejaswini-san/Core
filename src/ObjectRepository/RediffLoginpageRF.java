package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpageRF {
	WebDriver driver;

	public RediffLoginpageRF(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='proceed']")
	WebElement login;


	public WebElement emailId() {
		// TODO Auto-generated method stub
		return username;
	}

	public WebElement Password() {
		// TODO Auto-generated method stub
		return password;
	}

	public WebElement login() {
		// TODO Auto-generated method stub
		return login;
	}

	

	}

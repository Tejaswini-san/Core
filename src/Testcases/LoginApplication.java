package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomepage;
import ObjectRepository.RediffLoginpage;

public class LoginApplication {
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.emailId().sendKeys("Hello");
		rd.Password().sendKeys("123");
		rd.Go().click();
		rd.home().click();
		RediffHomepage rh=new RediffHomepage(driver);
		rh.search().sendKeys("abcd");
		rh.butten().click();
	}
}

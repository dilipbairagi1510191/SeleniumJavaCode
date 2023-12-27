package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffSignInPage {

	WebDriver driver;
	By username=By.xpath("//input[@id='login1']");
	By password=By.id("password");
	By signBtn=By.name("proceed");
	
	public RediffSignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}

	public WebElement signBtn()
	{
		return driver.findElement(signBtn);
	}
	
	
	}


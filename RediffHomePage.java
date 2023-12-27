package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
	
	WebDriver driver;
	//By Logo=By.xpath("//span[@class='hmsprite logo']");
	@FindBy(xpath="//span[@class='hmsprite logo']")
	WebElement logo;
	
	
	//By signIn=By.xpath("//a[@title='Already a user? Sign in']");
	@FindBy(xpath="//a[@title='Already a user? Sign in']")
	WebElement signIn;
	
	
	
	
	
	
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Logo()
	{
		//return driver.findElement(Logo);
		return logo;
	}
     
	public WebElement signIn()
	{
		//return driver.findElement(signIn);
		return signIn;
	}
	
	
}

package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectRepository.RediffHomePage;
import PageObjectRepository.RediffSignInPage;

public class Program1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyLogo()
	{
		RediffHomePage rph=new RediffHomePage(driver);
		WebElement logo=rph.Logo();
		Boolean flag=logo.isDisplayed();
		Assert.assertTrue(flag);	
	}
	
	@Test
	public void signIn()
	{
		RediffHomePage rph=new RediffHomePage(driver);
		rph.signIn().click();
		
		RediffSignInPage sgn=new RediffSignInPage(driver);
		sgn.username().sendKeys("abc");
		sgn.password().sendKeys("123");
		sgn.signBtn().click();
	}
	
	
	
	@AfterMethod
	public void teardown()
    {
		driver.quit();
	}
}

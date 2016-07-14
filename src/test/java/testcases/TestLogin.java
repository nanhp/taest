package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class TestLogin {
	WebDriver driver;
	LoginPage objLogin;
	HomePage objHomePage;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/");
	}
	
	@Test
	  public void test_HomePage() {
		
		//Create LoginPage object
		objLogin = new LoginPage(driver);
		
		//Verify login page title
		String actualLoginPageTitle = objLogin.getLoginPageTitle();
		Assert.assertTrue(actualLoginPageTitle.toLowerCase().contains("guru99 bank"));
		
		//login to application
		objLogin.login("mngr42943", "ataqAsA");
		
		//go to the next page
		objHomePage = new HomePage(driver);
				
		//Verify home page
		String actualUserName = objHomePage.getHomePageUserName();
		Assert.assertTrue(actualUserName.toLowerCase().contains("manger id : mngr42943"));
		
	  }
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}

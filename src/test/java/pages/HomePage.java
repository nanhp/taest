package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	
	By homePageUserName = By.xpath("//table//tr[@class='heading3']");
	
	public HomePage(WebDriver driver2) {
		this.driver = driver2;
	}

	//Get the User name from Home page
	public String getHomePageUserName()
	{
		return driver.findElement(homePageUserName).getText();
	}
}

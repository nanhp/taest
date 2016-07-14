package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//table//tr[@class='heading3']")
	WebElement homePageUserName;
	
	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}

	//Get the User name form Home page
	public String getHomePageUserName()
	{
		return homePageUserName.getText();
	}
	
  
}

package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(className="barone")
	WebElement titleText;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		
		//this initElements method will create all WebElements
		PageFactory.initElements(driver2, this);
	}

	//Set user name in textbox
	public void setUserName(String strUserName)
	{
		userName.sendKeys(strUserName);
	}
	
	//Set password in textbox
	public void setPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	
	//click on Login button
	public void clickLogin()
	{
		login.click();
	}
	
	//Get the title of Login page
	public String getLoginTitle()
	{
		return titleText.getText();
	}
	
	//Method Login
	public void login(String strUserName, String strPassword)
	{
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPassword);
		//Click Login button
		this.clickLogin();
	}
}

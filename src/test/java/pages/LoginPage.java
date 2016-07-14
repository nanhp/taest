package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	By userName = By.name("uid");
	By password = By.name("password");
	By login = By.name("btnLogin");
	By titleText = By.className("barone");
	
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
	}

	//Set user name in textbox
	public void setUserName(String strUserName)
	{
		driver.findElement(userName).sendKeys(strUserName);
	}
	
	//Set password in password textbox
	public void setPassword(String strPassword)
	{
		driver.findElement(password).sendKeys(strPassword);
	}
	
	//Click on login button
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	
	//Get the title of Login page
	public String getLoginPageTitle()
	{
		return driver.findElement(titleText).getText();
		
	}
  
	//Login method
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

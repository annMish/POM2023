package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;



public class LoginPage {
	
	public WebDriver myDriver;
	public ElementUtil eleutil;
	
	public LoginPage(WebDriver myDriver) {
	   this.myDriver=myDriver;
	 }
	
	 		
	private By email_address = By.id("input-email");
	private By password = By.id("input-password");
	private By forgotPasswordtext= By.linkText("Forgotten Password");
	private By loginButton=By.xpath("//input[@type= 'submit']");
	
	
	public String getLoginPageTitle() {
		String title= myDriver.getTitle();
		System.out.println(title);
		return title;
	
	}
	public String getLoginPageURL() {
		String url= myDriver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public AccountsPage doLogin(String username, String pwd) {
		myDriver.findElement(email_address).sendKeys(username);
		myDriver.findElement(password).sendKeys(pwd);
		myDriver.findElement(loginButton).click();
		return new AccountsPage(myDriver);
	}
	
	
//	public AccountsPage doLoginwithEleUtil(String value) {
//		eleutil.waitForElementVisible(email_address, 5).sendKeys(value);
//		eleutil.waitForElementVisible(password, 1).sendKeys(value);
//		eleutil.waitForElementVisible(loginButton, 3).click();
//		return new AccountsPage(driver);
//	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	



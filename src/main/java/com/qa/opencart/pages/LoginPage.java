package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	   this.driver=driver;
	 }
	
	 		
	private By email_address = By.id("input-email");
	private By password = By.id("input-password");
	private By forgotPasswordtext= By.linkText("Forgotten Password");
	private By loginButton=By.xpath("//input[@type= 'submit']");
	
	
	public String getLoginPageTitle() {
		String title= driver.getTitle();
		System.out.println(title);
		return title;
	
	}
	public String getLoginPageURL() {
		String url= driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public AccountsPage doLogin(String username, String pwd) {
		driver.findElement(email_address).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
		return new AccountsPage(driver);
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	



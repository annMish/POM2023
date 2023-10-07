package com.qa.opencart.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.qa.openacart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {

	DriverFactory df;
	public WebDriver myDriver;
	protected LoginPage loginPage;
	
	
	@BeforeTest
	public void Setup() {
		
		df= new DriverFactory();
		myDriver = df.init_driver("Chrome");
	   	loginPage= new LoginPage(myDriver);
	}
		
	public void TearDown() {
			myDriver.quit();
	}
	
}
	
	


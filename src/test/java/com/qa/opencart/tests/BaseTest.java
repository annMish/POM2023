package com.qa.opencart.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.qa.openacart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.utils.ElementUtil;

public class BaseTest {

	DriverFactory df;
	public WebDriver myDriver;
	protected LoginPage loginPage;
	protected AccountsPage acctpage; 
	//protected ElementUtil eleutil;
	
	@BeforeTest
	public void Setup() {
		
		df= new DriverFactory();
		myDriver = df.init_driver("Chrome");
	   	loginPage= new LoginPage(myDriver);
	   	//eleutil=new ElementUtil(myDriver);
	   	
	}
		
	public void TearDown() {
			myDriver.quit();
	}
	
}
	
	


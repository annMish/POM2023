package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.opencart.pages.AccountsPage;

public class LoginPageTest extends BaseTest {

	@Test		
	public void LoginPagetitleTest() {
	String actualTitle= loginPage.getLoginPageTitle();
	Assert.assertEquals(actualTitle,"Account Login");
	}
	
	
	@Test
	public void loginTest() {
		AccountsPage accPage =loginPage.doLogin("naveenanimation20@gmail.com", "Selenium@12345");
		
				}
	
	
}

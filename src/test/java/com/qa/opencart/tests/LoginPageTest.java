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
	public void getLoginPageURLTest() {
		String currentURL= loginPage.getLoginPageURL();
		Assert.assertEquals(currentURL, "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		}
	
	
	@Test
	public void loginTest() {
		AccountsPage acctpage =loginPage.doLogin("anu7565@gmail.com", "Test@12345");
		Assert.assertTrue(acctpage.logoutButtonIsDisplayed());
		
						}
	
	
	}


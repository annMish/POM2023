package com.qa.opencart.tests;

import java.util.Collection;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.utils.Constants;

public class AccountsPageTest extends BaseTest {

	
	private static final Collection<?> Acct_Page_Header = null;

	@BeforeClass
	public void accSetup() {
		acctpage=loginPage.doLogin("anu7565@gmail.com", "Test@12345");
	}
	
	

	
	@Test
	public void accPageTitleTest() {
		Assert.assertEquals(acctpage.accPageTitle(), "My Account");
	}
	
	@Test
	public void rightPanelListTest(){
		System.out.println(acctpage.rightHandPanelList());
	}
		
	@Test
	public void logoutButtonIsDisplayedTest() {
		Assert.assertTrue(acctpage.logoutButtonIsDisplayed());
	}
		
	@Test
	public void acctActualHeaderListTest() {
		Assert.assertEquals(acctpage.acctpageHeader(), Constants.ACCOUNTS_PAGE_SECTIONS_HEADER_LIST);
		
	}
	
	}
	
	
	


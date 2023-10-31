package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.pages.SearchResultsPage;

public class CommanPageTest extends BaseTest{
	
	@BeforeClass
	public void accSetup() {
	loginPage.doLogin("anu7565@gmail.com", "Test@12345");
	}

//	@Test
//	public void doClickSearchButtonTest() {
//		Assert.asserttrue(commanpage.doClickSearchButton(), " Search - laptop");
//		
//	}
	@Test
	public void verifySearchTextTest() {
		SearchResultsPage searchtext=commanpage.doClickSearchButton("laptop");
         System.out.println(searchtext);
         Assert.assertEquals(searchrespage.verifysearchtextisDisplayed(), "Search - laptop");
        
	}
	
}

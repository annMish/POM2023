package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.opencart.utils.Constants;



public class AccountsPage {

	public WebDriver myDriver;
	private By logoutButton=By.linkText("Logout");
	private By rightHandpanelList= By.xpath("//div[@class='list-group']/a");
	private By acctPageHeader= By.xpath("//div[@id='content']//h2");
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	//private By logoutButton= By.xpath("//div[@class='list-group']/a[text()='Logout']");
	//private By AccountLogoutText=By.linkText("Account Logout");
	
	public  AccountsPage(WebDriver myDriver) {
		this.myDriver=myDriver;
	}
	
	public String accPageTitle() {
		String title=myDriver.getTitle();
		return title;
	
	}
	
	
	
	
	public List<String> acctpageHeader() {
		List<WebElement> acctheaderList= myDriver.findElements(acctPageHeader);
		List<String> acctActualHeaderList= new ArrayList<String>();
		
		for (WebElement e :acctheaderList) {
			acctActualHeaderList.add(e.getText());
			
		}
		return acctActualHeaderList;
		
	}
	
	
	public  boolean logoutButtonIsDisplayed() {
		return myDriver.findElement(logoutButton).isDisplayed();
	}

	public List<String> rightHandPanelList() {
		 List<WebElement> rightpanelList= myDriver.findElements(rightHandpanelList);
		 List<String> rghrvaluesList= new ArrayList<String>();
		 
		 for(WebElement e:rightpanelList ) {
			 String text= e.getText();
		 rghrvaluesList.add(text);
			}
			return rghrvaluesList;
	}
	
	
	public LoginPage doLogout() {
		myDriver.findElement(logoutButton).click();
		 return new LoginPage(myDriver);
	}
	
	public String logoutPageTitle() {
		String logoutTitle=myDriver.getTitle();
		return logoutTitle; 
	}
	
	
}

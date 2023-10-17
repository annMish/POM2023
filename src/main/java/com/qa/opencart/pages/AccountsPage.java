package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AccountsPage {

	public WebDriver driver;
	private By logoutButton=By.linkText("Logout");
	private By rightHandpanelList= By.xpath("//div[@class='list-group']/a");
	private By acctPageHeader= By.xpath("//div[@id='content']//h2");
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public  AccountsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String accPageTitle() {
		String title=driver.getTitle();
		return title;
	
	}
	
	
	
	
	public List<String> acctpageHeader() {
		List<WebElement> acctheaderList= driver.findElements(acctPageHeader);
		List<String> acctActualHeaderList= new ArrayList<String>();
		
		for (WebElement e :acctheaderList) {
			acctActualHeaderList.add(e.getText());
			
		}
		return acctActualHeaderList;
		
	}
	
	
	public  boolean logoutButtonIsDisplayed() {
		return driver.findElement(logoutButton).isDisplayed();
	}

	public List<String> rightHandPanelList() {
		 List<WebElement> rightpanelList= driver.findElements(rightHandpanelList);
		 List<String> rghrvaluesList= new ArrayList<String>();
		 
		 for(WebElement e:rightpanelList ) {
			 String text= e.getText();
		 rghrvaluesList.add(text);
			}
			return rghrvaluesList;
	}
	
	
	
	
	
}

package com.qa.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {

	public WebDriver myDriver;
	private By searchtext=By.xpath("//h1 [text()='Search - laptop']");
	
	
	public SearchResultsPage(WebDriver myDriver) {
		this.myDriver=myDriver;
	}

	public String verifysearchtextisDisplayed() {
		WebDriverWait wait= new WebDriverWait(myDriver,Duration.ofSeconds(5));
		String verifyText= wait.until(ExpectedConditions.visibilityOfElementLocated(searchtext)).getText();
		return verifyText;
		
				
		}
	
	//return myDriver.findElement(searchtext).isDisplayed();
	
	
	
//			wait.until(ExpectedConditions.urlContains("search=laptop"));
//			return;
//			WebElement searchTestResult=myDriver.findElement(searchtext);
//			System.out.println(searchTestResult);
//	
		
	
	
	
}

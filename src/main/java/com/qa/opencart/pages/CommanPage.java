package com.qa.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommanPage {

	public WebDriver myDriver;
	 private By searchbox=By.xpath("//input[@name='search']");
	 private By searchIcon = By.cssSelector("div#search button");
	 
	 
	public CommanPage(WebDriver myDriver) {
		this.myDriver= myDriver;
	}

	public  SearchResultsPage doClickSearchButton(String text) {
		WebDriverWait wait= new WebDriverWait(myDriver,Duration.ofSeconds(5));
		WebElement eleSearch=wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
		eleSearch.sendKeys(text);
		wait.until(ExpectedConditions.presenceOfElementLocated(searchIcon)).click();
		return new SearchResultsPage(myDriver);
		
	}
	
	
}

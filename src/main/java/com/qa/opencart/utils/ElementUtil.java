//package com.qa.opencart.utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class ElementUtil {
//
//	public static  WebDriver myDriver;
//	
//	public ElementUtil(WebDriver myDriver) {
//		ElementUtil.myDriver=myDriver;
//	}
//	
//	
//	public  WebElement waitForElementPresent(By locator, int timeOut) {
//		WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(timeOut));
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
//		public  WebElement waitForElementVisible(By locator, int timeOut) {
//			WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(timeOut));
//			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//}
//		
//		public  String waitForUrlContains(String urlFraction, int timeOut) {
//			WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(timeOut));
//			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
//				return myDriver.getCurrentUrl();
//			}
//			return null;
//		}
//
//		public  String waitForUrlIs(String urlValue, int timeOut) {
//			WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(timeOut));
//			if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
//				return myDriver.getCurrentUrl();
//			}
//			return null;
//		}
//
//		public  String waitForTitleContains(String titleFraction, int timeOut) {
//			WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(timeOut));
//			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
//				return myDriver.getTitle();
//			}
//			return null;
//		}
//
//		public  String waitForTitleIs(String titleValue, int timeOut) {
//			WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(timeOut));
//			if (wait.until(ExpectedConditions.titleIs(titleValue))) {
//				return myDriver.getTitle();
//			}
//			return null;
//		}
//
//	}
//
//

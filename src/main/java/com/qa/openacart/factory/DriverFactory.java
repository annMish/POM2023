package com.qa.openacart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	WebDriver driver;
	
		
		public WebDriver init_driver(String browserName) {
			
							
			System.out.println("browser name is : " + browserName);

			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options=new FirefoxOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new FirefoxDriver(options);
				
			} else if (browserName.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
				
			} else {
				System.out.println("please pass the right browser name... " + browserName);
			}

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			//driver.get("https://demo.opencart.com/index.php?route=account/login");
			return driver;
	    
	    
		}
	}
	
	


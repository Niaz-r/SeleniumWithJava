package com.mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
    protected static WebDriver driver;

    @BeforeSuite
    public static void setupDriver() {
    	
    	// Disable notifications & popups
//    	options.addArguments("--disable-popup-blocking");
//    	options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    
    @AfterSuite
    public void tearDown() {
       // if (driver != null) 
    	{
    		driver.close();
           // driver.quit();
        }
    }
}

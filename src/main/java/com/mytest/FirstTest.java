package com.mytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTest extends BaseDriver {

    @BeforeSuite
    public void setUp() {
        initDriver();
    }

    @Test
    public void openGoogle() throws InterruptedException {
    	driver.manage().window().maximize();
        driver.get("https://mvnrepository.com");
    
        Thread.sleep(2000);
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

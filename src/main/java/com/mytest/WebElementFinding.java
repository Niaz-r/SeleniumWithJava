package com.mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementFinding extends BaseDriver {
	
	
	@BeforeTest
	public void setUp() {
        initDriver();
    }
	
	@Test
	public void locatorFinding() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		
//		WebElement html = driver.findElement(By.xpath("/html/body/div[4]/div/a[1]"));
//		html.click();
//		
		WebElement search = driver.findElement(By.id("learntocode_searchbtn"));
		search.click();
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
	

}
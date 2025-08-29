package com.mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScollUPDown extends BaseDriver {
	
	
	@Test
	public void scrollUPDown() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
WebElement location = driver.findElement(By.id("298ace32-a6d1-4891-9557-aedf4f508eaa"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", location)	;
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

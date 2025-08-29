package com.mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover extends BaseDriver {
	
	
	@Test
	public void mouseHover() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://prismic.io/blog/css-hover-effects");
	
			
			
			//WebElement solutions = driver.findElement(By.xpath("//*[@id=\"radix-:rb:-trigger-radix-:rd:\"]/span"));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement solutions = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"radix-:rb:-trigger-radix-:rd:\"]/span"))
			);

		//	WebElement solutions = driver.findElement(By.xpath("//*[@id=\"radix-:rb:-trigger-radix-:rd:\"]/span"));
			
			 Actions actions = new Actions(driver);
		
			 actions.moveToElement(solutions).perform();
			 Thread.sleep(3000);
			
//			 WebElement developer = driver.findElement(By.LinkText("/developers"));
//			 developer.click();
//			 Thread.sleep(3000);
//			 
			 
			 
		
	}
	

}

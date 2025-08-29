package com.mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitAndExplicitWait extends BaseDriver {
	
	@Test
	public void explicitWait() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement blog = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main_navbar\"]/ul/li[6]")));
		
		blog.click();
		
		Thread.sleep(2000);
		
		
		
	}

}

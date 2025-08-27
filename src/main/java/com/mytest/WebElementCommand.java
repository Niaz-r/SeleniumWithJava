package com.mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementCommand extends BaseDriver {
	

	
	String url ="https://demoqa.com/automation-practice-form";
	

	
	@Test
	public void webelementcommand() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		if(firstname.isDisplayed())
		{
			firstname.sendKeys("niaz");
		}
			
	
		
		Thread.sleep(2000);
		
		String mplacehlder;
		
		WebElement mobilePlaceHlder = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
		mplacehlder=  mobilePlaceHlder.getAttribute("placeholder");
		
		System.out.println(mplacehlder);
		
		
		
	}

}

package com.mytest;

import java.text.Normalizer.Form;

import javax.swing.text.html.FormSubmitEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateTest extends BaseDriver{

	String url = "https://demoqa.com/";
	
	@Test
	public void navigation() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement forms = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
		forms.click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	
	

	
	
   
	
}
;
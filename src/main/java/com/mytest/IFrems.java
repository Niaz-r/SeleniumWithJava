package com.mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrems extends BaseDriver {
	@Test
	public void iFrameTool() {
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		//int iframeNumber = driver.findElement(By.tagName("iframe"));
		
		List<WebElement> number = driver.findElements(By.tagName("iframe"));
		
		System.out.println(number.size());		
		WebElement iframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframe);
		
		
		
		
		String sim ;
	WebElement simplae	= driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
	System.out.println(simplae.getText());		
	
	driver.switchTo().defaultContent();
	

	
		
		
		
	}

}

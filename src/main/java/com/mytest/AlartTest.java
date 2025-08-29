package com.mytest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AlartTest extends BaseDriver {
	
	String url ="https://demoqa.com/alerts";
	
	@Test
	public void testingAltert() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		
	//	WebElement alart = driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
		
	//	alart.click();
		
		//	Thread.sleep(2000);
		//*[@id="confirmButton"]
		
		WebElement confirmAlert = driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		
		confirmAlert.click();
		
		Thread.sleep(2000);
		
		Alert confirmAlertPopUP = driver.switchTo().alert();
		
	//	confirmAlertPopUP.accept();
		confirmAlertPopUP.dismiss();
		
		WebElement clickResult = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]"));
		String clickMessage = clickResult.getText();
		System.out.println(clickMessage);
		
		
	}

}

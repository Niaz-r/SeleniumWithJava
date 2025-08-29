package com.mytest;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;


public class TabHandling extends BaseDriver {

	@Test
	public void tabs() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		String original = driver.getWindowHandle();
		
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(original);
		
	
		Thread.sleep(3000);
		
		
}
}

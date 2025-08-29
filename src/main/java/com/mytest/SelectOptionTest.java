package com.mytest;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectOptionTest extends BaseDriver {

	
	@Test
	public void selectOptionTest() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getPageSource());

		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement solutions = wait.until(
//		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-search-dropdown-card\"]/div[1]"))
//		);
		
		//WebElement options = driver.findElement(By.id("searchDropdownBox"));
	//	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
	

		
		Select select = new Select(dropdown);
		
		select.selectByValue("search-alias=baby-products-intl-ship");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Computers");
		Thread.sleep(10000);

		
		//*[@id="nav-search-dropdown-card"]/div[1]
				
		
		
	}
}

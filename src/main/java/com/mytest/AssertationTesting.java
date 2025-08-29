package com.mytest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertationTesting extends BaseDriver {

	
	@Test
	public void assertion() {
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String actual,testCase;
		actual = driver.getTitle();
		testCase ="Selenium";
		
		//hard assertion
		org.testng.Assert.assertEquals(actual, testCase);
		System.out.println("Pass Succesfully");
		
		//softassertion
	String	testCase1 = "selenium1";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, testCase1);
		
		soft.assertAll();
		
		
		
	}
	
}

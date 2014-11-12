package com.Test.Google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPage {
	WebDriver  driver;
	
	@Before
	public void testsetup(){
		driver=new FirefoxDriver();
	}
	
	@After
	public void testshutdown(){
		driver.quit();
	}
	
	@Test
	public void verifyTheMessage(){
		
		LoginTest gmail = new LoginTest(driver);
		gmail = gmail.navigateToGoogle();
		CreationPage onLoginPage = gmail.clickOnGmailLink();
		onLoginPage.fillTheForm();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("#errormsg_0_GmailAddress")).getText().contains("You can't leave this empty."));
	       	

	}

}

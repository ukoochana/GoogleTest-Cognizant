package com.Test.Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest extends AbstractPage{

	public LoginTest(WebDriver driver) {
		super(driver);
	}
    public CreationPage clickOnGmailLink(){
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[1]/div[2]/a")).click();
    	return new CreationPage(driver);
    }
}

package com.Test.Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPage {
protected  WebDriver driver;

public AbstractPage(WebDriver driver){
	this.driver = driver;
}

public WebDriver getDriver(){
	return driver;
}
public LoginTest navigateToGoogle(){
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.navigate().to("http://www.google.co.uk");
	driver.manage().window().maximize();
	return new LoginTest(driver);
}

}

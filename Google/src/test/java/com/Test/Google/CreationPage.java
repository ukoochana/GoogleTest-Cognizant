package com.Test.Google;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreationPage extends AbstractPage{
	
	public CreationPage(WebDriver driver){
		super(driver);
	}
    public String fillTheForm(){
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.findElement(By.id("link-signup")).click();
    	driver.findElement(By.id("FirstName")).sendKeys("uday");
    	driver.findElement(By.id("LastName")).sendKeys("kumar");
        driver.findElement(By.cssSelector("#Passwd")).sendKeys("cognizant123");
        driver.findElement(By.cssSelector("#PasswdAgain")).sendKeys("cognizant123");
        driver.findElement(By.cssSelector("#BirthDay")).sendKeys("20");
        driver.findElement(By.id("BirthYear")).sendKeys("1990");
      Actions act = new Actions(driver);
      act.moveToElement(driver.findElement(By.xpath(".//*[@id='Gender']/div/div[2]"))).build().perform();
      act.click().build().perform();
        driver.findElement(By.xpath(".//*[@id=':f']/div")).click();
        driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys("7874159756");
        driver.findElement(By.xpath(".//*[@id='SkipCaptcha']")).click();
        driver.findElement(By.xpath(".//*[@id='TermsOfService']")).click();
        driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
        return driver.findElement(By.cssSelector("#errormsg_0_GmailAddress")).getText();
    }
}

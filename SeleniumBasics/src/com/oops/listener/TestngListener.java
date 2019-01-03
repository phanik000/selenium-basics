package com.oops.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate;

@Listeners(com.oops.listener.TestngIListener.class)
public class TestngListener {
	WebDriver driver;
	public String expectedtitle = "Sack Alerts ©";
	
	
	@BeforeMethod
	public void launchSite() {
		driver = new FirefoxDriver();
		driver.get("https://www.sackalerts.world/");
		driver.manage().window().maximize();
	}

	@Test
	public void launch() throws Exception {
		driver.findElement(By.id("liSignIn")).click();
		driver.findElement(By.id("MainContent_Email")).sendKeys("manikanta.n@maktronglobal.com");
		Thread.sleep(500);
		driver.findElement(By.name("ctl00$MainContent$Password")).sendKeys("Maktron@123");
		Thread.sleep(500);
		driver.findElement(By.name("ctl00$MainContent$ctl04")).click();
		Thread.sleep(500);
	}
	@Test
	public void titleVerify() {
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	@AfterMethod
	public void tearDown() {		
		
		driver.close();
		
	}
}

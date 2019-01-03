package com.oops.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AbstractMain {
	
	WebDriver driver;
	WebListener wl;
	EventFiringWebDriver eventfiring;
	
	@BeforeTest
	public void setUp() {
		driver=new FirefoxDriver();
		driver.get("https://www.sackalerts.world/");
		eventfiring =new EventFiringWebDriver(driver);
		wl=new WebListener();
		eventfiring.register(wl);
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
@AfterTest
public void tearDown() {
	driver.close();
}
}

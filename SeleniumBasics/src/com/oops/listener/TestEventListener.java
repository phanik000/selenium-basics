package com.oops.listener;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TestEventListener extends TestBase {
	public String actualtitle;
	public String expectedtitle = "Sack Alerts ©";
	//TestEventListener ts=new TestEventListener();
	

	@Test
	public void eventListenerSignIn() throws Exception {
		driver.findElement(By.id("liSignIn")).click();
		driver.findElement(By.id("MainContent_Email")).sendKeys("manikanta.n@maktronglobal.com");
		Thread.sleep(500);
		driver.findElement(By.name("ctl00$MainContent$Password")).sendKeys("Maktron@123");
		Thread.sleep(500);
		driver.findElement(By.name("ctl00$MainContent$ctl04")).click();
		Thread.sleep(500);
	}
	@Test
public void verifyTitle() throws Exception {
	actualtitle = driver.getTitle();
	System.out.println("the title is " + actualtitle);
	Assert.assertEquals(actualtitle, expectedtitle);
	Thread.sleep(900);

}
	public static void main(String args[]) {
		TestEventListener ts=new TestEventListener();
ts.setUp();
	}
}
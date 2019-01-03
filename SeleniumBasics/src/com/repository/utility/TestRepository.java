package com.repository.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRepository {
	WebDriver obj;
	RepositoryReuse re;
	@BeforeTest
	public void launchBrowser()  {
		try {
			re=new RepositoryReuse();

			System.setProperty("webdriver.gecko.driver",re.firefoxPath());
			obj=new FirefoxDriver(); 

			obj.get(re.urlPath());
			obj.manage().window().maximize();

		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		
	}
	@Test
	public void signIn() throws Exception {
		obj.findElement(By.id("liSignIn")).click();
		obj.findElement(By.id("MainContent_Email")).sendKeys("manikanta.n@maktronglobal.com");
		Thread.sleep(500);
		obj.findElement(By.name("ctl00$MainContent$Password")).sendKeys("Maktron@123");
		Thread.sleep(500);
		obj.findElement(By.name("ctl00$MainContent$ctl04")).click();
		Thread.sleep(500);
	}
@AfterTest
public void tearDown() {
	obj.close();
}
}

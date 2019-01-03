package com.testng;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sackalertsign {
	WebDriver obj;
	String actualtitle;
	String expectedtitle = "Sack Alerts ©";

	@Test(priority = 2, enabled = false)
	public void signIn() throws InterruptedException {
		obj.findElement(By.id("liSignIn")).click();
		obj.findElement(By.id("MainContent_Email")).sendKeys("manikanta.n@maktronglobal.com");
		Thread.sleep(500);
		obj.findElement(By.name("ctl00$MainContent$Password")).sendKeys("Maktron@123");
		Thread.sleep(500);
		obj.findElement(By.name("ctl00$MainContent$ctl04")).click();
		Thread.sleep(500);

	}

	@Test(priority = 1, enabled = false)
	public void title() throws InterruptedException {

		actualtitle = obj.getTitle();
		System.out.println("the title is " + actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle);
		Thread.sleep(900);
	}

	@Test(priority = 3, enabled = true)
	public void membership() throws InterruptedException {

		// List<WebElement> element =
		// obj.findElements(By.xpath("//*[@id=\"navigation\"]/li[5]/span"));
		/*
		 * for (int i = 0; i < element.size(); i++) { String temp =
		 * element.get(i).getText(); if (temp.equals("2")) { element.get(i).click();
		 * break; } }
		 */

		// Select s=new Select(obj.findElement(By.id("LiMembership")));
		// s.selectByIndex(1);
		obj.findElement(By.xpath("/html/body/form/header/div[2]/div/ul/li[5]/span")).click();
		Thread.sleep(500);
		// obj.findElement(By.xpath("//*[@id=\"navigation\"]/li[5]/ul/li[1]/a")).sendKeys("maerchandise");
		Thread.sleep(2000);
		obj.findElement(By.xpath("/html/body/form/header/div[2]/div/ul/li[5]/ul/li[2]/a")).click();
		Thread.sleep(1000);

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");
		obj = new FirefoxDriver();
		obj.get("https://www.sackalerts.world/");
		obj.manage().window().maximize();
		obj.manage().deleteAllCookies();
	}

	@AfterMethod
	public void afterMethod() {
		// obj.close();
	}

}

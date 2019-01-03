package com.java.oops;

import java.io.File;
import java.io.IOException;

import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Inheritence {

	public WebDriver obj;

	// WebElement element;

	@Test(priority = 2, enabled = false)

	public void signUp() throws InterruptedException {

		obj.findElement(By.linkText("SIGNUP")).click();

		Thread.sleep(1000);

		obj.findElement(By.id("MainContent_Name")).sendKeys("naveen");

		Thread.sleep(1000);

		obj.findElement(By.id("MainContent_Email")).sendKeys("naveen@swankinnovation.com");

		Thread.sleep(1000);

		obj.findElement(By.xpath("//*[@id=\"MainContent_IsAnAntonian\"]/tbody/tr[1]/td/label")).click();

		Select s = new Select(obj.findElement(By.xpath("//*[@id=\"MainContent_ddlGroupFromYear\"]")));

		s.selectByVisibleText("2015");

		Thread.sleep(1000);

		Select s1 = new Select(obj.findElement(By.id("MainContent_ddlGroupToYear")));

		s1.selectByVisibleText("2017");

		Thread.sleep(1000);

		obj.findElement(By.id("MainContent_Password")).sendKeys("Swank@123");

		Thread.sleep(1000);

		obj.findElement(By.id("MainContent_ConfirmPassword")).sendKeys("Swank@123");

		Thread.sleep(1000);

		obj.findElement(By.name("ctl00$MainContent$ctl12")).click();

		Thread.sleep(2000);

	}

	@Test(priority = 3, enabled = true)

	public void screenShot() throws IOException {

		File f = ((TakesScreenshot) obj).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("E:\\SCRNSHOT.JPEJ"));

	}

	@Test(priority = 3, enabled = true)

	public void multipleDrps() {

		Select s2 = new Select(obj.findElement(By.xpath("//*[@id=\"navigation\"]/li[5]/span")));

		List<WebElement> list = s2.getOptions();

		for (WebElement wb : list) {

			System.out.println(wb.getText());

		}

	}

	@BeforeMethod

	public void launch() throws InterruptedException {

		obj = new FirefoxDriver();

		obj.get("https://www.sackalerts.world/");

		obj.manage().window().maximize();

		Thread.sleep(1000);

	}

	@AfterMethod

	public void exit() throws InterruptedException {

		Thread.sleep(1000);

		obj.close();

	}

}

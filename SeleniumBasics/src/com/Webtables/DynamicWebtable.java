package com.Webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebtable {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/dailygroupa/groupm");

	}

	@Test
	public void webTable() {

		List<WebElement> wc = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("no of columns is " + wc.size());
		List<WebElement> wr = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int rows = wr.size();
		System.out.println("no of rows is " + wr.size());

		for (int i = 0; i < rows; i++) {
			String date = wr.get(i).getText();
			// if (date.equals("MSR India")) {
			// wr.get(i).click();
			System.out.println(date);
		}
	}

	// }

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}




















































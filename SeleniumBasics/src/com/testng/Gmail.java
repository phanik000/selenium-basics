package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.utility.ExcelReuse;
import com.screenshot.utility.ScreenshotReuse;

public class Gmail {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://mail.google.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "DataDriven")
	public void gmailId(String username, String password) throws Exception {

		driver.findElement(By.id("identifierId")).sendKeys(username);
		ScreenshotReuse.Capturescreen(driver, "gmailname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(1000);
		/*
		 * }
		 * 
		 * @Test(dataProvider="gmail") public void gmailPwd(String password ) throws
		 * Exception {
		 */
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("passwordNext")).click();
		/*
		 * }
		 * 
		 * @Test public void signOut() throws Exception {
		 */

		driver.findElement(
				By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[3]/div/div[2]/div/a/span"))
				.click();
		ScreenshotReuse.Capturescreen(driver, "signoutscrnshot");

		Thread.sleep(2000);
		driver.findElement(By.id("gb_71")).click();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1000);
		// Set<String> s = driver.getWindowHandles();

		driver.close();
	}

	@DataProvider(name = "DataDriven")
	public Object[][] TestData() throws Exception {
		ExcelReuse ex = new ExcelReuse("./Exceldata/DataDriven.xlsx");
		int rcount = ex.getRowCount(0);
		Object[][] data = new Object[rcount][2];
		for (int i = 0; i < rcount; i++) {
			data[i][0] = ex.getData(0, i, 0);
			data[i][1] = ex.getData(0, i, 1);
		}
		return data;

	}

}

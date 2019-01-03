package com.alert.popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Testing Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String mainwindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[text()='Recruiters']")).click();
		driver.findElement(By.xpath("//*[text()='Companies']")).click();
		Set<String> allWindows = driver.getWindowHandles();

		/*
		 * // String mainwindow = driver.getWindowHandle();
		 * System.out.println(driver.getTitle()); // To handle all new opened window.
		 * Set<String> handle = driver.getWindowHandles(); Iterator<String> itr =
		 * handle.iterator(); while (itr.hasNext()) { String childwindow = itr.next();
		 * if (!mainwindow.equals(childwindow)) { // switching to child window
		 * driver.switchTo().window(childwindow); System.out.println(driver.getTitle());
		 * //
		 * driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"))
		 * .sendKeys("phanik000@gmail.com"); //
		 * driver.findElement(By.name("btnLogin")).click(); // close the child window
		 * driver.close(); } } // switch to parent window //
		 * driver.switchTo().window(mainwindow); // driver.close();
		 */

		for (String windowhandle : allWindows) {
			if (!mainwindow.equals(windowhandle)) {
				driver.switchTo().window(windowhandle);
				if (driver.getTitle().equals("HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com")) {
					driver.findElement(By.xpath("//*[@rel='custom:1016'")).sendKeys("phnai");
					System.out.println("window child title is " + driver.getTitle());

				}
			}
		}
	}
}

package com.selenium.navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {
 
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Testing Softwares\\geckodriver.exe");
		driver.get("http://www.google.co.in");
		// NAVIGATIONS
		Thread.sleep(1000);
		driver.navigate().to("https://www.sackalerts.world/");
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		// TO GET WEBELEMENT ATTRIBUTE and TEXT
		driver.navigate().to("https://www.guru99.com/first-webdriver-script.html");
		Thread.sleep(1000);
		//String s = driver.findElement(By.xpath("//*[@id=\"search\"]/div/input")).getAttribute("maxlength");
		
		//System.out.println("The attribute is: " + s);
		
	String  element=driver.findElement(By.id("search")).getText();
	System.out.println("The element text is: "+ element);
	
	
		}

}

	
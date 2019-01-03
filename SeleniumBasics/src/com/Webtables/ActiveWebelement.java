package com.Webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiveWebelement {
	
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\Testing Softwares\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://mail.google.com");
	List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	System.out.println(allElements.size());
	for(int i=0;i<allElements.size();i++)
	{
	WebElement e=allElements.get(i);
	if(e.isEnabled())
	{
	System.out.println(e.getTagName());
	}
	}
	System.out.println(allElements.size());


}
}


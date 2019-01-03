package com.oops.listener;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	public WebDriver driver;
	
	public EventFiringWebDriver firingdriver;

	public WebEventListener eventlistener;

	@BeforeMethod

	public void setUp() {

		driver = new FirefoxDriver();
		
		driver.get("https://www.sackalerts.world/");

		//driver.get("https://www.sackalerts.world/");

		driver.manage().window().maximize();

		firingdriver = new EventFiringWebDriver(driver);

		eventlistener = new WebEventListener();

		firingdriver.register(eventlistener);
	}
}

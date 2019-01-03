package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OneMail {
WebDriver driver;
String ExpectedTitle="webmail";
String ActualTtle;
@BeforeTest
public void launchSite() {
	driver=new FirefoxDriver();
	driver.get("https://login.one.com/mail");
	driver.manage().window().maximize();
	
}
@Test(priority=2,enabled=true)
public void verifyTitle() throws Exception {
	ActualTtle=driver.getTitle();
	Thread.sleep(2000);
	Assert.assertEquals(ActualTtle, ExpectedTitle);
}
@Test(priority=1,enabled =  true)
public void webMail() throws Exception {
	driver.findElement(By.name("displayUsername")).sendKeys("phani@swankinnovation.com");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("swank@123");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.findElement(By.className("oneButton")).click();
	Thread.sleep(2000);

}
@Test(priority=3,enabled=true)
public void writeMail() throws Exception {
	driver.findElement(By.className("compose-button-label")).click();
	Thread.sleep(2000);

	driver.findElement(By.className("main-input")).sendKeys("phanik000@gmail.com");
	Thread.sleep(2000);

	driver.findElement(By.id("subject")).sendKeys("mail");
	}
@AfterMethod(enabled= false)
public void tearaDown() {
	driver.close();
}
}
	/*public static void main(String aregs[]) throws Exception {
	Email email = new SimpleEmail();
	email.setHostName(" send.one.com");
	email.setSmtpPort(587);
	email.setAuthenticator(new DefaultAuthenticator("phani@swankinnovation.com", "swank@123"));
	//email.setAuthenticator(new DefaultAuthenticator("phani@swankinnovation.com", "swank@123"));
	email.setSSLOnConnect(true);
	email.setFrom("user@gmail.com");
	email.setSubject("TestMail");
	email.setMsg("This is a test mail ... :-)");
	email.addTo("foo@bar.com");
	email.send();
	
	
}}*/


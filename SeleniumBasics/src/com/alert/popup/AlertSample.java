package com.alert.popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Testing Softwares\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://demo.guru99.com/test/delete_customer.php");
driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("53920");
driver.findElement(By.name("submit")).click();
//switch to alert
//try {
Alert a=driver.switchTo().alert();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

String s=driver.switchTo().alert().getText();
System.out.println("alert messssage :"+s);
a.accept();

//}catch(Exception e) 
	}

	}
	//}

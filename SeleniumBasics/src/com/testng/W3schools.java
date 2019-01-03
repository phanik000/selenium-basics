package com.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class W3schools {
	WebDriver obj;
	Select s;
	WebElement e;
	Actions a;
  @Test
  public void frame() throws InterruptedException {
	  obj.switchTo().frame("iframeResult");                      
	   e=obj.findElement(By.name("cars"));
		 s=new Select(e);
		 a=new Actions(obj);
		a.keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(500);
		a.click(s.getOptions().get(0)).build().perform();
		Thread.sleep(500);
		a.click(s.getOptions().get(1)).build().perform();
		Thread.sleep(5000);
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(500);
		s.deselectByIndex(0);
		Thread.sleep(900);
		obj.findElement(By.xpath("/html/body/form/input")).click();
		Thread.sleep(900);
		//System.out.println("the output is +");	
  }
		/*@Test
		 public void screenShot() throws IOException {
		File f = ((TakesScreenshot) obj).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\scrnshot.JPEJ"));
				  }*/
  
  @BeforeMethod
  public void beforeMethod() {
	  obj=new FirefoxDriver();
	  obj.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
  obj.manage().window().maximize();
  obj.manage().deleteAllCookies();

  }

  @AfterMethod
  public void afterMethod() {
	 // obj.close();
  }

}

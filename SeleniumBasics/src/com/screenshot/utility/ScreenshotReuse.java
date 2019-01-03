package com.screenshot.utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotReuse {

	public static void Capturescreen(WebDriver driver, String scrnshot) throws Exception {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("./Screenshots/" + scrnshot + ".png"));

		System.out.println("takes screenshot");

	}

}


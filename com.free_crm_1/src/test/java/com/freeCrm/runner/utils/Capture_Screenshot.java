package com.freeCrm.runner.utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capture_Screenshot {
	public static void captureScreenShot(WebDriver driver){
		// Take screenshot and store it as a file format             
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		try {
			// now copy the  screenshot to desired location using copyFile method
			FileUtils.copyFile(src, new File("C:\\screenshot\\freecrm"+timestamp()+"  " + "freecrm.png")); 
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage()) ;
		} 
	}
	public static String timestamp() {

		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}		    
}	


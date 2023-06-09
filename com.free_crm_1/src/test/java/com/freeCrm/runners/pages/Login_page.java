package com.freeCrm.runners.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.freeCrm.runner.utils.Capture_Screenshot;
import com.freeCrm.runner.utils.SetupDriver;

public class Login_page {
 static WebDriver driver;
 //static WebDriver driver=SetupDriver.edgeDriver();
  public static final By LOGIN=By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]");
  public static final By EMAIl=By.name("email");
  public static final By PASSWORD=By.name("password");
  public static final By LOGIN_BUTTON =By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
public static final By ALERTMESSAGE=By.className("header");

public void launchApplication() throws Exception {
	driver=SetupDriver.chromeDriver();
    	driver.get("https://freecrm.in/");
    	Thread.sleep(3000);
    	driver.findElement(LOGIN).click();
    	Thread.sleep(1000);
    }

public void LoginButton() throws Exception {
	try {
	driver.findElement(LOGIN_BUTTON).click();
	Thread.sleep(5000);
	throw new Exception();
	
	}
	catch(Exception e)
	{
		
		Capture_Screenshot.captureScreenShot(driver);
	}
	Thread.sleep(3000);
}
public void enter_email(String email) throws Exception {
	Thread.sleep(3000);
	driver.findElement(EMAIl).sendKeys(email);
}
public void enter_password(String password) throws Exception {
	Thread.sleep(3000);
	driver.findElement(PASSWORD).sendKeys(password);
}
public String title() throws Exception{
	Thread.sleep(2000);
	return driver.getTitle();
}
public String alert_message() throws Exception {
	Thread.sleep(2000);
	return driver.findElement(ALERTMESSAGE).getText();
}
public void quit() {
	
	driver.quit();
}
  
}

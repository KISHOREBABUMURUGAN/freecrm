package com.freeCrm.runner.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class SetupDriver {

    public static WebDriver driver;

    public static WebDriver chromeDriver() {
    	 System.out.println("Launching Chrome Browser");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\com.free_crm_1\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
       
        return driver;
    }

    public static WebDriver edgeDriver() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\com.free_crm_1\\src\\test\\resources\\drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Launching Edge Browser");
        return driver;
    }

    public static void teardown() throws Exception {
    	System.out.println("i m in teardown");
    	Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}


package com.freeCrm.steps.definitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import com.freeCrm.runners.pages.Login_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Login_Steps {
	
	
	WebDriver driver;
	FileInputStream Fread;
	FileOutputStream Fwrite;
	XSSFWorkbook wb;
	XSSFSheet sh;
	String email, password;

	public  Login_page login =new Login_page();
	
	
	
	@Given("User is on Free crm login page")
	public void user_is_on_Free_crm_login_page() throws Exception {
		Thread.sleep(3000);
		System.out.println("=========Launching Application========");
	    login.launchApplication();
	}

	@Then("check the title of the page")
	public void check_the_title_of_the_page() throws Exception {
	    String title=login.title();
	    System.out.println("The title is : "+title);
	    login.quit();
	}

	@And("User takes input from excel file")
	public void user_takes_input_from_excel_file() throws Exception {
		Fread=new FileInputStream("C:\\Users\\KIMURUGA\\Documents\\FreeCrm.xlsx");
	  	  wb=new XSSFWorkbook(Fread);
	  	  sh=wb.getSheetAt(0);
	}

	@When("User enter email and Password")
	public void user_enter_email_and_Password() throws Exception {
		System.out.println("Entering email and password");
		email=sh.getRow(1).getCell(0).getStringCellValue();
		password=sh.getRow(1).getCell(1).getStringCellValue();
		login.enter_email(email);	
		Thread.sleep(1000);
		login.enter_password(password);
		
	}

	@When("clicks the login button")
	public void clicks_the_login_button() throws Exception {
		System.out.println("clicking the login button");
		Thread.sleep(3000);
	    login.LoginButton();
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
		 System.out.println("The login  was successful");
		 login.quit();
	}

	@When("user leaves email blank")
	public void user_leaves_email_blank() throws Exception {
		System.out.println("Email is null");
password=sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);
		Thread.sleep(1000);
		login.enter_password(password);	
	}

	@Then("display alert msg")
	public void display_alert_msg() throws Exception {
	   String message=login.alert_message();
	   System.out.println("The alert message is : "+message);
	   login.quit();
	}

	@When("user leaves password field blank")
	public void user_leaves_password_field_blank() throws Exception {
		System.out.println("User leaves the password blanks");
		email=sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(email);
		Thread.sleep(2000);
		login.enter_email(email);
	}

	@When("user enters an incorrect password")
	public void user_enters_an_incorrect_password() throws Exception {
		System.out.println("Enter the email and incorrect password");
        email=sh.getRow(2).getCell(0).getStringCellValue();
		password=sh.getRow(2).getCell(1).getStringCellValue();
		login.enter_email(email);	
		Thread.sleep(1000);
		login.enter_password(password);	
		
	}
	





}

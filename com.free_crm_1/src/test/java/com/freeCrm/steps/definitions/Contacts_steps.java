package com.freeCrm.steps.definitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.freeCrm.runners.pages.Contacts_page;
public class Contacts_steps {
	
	
	
	WebDriver driver;
	FileInputStream Fread;
	FileOutputStream Fwrite;
	XSSFWorkbook wb;
	XSSFSheet sh;
	String email, password,firstname,lastname,middlename,Category,company,emailoff,personalemail,tags,status,date,description,socialmedia,socialmedialink;
    String streetaddress,city,state,postalcode,country,countryphone,phonenumber,homenumber,position,department,supervisor,assistant,refer,source,donotcall;
    String month,year,identifier,image;
	public  Contacts_page contact =new Contacts_page();
	
    @Given("user is on create new contact page")
	public void user_is_on_create_new_contact_page() throws Exception {
		contact.contactpage();
		Thread.sleep(1000);
	   
	   System.out.println("User is on creating new contact page");
	}

	@Given("User takes input from excel file for firstname and lastname")
	public void user_takes_input_from_excel_file_for_firstname_and_lastname() throws Exception {
		System.out.println("User read input from excel file");
		Fread=new FileInputStream("C:\\Users\\KIMURUGA\\Documents\\FreeCrm.xlsx");
	  	  wb=new XSSFWorkbook(Fread);
	  	  sh=wb.getSheetAt(1);
	  	
		

	}

	@When("I enter the mandatory field firstname and lastname")
	public void i_enter_the_mandatory_field_firstname_and_lastname() throws Exception {
		System.out.println("Enter the all the  field");
		firstname=sh.getRow(1).getCell(0).getStringCellValue();
		lastname=sh.getRow(1).getCell(1).getStringCellValue();
		Thread.sleep(1000);
		contact.fill_firstname(firstname);	
		contact.fill_lastname(lastname);
		
	}

	@When("click the save button")
	public void click_the_save_button() throws Exception {
		System.out.println("clicking the save button");
		Thread.sleep(1000);
	    contact.save_button();
	   
	
	}

	@Then("display the saved page")
	public void display_the_saved_page() throws Exception {
		Thread.sleep(2000);
		System.out.println("The title will displayed here");
	  String title=contact.display_page();
	  System.out.println("The titles are : "+title);
	  Thread.sleep(1000);
	  contact.quit();
	 
	 
	}

	@Given("User takes input from excel file for lastname")
	public void user_takes_input_from_excel_file_for_lastname() throws Exception {
		System.out.println("User read input from excel file for lastname");
		Fread=new FileInputStream("C:\\Users\\KIMURUGA\\Documents\\FreeCrm.xlsx");
	  	  wb=new XSSFWorkbook(Fread);
	  	  sh=wb.getSheetAt(1);
	  
	  	
	}

	@When("Failed to enter the mandatory field firstname")
	public void failed_to_enter_the_mandatory_field_firstname() throws Exception {
		System.out.println("failed to enter the first name");
		lastname=sh.getRow(1).getCell(1).getStringCellValue();
		contact.fill_lastname(lastname);
	}

	@Then("display the alert message the firstname is required")
	public void display_the_alert_message_the_firstname_is_required() throws Exception {
		System.out.println("The alert message will displayed here");
		 String alert_firstname=contact.firstname_alert();
		  System.out.println("The titles are : "+alert_firstname);
		  Thread.sleep(1000);
		  contact.quit();
		  
		
	}

	@Given("User takes input from excel file for firstname")
	public void user_takes_input_from_excel_file_for_firstname() throws Exception {
		System.out.println("User read input from excel file for firstname");
		Fread=new FileInputStream("C:\\Users\\KIMURUGA\\Documents\\FreeCrm.xlsx");
	  	  wb=new XSSFWorkbook(Fread);
	  	  sh=wb.getSheetAt(1);
	  	
	}

	@When("Failed to enter the mandatory field lastname")
	public void failed_to_enter_the_mandatory_field_lastname() throws Exception {
		System.out.println("failed to enter the lastname");
		Thread.sleep(1000);
		firstname=sh.getRow(1).getCell(0).getStringCellValue();
		contact.fill_firstname(firstname);	
	}

	@Then("display the alert message the lastname is required")
	public void display_the_alert_message_the_lastname_is_required() throws Exception {
		System.out.println("The alert message will displayed here");
		String alert_lastname=contact.lastname_alert();
		  System.out.println("The titles are : "+alert_lastname);
		  Thread.sleep(1000);
		  contact.quit();
		
	}

	@When("Failed to enter the mandatory field firstname and lastname")
	public void failed_to_enter_the_mandatory_field_firstname_and_lastname() throws Exception {
		System.out.println("failed to enter the firstname and lastname");
		Thread.sleep(1000);
	    contact.save_button();
	}

	@Then("display the alert message the firstname and lastname is required")
	public void display_the_alert_message_the_firstname_and_lastname_is_required() throws Exception {
		System.out.println("Displaying the alert messages");
		 String alert_firstname=contact.firstname_alert();
		  System.out.println("The titles are : "+alert_firstname);
		  Thread.sleep(2000);
	 String alert_lastname=contact.lastname_alert();
		   System.out.println("The titles are : "+alert_lastname);
		  Thread.sleep(2000);
		  contact.quit();
		}
	
	@Given("User takes input from excel file for all fields")
	public void user_takes_input_from_excel_file_for_all_fields() throws Exception {
	  	System.out.println("User read input from excel file for all fields");
		Fread=new FileInputStream("C:\\Users\\KIMURUGA\\Documents\\FreeCrm.xlsx");
	  	  wb=new XSSFWorkbook(Fread);
	  	  sh=wb.getSheetAt(1);
	
	}

	@When("user enter all the fields")
	public void user_enter_all_the_fields() throws Exception {
		System.out.println("user entering all the fields");
		firstname=sh.getRow(1).getCell(0).getStringCellValue();
		lastname=sh.getRow(1).getCell(1).getStringCellValue();
		middlename=sh.getRow(1).getCell(2).getStringCellValue();
		company=sh.getRow(1).getCell(3).getStringCellValue();
		emailoff=sh.getRow(1).getCell(4).getStringCellValue();
		personalemail=sh.getRow(1).getCell(7).getStringCellValue();
		date= sh.getRow(1).getCell(20).getStringCellValue();
		Category=sh.getRow(1).getCell(5).getStringCellValue();
		tags=sh.getRow(1).getCell(23).getStringCellValue();
		status=sh.getRow(1).getCell(6).getStringCellValue();
		description=sh.getRow(1).getCell(8).getStringCellValue();
		socialmedia=sh.getRow(1).getCell(9).getStringCellValue();
		socialmedialink=sh.getRow(1).getCell(24).getStringCellValue();
		streetaddress=sh.getRow(1).getCell(12).getStringCellValue();
		city=sh.getRow(2).getCell(12).getStringCellValue();
		state=sh.getRow(3).getCell(12).getStringCellValue();
		postalcode=sh.getRow(4).getCell(12).getStringCellValue();
		country=sh.getRow(5).getCell(12).getStringCellValue();
		countryphone=sh.getRow(3).getCell(13).getStringCellValue();
		phonenumber=sh.getRow(1).getCell(13).getStringCellValue();
		homenumber=sh.getRow(2).getCell(13).getStringCellValue();
		position=sh.getRow(1).getCell(14).getStringCellValue();
		department=sh.getRow(1).getCell(15).getStringCellValue();
		supervisor=sh.getRow(1).getCell(16).getStringCellValue();
		assistant=sh.getRow(1).getCell(17).getStringCellValue();
		refer=sh.getRow(1).getCell(18).getStringCellValue();
		source=sh.getRow(1).getCell(19).getStringCellValue();
		month=sh.getRow(1).getCell(21).getStringCellValue();
		year=sh.getRow(2).getCell(20).getStringCellValue();
		identifier=sh.getRow(1).getCell(22).getStringCellValue();
		image=sh.getRow(1).getCell(25).getStringCellValue();
		Thread.sleep(2000);
		
		contact.fill_firstname(firstname);	
		contact.fill_lastname(lastname);
		contact.fill_middlename(middlename);
		contact.fill_emailoff(emailoff);
		contact.fill_businessmail(personalemail);
		contact.fill_category(Category);
		contact.fill_status(status);
		contact.fill_description(description);
		contact.fill_socialmedia(socialmedia);
		contact.fill_socialmedialink(socialmedialink);
		contact.fill_streetaddress(streetaddress);
		contact.fill_city(city);
		contact.fill_state(state);
		contact.fill_postalcode(postalcode);
		contact.fill_country(country);
		contact.fill_countryphone(countryphone);
		contact.fill_phonenumber(phonenumber);
		contact.fill_homenumber(homenumber);
		contact.fill_position(position);
		contact.fill_department(department);
		contact.fill_source(source);
		contact.fill_donotcall();
		contact.fill_date(date);
		contact.fill_month(month);
		contact.fill_year(year);
		contact.fill_identifer(identifier);
		contact.fill_company(company);
		contact.fill_tag(tags);
        contact.fill_supervisor(supervisor);
		contact.fill_assistant(assistant);
		contact.fill_refer(refer);
		contact.fill_image(image); 
	}

	@Given("User takes input from excel file for some fields")
	public void user_takes_input_from_excel_file_for_some_fields() throws Exception {
		System.out.println("User read input from excel file for some fields");
		Fread=new FileInputStream("C:\\Users\\KIMURUGA\\Documents\\FreeCrm.xlsx");
	  	  wb=new XSSFWorkbook(Fread);
	  	  sh=wb.getSheetAt(1);
	  	
		
	}
	@When("user enter some of the fields")
	public void user_enter_some_of_the_fields() throws Exception {
		System.out.println("user entering some fields");
		firstname=sh.getRow(1).getCell(0).getStringCellValue();
		lastname=sh.getRow(1).getCell(1).getStringCellValue();
		emailoff=sh.getRow(1).getCell(4).getStringCellValue();
		personalemail=sh.getRow(1).getCell(7).getStringCellValue();
		socialmedia=sh.getRow(1).getCell(9).getStringCellValue();
		socialmedialink=sh.getRow(1).getCell(24).getStringCellValue();
		month=sh.getRow(1).getCell(21).getStringCellValue();
		year=sh.getRow(2).getCell(20).getStringCellValue();
		identifier=sh.getRow(1).getCell(22).getStringCellValue();
		Thread.sleep(1000);
		contact.fill_firstname(firstname);	
		contact.fill_lastname(lastname);
		contact.fill_emailoff(emailoff);
		contact.fill_businessmail(personalemail);
		contact.fill_socialmedia(socialmedia);
		contact.fill_socialmedialink(socialmedialink);
		contact.fill_month(month);
		contact.fill_year(year);
		contact.fill_identifer(identifier);
	}

	







}

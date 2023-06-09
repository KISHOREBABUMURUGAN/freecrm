package com.freeCrm.runners.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.freeCrm.runner.utils.Capture_Screenshot;
import com.freeCrm.runner.utils.SetupDriver;

public class Contacts_page {
	WebDriver driver=Login_page.driver;
	public Actions act=new Actions(driver);
	  public static final By LOGIN=By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]");
	  public static final By EMAIl=By.name("email");
	  public static final By PASSWORD=By.name("password");
	  public static final By LOGIN_BUTTON =By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
	  public static final By SAVE_BUTTON =By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]/i");
	  public static final By CONTACTPAGE=By.linkText("Contacts");
	  public static final By CREATE_CONTACTPAGE=By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button/i");
	  public static final By FIRSTNAME=By.name("first_name");
	  public static final By LASTNAME=By.name("last_name");
	  public static final By DISPLAY_MESSAGE=By.id("top-header-menu");
	  public static final By FIRSTNAME_ALERT=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/label/span");
	  public static final By LASTNAME_ALERT=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[2]/div/label/span");
	  public static final By SETTINGS_ICON=By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div");
	  public static final By LOG_OUT=By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[7]/span");
	  public static final By MIDDLENAME=By.name("middle_name");
	  public static final By COMPANY=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input");
	  public static final By EMAILOFF=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/div/input");
	  public static final By EMAIL_BUSINESS=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div/div/div[2]/div/input");
	  public static final By BIRTHDAY_DATE=By.name("day");
	  public static final By CATEGORY_DROPDOWN=By.name("category");
	  public static final By CATEGORY=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/div/div[2]/div[3]");
	  public static final By TAGS=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/label[2]/div");
	  public static final By STATUS_DROPDOWN=By.name("status");
	  public static final By STATUS=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div[2]/div[3]");
	  public static final By DESCRIPTION=By.name("description");
	  public static final By SOCIALMEDIA_DROPDOWN=By.name("channel_type");
	  public static final By SOCIALMEDIA=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/div/div/div[1]/div/div[2]/div[3]");
	  public static final By SOCIALMEDIALINK=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/div/div/div[2]/div/input");
	  public static final By STREETADRESS=By.name("address");
	  public static final By CITY=By.name("city");
	  public static final By STATE=By.name("state");
	  public static final By POSTALCODE=By.name("zip");
	  public static final By COUNTRY_DROPDOWN=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div/div[5]/div/i");
	  public static final By COUNTRY=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div/div[5]/div/div[2]/div[100]/span");
	  public static final By COUNTRYPHONE_DROPDOWN=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/div/div[1]/div/div[1]");
	  public static final By COUNTRYPHONE=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/div/div[1]/div/div[2]/div[98]/span");
	  public static final By PHONENUMBER=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/div/div[2]/div/input");
	  public static final By HOMENUMBER=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/div/div[3]/div/input");
	  public static final By POSITION=By.name("position");
	  public static final By DEPARTMENT=By.name("department");
	  public static final By SUPERVISOR=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[1]/div/div/input");
	  public static final By ASSISTANT=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[2]/div/div/input");
	  public static final By REFER=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[10]/div[1]/div/div/input");
	  public static final By SOURCE_DROPDOWN=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[10]/div[2]/div/div");
	  public static final By SOURCE=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[10]/div[2]/div/div/div[2]/div[3]");
	  public static final By DONOTCALL=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[11]/div[1]/div/div/label");
	  public static final By MONTH_DROPDOWN=By.name("month");
	  public static final By MONTH=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[12]/div[2]/div/div/div[2]/div[2]/div[5]");
	  public static final By BIRTHDAY_YEAR=By.name("year");
	  public static final By IDENTIFIER=By.name("identifier");
	  public static final By SCREENSHOT_IMAGE=By.name("image");

	 
	  
	 public void launchapp() throws Exception {
		 driver.get("https://freecrm.in/");
	    	Thread.sleep(3000);
	    	driver.findElement(LOGIN).click();
	    	Thread.sleep(2000);
	 }
	 public void LoginButton() throws Exception {
			
			driver.findElement(LOGIN_BUTTON).click();
			Thread.sleep(3000);
			
				
			}
	 public void fill_email(String email) {
			driver.findElement(EMAIl).sendKeys(email);
		}
		public void fill_password(String password) throws Exception {
			driver.findElement(PASSWORD).sendKeys(password);
			Thread.sleep(3000);
		}
		public void contactpage() throws Exception {
			driver.findElement(CONTACTPAGE).click();
			Thread.sleep(4000);
			driver.findElement(CREATE_CONTACTPAGE).click();
			Thread.sleep(4000);
		}
		public void fill_firstname(String firstname) throws Exception {
			System.out.println("filling the firstname");

			Thread.sleep(3000);
			driver.findElement(FIRSTNAME).sendKeys(firstname);
		}
		public void fill_lastname(String lastname) throws Exception {
			System.out.println("filling the lastname");

			Thread.sleep(3000);
			driver.findElement(LASTNAME).sendKeys(lastname);
		}
		public void fill_middlename(String middlename) throws Exception {
			System.out.println("filling the middlename");

			Thread.sleep(3000);
			driver.findElement(MIDDLENAME).sendKeys(middlename);
		}
		public void fill_company(String company) throws Exception {
			System.out.println("filling the company tag");

			Thread.sleep(2000);
		WebElement comp=driver.findElement(COMPANY);
		act.moveToElement(comp).click().sendKeys(comp,company).sendKeys(Keys.ENTER).build().perform();;
		//Thread.sleep(1000);
		
		
		}
		public void fill_tag(String tags) throws Exception {
			System.out.println("filling the tags function");

			Thread.sleep(1000);
			WebElement taggy=	driver.findElement(TAGS);
			act.moveToElement(taggy).click().sendKeys(taggy,tags).sendKeys(Keys.ENTER).build().perform();
			
			}		
		public void fill_emailoff(String emailoff) {
			System.out.println("filling the officialemail");

			driver.findElement(EMAILOFF).sendKeys(emailoff);
		}
		public void fill_businessmail(String personalemail ) {
			System.out.println("filling the businessemail");
			driver.findElement(EMAIL_BUSINESS).sendKeys(personalemail);
		}
		
		public void fill_date(String date ) {
			System.out.println("filling the date");
			driver.findElement(BIRTHDAY_DATE).sendKeys(date);
		}
		
		public void fill_category(String Category) {
			System.out.println("filling the category");

			driver.findElement(CATEGORY_DROPDOWN).click();
			if(Category.equals("Customer")) {
				driver.findElement(CATEGORY).click();
				 }
			
		}
		public void fill_status(String status) {
			System.out.println("filling the status");
			driver.findElement(STATUS_DROPDOWN).click();
			if(status.equals("Active")) {
				driver.findElement(STATUS).click();
			}
			
		}
		public void fill_description(String description) {
			System.out.println("filling the description");

		driver.findElement(DESCRIPTION).sendKeys(description);
			
		}
		public void fill_socialmedia(String socialmedia) {
			System.out.println("filling the socialmedia");

			driver.findElement(SOCIALMEDIA_DROPDOWN).click();
			if(socialmedia.equals("LinkedIn")) {
				driver.findElement(SOCIALMEDIA).click();
			}
			
		}
		public void fill_socialmedialink(String socialmedialink) {
			System.out.println("filling the socialmedialink");

			driver.findElement(SOCIALMEDIALINK).sendKeys(socialmedialink);
			
		}
		public void fill_streetaddress(String streetaddress) {
			System.out.println("filling the streetaddress");

			driver.findElement(STREETADRESS).sendKeys(streetaddress);
			
		}
		public void fill_city(String city) {
			System.out.println("filling the city");

			driver.findElement(CITY).sendKeys(city);
			
		}
		public void fill_state(String country) {
			System.out.println("filling the country");
			driver.findElement(STATE).sendKeys(country);
			
		}
		public void fill_postalcode(String postalcode) {
			System.out.println("filling the postalcode");

		driver.findElement(POSTALCODE).sendKeys(postalcode);
			
		}
		
		public void fill_country(String country) {
			System.out.println("filling the countrynumber");

			driver.findElement(COUNTRY_DROPDOWN).click();
			if(country.equals("India")) {
				driver.findElement(COUNTRY).click();
			}
			
		}
		public void fill_countryphone(String countryphone) {
			System.out.println("filling the countryphonenumber");

			driver.findElement(COUNTRYPHONE_DROPDOWN).click();
			if(countryphone.equals("India")) {
				driver.findElement(COUNTRYPHONE).click();
			}
			
		}
		public void fill_phonenumber(String phonenumber) {
			System.out.println("filling the phonenumber");
			driver.findElement(PHONENUMBER).sendKeys(phonenumber);
			
		}
		public void fill_homenumber(String homenumber) {
			System.out.println("filling the homenumber");

            driver.findElement(HOMENUMBER).sendKeys(homenumber);			
		}
		
		public void fill_position(String position) {
			System.out.println("filling the position");

			driver.findElement(POSITION).sendKeys(position);
			
		}
		public void fill_department(String department) {
			System.out.println("filling the department");

			driver.findElement(DEPARTMENT).sendKeys(department);
			
		}
		
		public void fill_supervisor(String supervisor) throws Exception {
			System.out.println("filling the supervisor");

			Thread.sleep(1000);
			WebElement supervi=	driver.findElement(SUPERVISOR);
			act.moveToElement(supervi).click().sendKeys(supervi,supervisor).sendKeys(Keys.ENTER).build().perform();
			
			
		}
		public void fill_assistant(String assistant) throws Exception {
			System.out.println("filling the assistant");

			Thread.sleep(2000);
			WebElement assist=	driver.findElement(ASSISTANT);
			act.moveToElement(assist).click().sendKeys(assist,assistant).sendKeys(Keys.ENTER).build().perform();

			
		}
		public void fill_refer(String refer) {
			System.out.println("filling the refer tag");

			WebElement ref=	driver.findElement(REFER);
			act.moveToElement(ref).click().sendKeys(ref,refer).sendKeys(Keys.ENTER).build().perform();

			
		}
		public void fill_source(String source) {
			System.out.println("filling the source tag");
			driver.findElement(SOURCE_DROPDOWN).click();
			if(source.equals("Google")) {
				driver.findElement(SOURCE).click();;
			}
			
		}
		
		public void fill_donotcall() {
			System.out.println("clicking the donotcall button");
			driver.findElement(DONOTCALL).click();
			
		}
		public void fill_month(String month) {
			System.out.println("filling the month");

			driver.findElement(MONTH_DROPDOWN).click();
			if(month.equals("April")) {
				driver.findElement(MONTH).click();
			}
		}
		
		public void fill_year(String year) {
			System.out.println("filling the year");
			driver.findElement(BIRTHDAY_YEAR).sendKeys(year);
			
		}
		
		public void fill_identifer(String identifier) {
			System.out.println("filling the identifier");

			driver.findElement(IDENTIFIER).sendKeys(identifier);
			
		}
		public void fill_image(String image) {
			System.out.println("Enter the image succesfull");
			driver.findElement(SCREENSHOT_IMAGE).sendKeys(image);
			
		}
		public String  firstname_alert() throws Exception {
			System.out.println("printing the alert message for first name");
			Thread.sleep(3000);
			return driver.findElement(FIRSTNAME_ALERT).getText();
			
		}
		
		public String  lastname_alert() throws Exception {
			System.out.println("printing the alert message for lastname");
			Thread.sleep(3000);
			return driver.findElement(LASTNAME_ALERT).getText();
		}
		public void save_button() throws Exception {
			
			try {
			driver.findElement(SAVE_BUTTON).click();
			Thread.sleep(5000);
			throw new Exception();
			}catch(Exception e) {
				System.out.println("pick up screenshots for saved pages");
				Capture_Screenshot.captureScreenShot(driver);
			}
		}
		
		public String display_page()  {
			
		return	driver.findElement(DISPLAY_MESSAGE).getText();
		}
		
		public void quit() throws Exception {
			
			//System.out.println("logging out");
			//driver.findElement(SETTINGS_ICON).click();
			//Thread.sleep(2000);
			//driver.findElement(LOG_OUT).click();
			driver.quit();
			//driver.close();
			
		}
	
		
		
		
	
		
		
	
	
		
	}


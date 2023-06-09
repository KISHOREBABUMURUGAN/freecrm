$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/KIMURUGA/eclipse-workspace/com.free_crm_1/src/test/resources/CRM_features/contactcrm.feature");
formatter.feature({
  "name": "Validate contact page functionality of free crm application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@contactpage"
    }
  ]
});
formatter.background({
  "name": "user logged in with valid credentials",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Free crm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_is_on_Free_crm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_takes_input_from_excel_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter_email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "succefully creating the contact by entering all the mandatory fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contactpage"
    },
    {
      "name": "@succesfully_creatingcontact_validation"
    }
  ]
});
formatter.step({
  "name": "user is on create new contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "Contacts_steps.user_is_on_create_new_contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file for firstname and lastname",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.user_takes_input_from_excel_file_for_firstname_and_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the mandatory field firstname and lastname",
  "keyword": "When "
});
formatter.match({
  "location": "Contacts_steps.i_enter_the_mandatory_field_firstname_and_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.click_the_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "display the saved page",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts_steps.display_the_saved_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "user logged in with valid credentials",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Free crm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_is_on_Free_crm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_takes_input_from_excel_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter_email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Failure in creating the new contact by leaving the firstname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contactpage"
    },
    {
      "name": "@Invalid_firstname_validation"
    }
  ]
});
formatter.step({
  "name": "user is on create new contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "Contacts_steps.user_is_on_create_new_contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file for lastname",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.user_takes_input_from_excel_file_for_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Failed to enter the mandatory field firstname",
  "keyword": "When "
});
formatter.match({
  "location": "Contacts_steps.failed_to_enter_the_mandatory_field_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.click_the_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "display the alert message the firstname is required",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts_steps.display_the_alert_message_the_firstname_is_required()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "user logged in with valid credentials",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Free crm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_is_on_Free_crm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_takes_input_from_excel_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter_email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Failure in creating the new contact by leaving the lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contactpage"
    },
    {
      "name": "@Invalid_lastname_validation"
    }
  ]
});
formatter.step({
  "name": "user is on create new contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "Contacts_steps.user_is_on_create_new_contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file for firstname",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.user_takes_input_from_excel_file_for_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Failed to enter the mandatory field lastname",
  "keyword": "When "
});
formatter.match({
  "location": "Contacts_steps.failed_to_enter_the_mandatory_field_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.click_the_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "display the alert message the lastname is required",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts_steps.display_the_alert_message_the_lastname_is_required()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "user logged in with valid credentials",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Free crm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_is_on_Free_crm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_takes_input_from_excel_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter_email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Failure in creating the new contact by leaving the firstname and lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contactpage"
    },
    {
      "name": "@Invalid_firstname_lastname_validation"
    }
  ]
});
formatter.step({
  "name": "user is on create new contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "Contacts_steps.user_is_on_create_new_contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Failed to enter the mandatory field firstname and lastname",
  "keyword": "When "
});
formatter.match({
  "location": "Contacts_steps.failed_to_enter_the_mandatory_field_firstname_and_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.click_the_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "display the alert message the firstname and lastname is required",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts_steps.display_the_alert_message_the_firstname_and_lastname_is_required()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "user logged in with valid credentials",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Free crm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_is_on_Free_crm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_takes_input_from_excel_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter_email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "filling all the fields in the contact page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contactpage"
    },
    {
      "name": "@filling_all_the_fields"
    }
  ]
});
formatter.step({
  "name": "user is on create new contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "Contacts_steps.user_is_on_create_new_contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file for all fields",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.user_takes_input_from_excel_file_for_all_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter all the fields",
  "keyword": "When "
});
formatter.match({
  "location": "Contacts_steps.user_enter_all_the_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.click_the_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "display the saved page",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts_steps.display_the_saved_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "user logged in with valid credentials",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Free crm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_is_on_Free_crm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_takes_input_from_excel_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter_email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "leaving  some of the fields in the contact page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contactpage"
    },
    {
      "name": "@leaving_some_of_the_fields"
    }
  ]
});
formatter.step({
  "name": "user is on create new contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "Contacts_steps.user_is_on_create_new_contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User takes input from excel file for some fields",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.user_takes_input_from_excel_file_for_some_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter some of the fields",
  "keyword": "When "
});
formatter.match({
  "location": "Contacts_steps.user_enter_some_of_the_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Contacts_steps.click_the_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "display the saved page",
  "keyword": "Then "
});
formatter.match({
  "location": "Contacts_steps.display_the_saved_page()"
});
formatter.result({
  "status": "passed"
});
});
@Login
Feature: Free CRM

Background: User has already logged in with valid credentials 
and is navigated to Cogmento CRM home page. 
Scenario:Check the title 
Given User is on Free crm login page
Then check the title of the page

@successful_login
Scenario: Login functionality for Free CRM.
Given User is on Free crm login page
And User takes input from excel file
When User enter email and Password
And clicks the login button
Then login should be successful


@email_field_validation
Scenario: Failure in Free CRM on leaving the User Name field empty 
Given User is on Free crm login page
And User takes input from excel file
When user leaves email blank
And clicks the login button
Then display alert msg

@Password_field_validation
Scenario: Failure in Free CRM on leaving the Password field empty
Given User is on Free crm login page
And User takes input from excel file
When user leaves password field blank
And clicks the login button
Then display alert msg

@Invalid_Password_validation
Scenario: Failure in Free CRM on entering incorrect Password 
Given User is on Free crm login page
And User takes input from excel file
When user enters an incorrect password
And clicks the login button
Then display alert msg

@blank_credentials_validation
Scenario: Failure in Free CRM on leaving username and password fields empty 
Given User is on Free crm login page
And clicks the login button
Then display alert msg


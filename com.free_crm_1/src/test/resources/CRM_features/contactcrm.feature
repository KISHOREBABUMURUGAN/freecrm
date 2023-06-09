@contactpage
Feature: Validate contact page functionality of free crm application

Background: user logged in with valid credentials
Given User is on Free crm login page
And User takes input from excel file
When User enter email and Password
And clicks the login button

@succesfully_creatingcontact_validation 
Scenario: succefully creating the contact by entering all the mandatory fields
Given user is on create new contact page
And User takes input from excel file for firstname and lastname
When I enter the mandatory field firstname and lastname
And click the save button
Then display the saved page 

@Invalid_firstname_validation 
Scenario: Failure in creating the new contact by leaving the firstname
Given user is on create new contact page
And User takes input from excel file for lastname
When Failed to enter the mandatory field firstname 
And click the save button
Then display the alert message the firstname is required


@Invalid_lastname_validation
Scenario: Failure in creating the new contact by leaving the lastname
Given user is on create new contact page
And User takes input from excel file for firstname
When Failed to enter the mandatory field lastname
And click the save button
Then display the alert message the lastname is required

@Invalid_firstname_lastname_validation
Scenario: Failure in creating the new contact by leaving the firstname and lastname
Given user is on create new contact page
When Failed to enter the mandatory field firstname and lastname
And click the save button
Then display the alert message the firstname and lastname is required

@filling_all_the_fields
Scenario: filling all the fields in the contact page
Given user is on create new contact page
And User takes input from excel file for all fields
When user enter all the fields
And click the save button
Then display the saved page 

@leaving_some_of_the_fields
Scenario: leaving  some of the fields in the contact page
Given user is on create new contact page
And User takes input from excel file for some fields
When user enter some of the fields
And click the save button
Then display the saved page 



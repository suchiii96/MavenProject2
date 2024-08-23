#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Functionality

@regression
Scenario: Test the Login functionality  with valid information


When Enter the valid email "testautomation063@gmail.com" 
When Enter the valid password "test@6789"
When click on login
#Then Verify home page


@smoke
Scenario: Test the Login functionality  with invalid information


When Enter the invalid email  "abc123.com"
When Enter the invalid password "123efg"
When click on login
#Then Verify error message


























Feature: Register Functionality

Background: Common for register functionality

When Click on create new account
When Enter a valid firstname
When Enter a valid surname

@regression
Scenario: Test the Register functionality  with valid information


When Enter a valid email "testautomation063@gmail.com"
When Reenter the  valid email   "testautomation063@gmail.com"
When Enter a valid password "test@6789"
When Enter date of birth
When Enter gender
When click on sign up
#Then verify sucessfull registration process


@smoke
Scenario: Test the Register functionality  with Invalid information


When Enter a invalid email "abcdefghijkl.com"
When Reenter invalid  email "abcdefghijkl.com"
When Enter a invalid password "12ad"
When Enter date of birth
When Enter gender
When click on sign up
#Then verify error message







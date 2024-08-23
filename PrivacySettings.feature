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

Feature: Privacy Settings Functionality

Background: common for privacy settings Scenario

When Enter the valid email "testautomation063@gmail.com" 
When Enter the valid password "test@6789"
When click on login


Scenario: Verify that users can adjust their privacy settings to control who can see their profile 

When Click on Account
When click on Settings and Privacy
When Click on Privacy Checkup
When Click on who can see what you share
Then Click on Continue
Then verify who can see your profile details

Scenario: Verify that users can adjust their privacy settings to control who can see their post

When Click on Menu
When Click on post
Then Click on dropdown
Then Select defualt audience 

















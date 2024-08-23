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

Feature: Profile Management

Background: common for profile management scenario

When Enter the valid email "testautomation063@gmail.com" 
When Enter the valid password "test@6789"
When click on login


Scenario: updating users profile picture

When Click on profile
When click on edit profile
When click on Add
Then Update profile picture


Scenario: updating users profile name

When click on account
When click on settings and privacy
When click on settings
When click on personal details
When click on profiles
When click on name
Then update new profile name
Then Click on Review change
Then Click on done


Scenario: Verify that users can view their own  profiles

When click on own profile 
Then verify user can view their own profile

Scenario: Verify that users can view their other  profiles

When search a user profile
Then verify user can view others profile
 
Scenario: Verify that users can send friend requests 

When Click on Find friends
When click on Friend Requests
Then Click on view sent Requests

Scenario: Verify that users can accept or decline incoming requests

When Click on Find friend
When click on Friend Request
Then Click on confirm on incoming request

























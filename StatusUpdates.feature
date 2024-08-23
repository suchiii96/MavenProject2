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

Feature: Status Updates  Functionality

Background: common for Status updates Scenario

When Enter the valid email "testautomation063@gmail.com" 
When Enter the valid password "test@6789"
When click on login

Scenario:  Verify that users can post status updates on their profiles.

When click on Menu
When click on post status
Then create story
Then click on post

Scenario: Verify that status updates are displayed  in the news feed.

When click on Feeds
Then Verify the status updates

Scenario: Verify that status updates are displayed on the users profile

When Click on Profile
When click on action button
Then click on save post

Scenario: Verify that users can like and comment on status updates.

When click on user profile
Then click on Like button
Then Click on Comment 
Then Post a comment
Then Click on comment button











































Feature: Search and Discovery  Functionality

Background: common for Search Scenario

When Enter the valid email "testautomation063@gmail.com" 
When Enter the valid password "test@6789"
When click on login

Scenario:  Verify that users can search for other users by name or email.

When search a user name
Then verify user can view others profile

Scenario: Verify that users can discover and connect with other users through friend suggestions.

When Click on find Friends
When Click on suggestions

















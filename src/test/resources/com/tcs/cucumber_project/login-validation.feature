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
@Login
Feature: Assignment12
  Automating Testing using BDD Framework

 
    @step1
  Scenario: Navigate to the given website
    Given I am in the given website 
    When I see the Notification click on dont allow
    Then Hover on Home and Kitchen and click on curtain 
    Then switch the tab to curtains
    Then click on the first visible product
		Then validate the successful message
    
    

  
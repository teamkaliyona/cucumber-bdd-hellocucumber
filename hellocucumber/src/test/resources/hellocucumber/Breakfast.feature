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
@tag
Feature: Check for Breakfast
  I want to use this feature file to list all breakfast items on every day

  @tag1
  Scenario: Sunday
    Given Today is "Sunday"
    When Student asks for today's breakfast
    Then Today's breakfast is "Dosey"
    
  Scenario: Monday
    Given Today is "Monday"
    When Student asks for today's breakfast
    Then Today's breakfast is "Idli"
    
  Scenario: AnyOtherDay
    Given Today is "Otherday"
    When Student asks for today's breakfast
    Then Today's breakfast is "Avalakki"

 

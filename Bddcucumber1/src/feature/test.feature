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
@Regression
Feature: login page feature 
  I want to use this template for my loginpage feature file
  
  Background: pre condition
  Given i am the user of this application

  @test1 
  Scenario: to validate login credentials
  When user enter valid user name
  And user enter valid password
  And user enter loginbutton
  Then login succesfully
    
  @test2
  Scenario: to validate invalide credentials
  When user enter invalid username
  And user enter invalid password
  And user enter again login button 
  Then login unsuccessfully
  
    

    
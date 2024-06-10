@AutomationExercise
Feature: Automation Exercise
  #/*
  #Go to https://automationexercise.com/
  #Create an account and delete it.
  #Create HTML report for each step with screenshots
  # */
  Background: Go to homepage
    Given user goes to url "https://automationexercise.com/"

  Scenario: Create Account and Delete It
    When click on Signup Login
    And enter signup name, email address and click Signup button
    And enter account information
    And click Create Account button
    Then assert Account Created!
    When click Continue button
    And click Delete Account
    And assert Account Deleted!
    Then click Continue Button to Homepage



@Failed
Feature: Login Test

  Background: User goes to homepage
    Given user goes to homepage

  @FailedScenario
  Scenario: Positive login Failed Test

    When user enters email
    And user enters password
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

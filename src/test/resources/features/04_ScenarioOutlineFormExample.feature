Feature: Form Test Feature

  Scenario Outline: Form Test

    Given user goes to form page
    When user enters username "<username>"
    And user enters form password "<password>"
    And user enters form comment "<comment>"
    And user clicks on form submit
    Then user closes the browser
    Examples:
      | username     | password | comment      |
      | john_doe     | 123      | Hello John   |
      | tom_zoey     | 345      | Good Bye     |
      | henry_george | 987      | Hi everybody |

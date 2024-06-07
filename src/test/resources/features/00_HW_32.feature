@Notes
Feature: Data table Test

  Scenario: Simple Note Taker
    Given user goes to url "https://testpages.eviltester.com/styled/apps/notes/simplenotes.html"
    When user enters titles and notes and clicks on add
      | Note 1 | Prepare breakfast        |
      | Note 2 | Wash the dishes          |
      | Note 3 | Take care of baby        |
      | Note 4 | Help your kid's homework |
      | Note 5 | Study Selenium           |
      | Note 6 | Sleep                    |
      | Note 7 | Get Up                   |
      | Note 8 | Go to school             |
    Then user closes the browser
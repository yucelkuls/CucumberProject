@Excel
Feature: Excel Automation


  Scenario: Data Table Test
    Given user goes to url "https://editor.datatables.net/"
    When user enters credentials from excel
    Then user closes the browser

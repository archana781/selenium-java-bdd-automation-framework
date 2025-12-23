Feature: Login Functionality

  Scenario: Valid Login
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in successfully

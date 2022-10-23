Feature: Test login functionality

  Scenario Outline: Check login is successful the with valid credentials
    Given the browser is open
    And user is on login page
    When user enters valid <username> and <password>
    And user clicks on login
    Then user is navigated to home page
    Examples:
      | username | password |
      | applejack | 12345 |
      | rainbow | 12345 |

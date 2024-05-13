Feature: Demo workshop Application

  Scenario: Login should be success

    Given User should navigate to the application
    And User clicks on the login links
    And User enter the username as "mutharasu0527@gmail.com"
    And User enter the password as "0527muthu"
    When User click the login button
    Then Login should be success

  Scenario: Login should be fail

    Given User should navigate to the application
    And User clicks on the login links
    And User enter the username as "mutharasu@gmail.com"
    And User enter the password as "0527muthu"
    When User click the login button
    But Login should be fail


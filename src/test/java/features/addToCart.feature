Feature: Demo workshop Application

  Scenario Outline: Add a product to the cart

    Given User should navigate to the application
    And User should login as "<username>" and "<password>"
    And User should search the "<book>"
    When User should add the book to the cart
    Then the cart badge should be updated

    Examples:
    |username|password|book|
    |mutharasu0527@gmail.com|0527muthu|book|


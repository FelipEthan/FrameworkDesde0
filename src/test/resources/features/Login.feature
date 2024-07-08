@Test
Feature: Login screen
  Scenario: Successful login with valid credentials
    Given I am on the automation page
    When I enter valid name and mail
    And I click on the login button
    Then I should be redirected to the date
    And I am complete information form
Feature: As a User, I want to be able to navigate the Hacker News Website
  Scenario: Navigating to the past page from the Homepage
    Given I am on the Hacker News Website
    When I click the past link
    Then I will go to the past page

  Scenario: Navigating to the search page using the search text box
    Given I am on the Hacker News Website
    When I enter "java" into the Search text box
    Then I will go to the search page with the url parameter "java"
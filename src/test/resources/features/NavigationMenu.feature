@navigate
Feature:Navigation Menu
  Scenario:Fleet --> Vehicles
    Given the user is on the login page
    And the user enter the sales manager information
    When the user goes to Fleet, Vehicles
    Then the url should be expected Vehicles url

  Scenario: Marketing --> Campaigns
    Given the user is on the login page
    And the user enter the sales manager information
    When the user goes to Marketing, Campaigns
    Then the url should be expected Campains url

  Scenario: Activities --> Calender Events
    Given the user is on the login page
    And the user enter the sales manager information
    When the user goes to Activities, Calender Events
    Then the url should be expected Calender Events url

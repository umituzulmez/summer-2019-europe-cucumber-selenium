Feature: Contacts Page
@wip
  Scenario: Default page number
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates "Customers" "Contacts"
    Then default page number should be 1

  Scenario: verify Calender events
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates "Fleet" "Vehicles"

  Scenario: Menu options
    Given the user logged in as a "driver"
    Then the user should see following menu options
      | Fleet | Customers | Activities | System |

  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using following credential
      | username  | user1       |
      | password  | UserUser123 |
      | firstname | John        |
      | lastname  | Doe         |

  Scenario Outline: login as a given user
    Given the user is on the login page
    When the user logs in using following credential
      | username  | <username>  |
      | password  | UserUser123 |
      | firstname | <firstname> |
      | lastname  | <lastname>  |

    Examples:
      | username        | firstname              | lastname |
      | user1           | John               | Doe      |
      | salesmanager101 | Peyton             | Harber   |
      | storemanager85  | Marcella bnmbnmbmn | Huels    |





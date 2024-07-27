Feature: Login scenario

  @Smoke
  Scenario: Login with positive flow
    When I enter the username as "rajkumar@testleaf.com"
    And I enter the password as "Leaf@123"
    And I click the login button
    Then Verify Home page is displayed

  @Regression
  Scenario: Login with negative flow
    When I enter the username as "lokesh@testleaf.com"
    And I enter the password as "Leaf@123"
    And I click the login button
    Then Verify Login page is displayed
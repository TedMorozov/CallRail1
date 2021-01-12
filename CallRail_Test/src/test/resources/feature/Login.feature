Feature: Login functionality tests

  Background: 
    Given user open the website
    Then verify login page is displayed

  @positive @smoke @wip @ted
  Scenario: Verify login successful with valid cred
    When user login with username "valid.username" and password "valid.password"
    Then verify user is on homepage

  @negative @regression @ted
  Scenario: Verify login unsuccessful with invalid cred
    When user login with username "invalid.username" and password "invalid.password"
    Then verify login is unsuccessful
    Then verify login page is displayed

Feature: Login functionality tests

  Background: 
  
    Given user open the website
    Then verify login page is displayed

  @positive @smoke @wip @ted
   Scenario: Verify login successful with valid cred
    When user login with username "valid.username" and password "valid.password"
    Then verify user is on homepage
    Then user clicks on Users tab under admin and user management menu
    Then verify user is on users listing page
    When user clicks on add button
    Then verify add users page is displayed
    When user fill required details
    And click on save button
    Then verify user is on users listing page
    And verify success message is displayed
    
  @negative @regression @ted
  Scenario: Verify login unsuccessful with invalid cred
  
    When user login with username "invalid.username" and password "invalid.password"
    Then verify login is unsuccessful
    Then verify login page is displayed

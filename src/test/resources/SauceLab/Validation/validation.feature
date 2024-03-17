@smoke
Feature: Login functionality

  #BackGround is somthin like beforeMethods,it works before every scenario in one feature
  Background: Login steps
    Given user is navigated to login page
    When user is on Login page user enter username and password
    And user clicks on login

    Scenario: Positive scenario for URl title and header
      Given user is on main page user validate title
      Then user validate Url
      Then  user validate main header


      Scenario: Positive scenario validating header on the left and dropdown
        When user is on main page validate header on left nav bar
        Then user validates all the list of options from the dropdown
        And user selects price low to high option
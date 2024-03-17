Feature: check new input fields
  Scenario: happy path
    Given user is on main page of lambda user checks on ajax submit form
    Then  user enter name and message as follows
      | name    | Kobe        |
      | message | hello world |
    And  user clicks on submit button
    Then user validates ajaax message as follow
    |expectedMessage| Ajax Request is Processing! |
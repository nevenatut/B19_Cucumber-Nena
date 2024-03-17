Feature: Group order functionality
  Background: authentication
    Given  user is login page of web order
    When user enters username as 'guest1@microworks.com' and password as 'Guest1!'
    Then user click on sing in button

    Scenario: office order happy path

      Given user is on main page user click on group order radio button
      Then user is selected 'Office' from the dropdown
      And validate office address as '1 n  DearBore'
      Then user leaves note for guests as 'take your shose off'
      Then user enter info into invitee list like 'test@test.io'
      Then user click on create group order button
      And user validate on main header 'View Group Order' on the nex Page
      And user validates total participant as '1'

  Scenario: office order happy path
        #prvi scenario je isti kao drugi samo im se razlikuje parametar u step 2
          # tj.test case 2 ,tako da snippet uzimamo samo jedanputa
    Given user is on main page user click on group order radio button
    Then user is selected 'My House' from the dropdown
    And validate office address as '1 n  DearBore'
    Then user leaves note for guests as 'take your shose off'
    Then user enter info into invitee list like 'test@test.io'
    Then user click on create group order button
    And user validate on main header 'View Group Order' on the nex Page
    And user validates total participant as '1'







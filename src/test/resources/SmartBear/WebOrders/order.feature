Feature: WebOrder functionality input fields
#  Scenario: AC Check all input fields on web order page happy path
#    Given user is on main page of login page and validate title as 'Web Orders Login'
#    Then user enter their username as 'Tester' and password as 'test'
#    And user click on login button
#    When user is on main page user click on order tab
#    Then user on order page selects 'ScreenSaver' and enters quantity as '200'
#    And  user enters price as '500' discount as '50' and total as '1000'
#    #Address information
#  Then user enters their name as 'Kobe Bryant' and street address as 'Venice Ave'
#    When user enters city as 'Los Angeles' and state as 'California' and zipcode as '60656'
#    Then user selects visa and provides cc as '435674449' and expiration data as '12/23'
#    And user finally click on process button

  Scenario Outline: check all inputs fields
    Given user is on main page of login page and validate title as 'Web Orders Login'
    Then user enter their username as 'Tester' and password as 'test'
    And user click on login button
    When user is on main page user click on order tab

    Then user on order page selects '<productName>' and enters quantity as '<quantity>'
    And  user enters price as '<price>' discount as '<discount>' and total as '<total>'

    Then user enters their name as '<name>' and street address as '<address>'
    When user enters city as '<city>' and state as '<state>' and zipcode as '<zipcode>'
    Then user selects visa and provides cc as '<cc>' and expiration data as '<exp>'
    And user finally click on process button


    Examples: test data
      | productName | quantity | price | discount | total | name     | address   | city        | state      | zipcode | cc         | exp   |
      | ScreenSaver | 500      | 566   | 340      | 2000  | Kobi Bi  | VaniceAve | Los Angeles | California | 60656   | 6683873733 | 12/23 |
      | ScreenSaver | 400      | 566   | 456      | 2000  | Johan Bi | Prca Ave  | Chicago     | California | 60656   | 6683873733 | 12/23 |
      | ScreenSaver | 400      | 387   | 456      | 3000  | Kobi Bi  | Prca Ave  | Los Angeles | California | 60656   | 6683873733 | 12/23 |
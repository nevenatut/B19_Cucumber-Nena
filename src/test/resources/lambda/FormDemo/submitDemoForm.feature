Feature: fill in inputs field
  Scenario: Happy path
    Given user is on lambda main page and click on input form submit
    Then user enters name email and password as follows
      | name     | Nena          |
      | email    | test@test.com |
      | password | 123465        |
    And user enters company website and from dropdown select country
    |company|ABC|
    |website|www.abc|
    |country|United States   |
    Then user enters city first address and second address
      | city           | Chicago    |
      | first address  | 1N State   |
      | second address | 22 N  Lake |
    And user enters state and zipcode and clicks on submit button
      | state   | Il    |
      | zipcode | 60656 |
    Then user validates success message as follows
   |successMessage| |Thanks for contacting us, we will get back to you shortly. |



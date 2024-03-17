Feature: check wrong credibility

  Scenario Outline: check wrong credential login attempts
    Given user is on main page user click on login button
    Then user click on continue with email button
    And user enters '<email>' and click on next button
    Then user enters '<wrongPassword>' clicks on next button and validates '<errorMessage>'
    Examples: test data
      | email         | wrongPassword | errorMessage                           |
      | test@test     | 12opu         | Your email or password were incorrect  |
      | test@test.com | 123jh4        | Your email or password were incorrect. |
      | test@test.com | 43242\j1      | Your email or password were incorrect. |
      | test@test.com | rtyrtyt       | Your email or password were incorrect. |
    # trik je da se uzme location od errorMessage jer ona se pojavi i ne stane
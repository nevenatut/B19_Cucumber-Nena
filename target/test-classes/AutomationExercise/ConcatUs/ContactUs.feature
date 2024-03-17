Feature: Contact us functionality
 #AutomationExericis directory,pa smo jos jedan directory kreirali,pa tek pod drugim cucumber file
  #jer pod prvim mozda hocemo jos da kreiramo jer se on odnosi na main web stranicu
  #jedan red koji ispisemo,bice jedan metod
  Scenario: Happy Path
    Given  user is on main page user click on contat us link
    When  user is on conntact us page  user validate url and title of the page
    Then   user enters name and emails
    And  user enter subject of the message and message itself
    Then user attaches file and click on submit button

  Scenario: Get texts from contact us headers
    Given  user is on main page user click on contat us link
    When  user is on contact us page user verifies Contact us text
    Then user validate Get In Touch text
    And  user validate Feedback For Us text
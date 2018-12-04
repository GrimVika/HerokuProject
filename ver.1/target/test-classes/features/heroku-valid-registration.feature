@web @heroku

  Feature: website

@validregistration
Scenario Outline: Verify a new user can register with a valid email address
  Given I am on Registration page
  When I enter name as <username>, email as <email>, password as test12345
  And I click on sign up 'submit' button
  Then  I am signed-in as a new user
Examples:
|username          | email                 |
|testuserVictoria02|victoriatest07@test.com|
|testuserVictoria03|victoriatest08@test.com|

@loginautomation
Scenario: Verify valid login
  Given User is on the Threely login page
  When I enter username as victoriatest02@test.com and password as test12345
  And I click on login 'submit' button
  Then I verify logout button is displayed

@invalidregistration
Scenario Outline: Verify invalid email on registration
  Given I am on Registration page
  When I enter name as username, email as <email>, password as test12345
  And I click on sign up 'submit' button
  Then  I verify invalid email address

  Examples:
    | email              |
    | test.com           |
    | test@test@test.com |
    | test@@@test.com    |

@autocompletesearch
Scenario Outline: Verify autocomplete search
  Given User is on the Threely login page
  When I search on top search bar with text <search>
  Then I verify <text> as displayed result

  Examples:
    | search | text |
    | ios    |Title: I will teach you IOS    |
    | android|Title: I will teach android    |
@web @heroku

  Feature: Registration

@validregistration
Scenario: Verify a new user can register with a valid email address
  Given I am on Registration page
  When I enter name as testuserVictoria02, email as victoriatest02@test.com, password as test12345
  And I click on sign up 'submit' button
  Then  I am signed-in as a new user

@loginautomation
Scenario: Verify valid login
  Given User is on the Threely login page
  When I enter username as victoriatest02@test.com and password as test12345
  And I click on login 'submit' button
  Then I verify logout button is displayed
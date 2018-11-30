@web @heroku

  Feature: Registration

@validregistration
Scenario: Verify a new user can register with a valid email address
  Given I am on Registration page
  When I enter name as testuserVictoria01, email as victoriatest01@test.com, password as test12345
  And I click 'submit' button
  Then  I am signed-in as a new user

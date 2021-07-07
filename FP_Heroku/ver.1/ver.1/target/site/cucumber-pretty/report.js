$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("heroku-valid-registration.feature");
formatter.feature({
  "line": 3,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@heroku"
    }
  ]
});
formatter.before({
  "duration": 4366743289,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify valid login",
  "description": "",
  "id": "registration;verify-valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@loginautomation"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on the Threely login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter username as victoriatest02@test.com and password as test12345",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on login \u0027submit\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify logout button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuSD.userIsOnHomepage()"
});
formatter.result({
  "duration": 252939802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "victoriatest02@test.com",
      "offset": 20
    },
    {
      "val": "test12345",
      "offset": 60
    }
  ],
  "location": "HerokuSD.login(String,String)"
});
formatter.result({
  "duration": 823318687,
  "status": "passed"
});
formatter.match({
  "location": "HerokuSD.iClickLogInSubmitButton()"
});
formatter.result({
  "duration": 2050300739,
  "status": "passed"
});
formatter.match({
  "location": "HerokuSD.iVerifyLogoutButtonIsDisplayed()"
});
formatter.result({
  "duration": 1112335161,
  "status": "passed"
});
formatter.after({
  "duration": 192508300,
  "status": "passed"
});
});
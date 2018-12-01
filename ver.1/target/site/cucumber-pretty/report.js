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
  "duration": 4379765230,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify a new user can register with a valid email address",
  "description": "",
  "id": "registration;verify-a-new-user-can-register-with-a-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@validregistration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter name as testuserVictoria05, email as victoriatest05@test.com, password as test12345",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click \u0027submit\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am signed-in as a new user",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuSD.iAmOnRegistrationPage()"
});
formatter.result({
  "duration": 761995143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuserVictoria05",
      "offset": 16
    },
    {
      "val": "victoriatest05@test.com",
      "offset": 45
    },
    {
      "val": "test12345",
      "offset": 82
    }
  ],
  "location": "HerokuSD.iEnterNameAsEmailAsPasswordAs(String,String,String)"
});
formatter.result({
  "duration": 512889591,
  "status": "passed"
});
formatter.match({
  "location": "HerokuSD.iClickSubmitButton()"
});
formatter.result({
  "duration": 1151102631,
  "status": "passed"
});
formatter.match({
  "location": "HerokuSD.iAmSignedInAsANewUser()"
});
formatter.result({
  "duration": 1119805328,
  "status": "passed"
});
formatter.after({
  "duration": 174887378,
  "status": "passed"
});
});
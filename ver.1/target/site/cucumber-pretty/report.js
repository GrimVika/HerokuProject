$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("heroku.feature");
formatter.feature({
  "line": 3,
  "name": "website",
  "description": "",
  "id": "website",
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
  "duration": 4979022635,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Verify",
  "description": "",
  "id": "website;verify",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@numberofposts"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "User is on the Threely login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 50,
      "value": "#  Then I verify 94 total post is displayed"
    },
    {
      "line": 51,
      "value": "#  And I verify all post have price tag"
    },
    {
      "line": 52,
      "value": "#  And I verify all post have title"
    }
  ],
  "line": 53,
  "name": "I verify all post have displayed image",
  "keyword": "And "
});
formatter.match({
  "location": "HerokuSD.userIsOnHomepage()"
});
formatter.result({
  "duration": 308442079,
  "status": "passed"
});
formatter.match({
  "location": "HerokuSD.imageDisplayed()"
});
formatter.result({
  "duration": 1028983737,
  "status": "passed"
});
formatter.after({
  "duration": 200858604,
  "status": "passed"
});
});
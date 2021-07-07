$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("heroku-valid-registration.feature");
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
formatter.scenarioOutline({
  "line": 37,
  "name": "Verify autocomplete search",
  "description": "",
  "id": "website;verify-autocomplete-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@autocompletesearch"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User is on the Threely login page",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I search on top search bar with text \u003csearch\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I verify \u003ctext\u003e as displayed result",
  "keyword": "Then "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "website;verify-autocomplete-search;",
  "rows": [
    {
      "cells": [
        "search",
        "text"
      ],
      "line": 43,
      "id": "website;verify-autocomplete-search;;1"
    },
    {
      "cells": [
        "ios",
        "Title: I will teach you IOS"
      ],
      "line": 44,
      "id": "website;verify-autocomplete-search;;2"
    },
    {
      "cells": [
        "android",
        "Title: I will teach android"
      ],
      "line": 45,
      "id": "website;verify-autocomplete-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4007360562,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Verify autocomplete search",
  "description": "",
  "id": "website;verify-autocomplete-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@autocompletesearch"
    },
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
formatter.step({
  "line": 38,
  "name": "User is on the Threely login page",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I search on top search bar with text ios",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I verify Title: I will teach you IOS as displayed result",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuSD.userIsOnHomepage()"
});
formatter.result({
  "duration": 310812197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ios",
      "offset": 37
    }
  ],
  "location": "HerokuSD.topBarSearch(String)"
});
formatter.result({
  "duration": 225285910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Title: I will teach you IOS",
      "offset": 9
    }
  ],
  "location": "HerokuSD.verifySearchAutocomplete(String)"
});
formatter.result({
  "duration": 2050404934,
  "status": "passed"
});
formatter.after({
  "duration": 164230674,
  "status": "passed"
});
formatter.before({
  "duration": 2246382617,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Verify autocomplete search",
  "description": "",
  "id": "website;verify-autocomplete-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@autocompletesearch"
    },
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
formatter.step({
  "line": 38,
  "name": "User is on the Threely login page",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I search on top search bar with text android",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I verify Title: I will teach android as displayed result",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuSD.userIsOnHomepage()"
});
formatter.result({
  "duration": 138756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "android",
      "offset": 37
    }
  ],
  "location": "HerokuSD.topBarSearch(String)"
});
formatter.result({
  "duration": 414395843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Title: I will teach android",
      "offset": 9
    }
  ],
  "location": "HerokuSD.verifySearchAutocomplete(String)"
});
formatter.result({
  "duration": 2040398068,
  "status": "passed"
});
formatter.after({
  "duration": 172971986,
  "status": "passed"
});
});
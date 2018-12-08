$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky.feature");
formatter.feature({
  "line": 2,
  "name": "Timeline",
  "description": "",
  "id": "timeline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@darkSkyregression"
    },
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 4937082158,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "timeline;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@todaytimeline"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I expand todays timeline",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 634889907,
  "error_message": "java.lang.AssertionError: expected [Dark Sky Logo] but found []\n\tat org.testng.Assert.fail(Assert.java:93)\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:134)\n\tat org.testng.Assert.assertEquals(Assert.java:115)\n\tat org.testng.Assert.assertEquals(Assert.java:189)\n\tat org.testng.Assert.assertEquals(Assert.java:199)\n\tat framework.DarkSkyHomePage.iAmOnDarkskyPage(DarkSkyHomePage.java:59)\n\tat stepdefinition.DarkSkySD.iAmOnDarkskyHomePage(DarkSkySD.java:32)\n\tat ✽.Given I am on Darksky Home Page(darksky.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "location": "DarkSkySD.iExpandTodaysTimeline()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DarkSkySD.iVerifyLowestAndHighestTempIsDisplayedCorrectly()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 235269364,
  "status": "passed"
});
});
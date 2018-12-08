@darkSkyregression @web
  Feature: Timeline

    @forecast1
    Scenario: Verify current temp
        When Clear search text field
        And Enter 347 West 30th Street, New York City, NY into the search field
        And Click on search magnifying glass
        Then Verify current temperature is between low and high value


    @todaytimeline
    Scenario: Verify individual day temp timeline
      Given I am on Darksky Home Page
      When I expand todays timeline
      Then I verify lowest and highest temp is displayed correctly
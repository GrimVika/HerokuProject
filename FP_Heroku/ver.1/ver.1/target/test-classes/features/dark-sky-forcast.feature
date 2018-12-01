@darkSkyregression @web
  Feature: Forecast

    @forecast1
    Scenario: Verify current temp
        When Clear search text field
        And Enter 347 West 30th Street, New York City, NY into the search field
        And Click on search magnifying glass
        Then Verify current temperature is between low and high value

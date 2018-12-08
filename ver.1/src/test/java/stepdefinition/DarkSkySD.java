package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DarkSkyHomePage;

public class DarkSkySD {

    DarkSkyHomePage dshomepage = new DarkSkyHomePage();

    @When("^Clear search text field$")
    public void clearSearchField () {
        dshomepage.clearTextField();
    }

    @And("^Enter (.+) into the search field$")
    public void addressOrZipcode(String addressOrZipString) {
        dshomepage.enterAddressOrZipcode(addressOrZipString);
    }

    @And ("^Click on search magnifying glass$")
    public void clickOnMagGlass () {
        dshomepage.clickOnGlass();
    }

    @Then("^Verify current temperature is between low and high value$")
    public void verifyTemp () throws InterruptedException { dshomepage.verifyTempValue(); }

    @Given("^I am on Darksky Home Page$")
    public void iAmOnDarkskyHomePage() { dshomepage.iAmOnDarkskyPage(); }

    @When("^I expand todays timeline$")
    public void iExpandTodaysTimeline() { dshomepage.expendTimeline(); }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void iVerifyLowestAndHighestTempIsDisplayedCorrectly() { dshomepage.verifyTodayTimeline(); }

}

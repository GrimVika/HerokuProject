package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HerokuLandingPage;


public class HerokuSD {

    HerokuLandingPage herokuLand = new HerokuLandingPage();

    @Given("^I am on Registration page$")
    public void iAmOnRegistrationPage() { herokuLand.signUp(); }

    @When("^I enter name as (.+), email as (.+), password as (.+)$")
    public void iEnterNameAsEmailAsPasswordAs(String userName, String userEmail, String userPassword) {
        herokuLand.enterCredentials(userName, userEmail, userPassword);
    }

    @When("^I click 'submit' button$")
    public void iClickSubmitButton() { herokuLand.clickOnSubmitButton();}

    @Then("^I am signed-in as a new user$")
    public void iAmSignedInAsANewUser() throws InterruptedException { herokuLand.verifySuccessfullRegistration(); }
}

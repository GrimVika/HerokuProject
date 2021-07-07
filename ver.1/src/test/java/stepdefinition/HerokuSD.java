package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HerokuLandingPage;


public class HerokuSD {

    HerokuLandingPage herokuLand = new HerokuLandingPage();

    @Given("^I am on Registration page$")
    public void iAmOnRegistrationPage() { herokuLand.signUp(); }

    @Given("^User is on the Threely login page$")
    public void userIsOnHomepage () { }

    @When("^I enter name as (.+), email as (.+), password as (.+)$")
    public void iEnterNameAndEmailAndPassword(String userName, String userEmail, String userPassword) {
        herokuLand.enterCredentials(userName, userEmail, userPassword);
    }

    @When("^I click on sign up 'submit' button$")
    public void iClickSignUpSubmitButton() { herokuLand.clickOnSighUpSubmitButton();}

    @When("^I click on login 'submit' button$")
    public void iClickLogInSubmitButton () { herokuLand.clickOnLogInSubmitButton();}

    @When("^I enter username as (.+) and password as (.+)$")
    public void login (String loginEmail, String loginPassword) { herokuLand.loginAutomation(loginEmail, loginPassword); }

    @When("^I search on top search bar with text (.+)$")
    public void topBarSearch (String searchText1) { herokuLand.topBarSearchUse(searchText1);}

    @Then("^I verify logout button is displayed$")
    public void iVerifyLogoutButtonIsDisplayed() throws InterruptedException { herokuLand.verifySuccessfullRegistration(); }

    @Then("^I am signed-in as a new user$")
    public void iAmSignedInAsANewUser() throws InterruptedException { herokuLand.verifySuccessfullLogin(); }

    @Then("^I verify invalid email address$")
    public void verifyInvalidEmail () throws InterruptedException { herokuLand.verifyInvalidEmailMsg(); }

    @Then("^I verify (.+) as displayed result$")
    public void verifySearchAutocomplete (String expectedText1) throws InterruptedException {
        herokuLand.verifySearchAutocomplete(expectedText1);}


}

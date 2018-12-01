package framework;

import org.junit.Assert;
import org.openqa.selenium.By;

public class HerokuLandingPage extends BasePage {

        private By signUpBox = By.xpath("//a[@class='btn btn-success']");
        private By nameBox = By.xpath("//input[@name='username']");
        private By emailBox = By.xpath("//input[@name='email']");
        private By passwordBox = By.xpath("//input[@name='password']");
        private By submitSigUpButton = By.xpath("//button[@type='submit']");
        private By submitLogInButton = By.xpath("//button[@type='submit']");
        private By profileButton = By.xpath("//img[@class='img-circle']");
        private By logOutButton = By.xpath("//a[contains(text(),'Logout')]");
        private By logInButton = By.xpath("//a[contains(text(),'Sign In')]");
        private By loginEmailBox = By.xpath("//input[@id='email']");
        private By loginPasswordBox = By.xpath("//input[@id='password']");

        public void signUp () {
            clickOn(signUpBox);
        }
        public void enterCredentials (String name, String email, String password) {
            sendText(nameBox, name);
            sendText(emailBox, email);
            sendText(passwordBox, password);
        }
        public void clickOnSighUpSubmitButton () {
            clickOn(submitSigUpButton);
        }

        public void clickOnLogInSubmitButton () {
            clickOn(submitLogInButton);
        }

        public void verifySuccessfullRegistration () throws InterruptedException {
            Thread.sleep(1000);
            clickOn(profileButton);
            String actual = getTextFromElement(logOutButton);
            String expected = "Logout";
            Assert.assertEquals(expected, actual);
        }

        public void loginAutomation (String userloginEmail, String userloginPassword) {
            clickOn(logInButton);
            sendText(loginEmailBox, userloginEmail);
            sendText(loginPasswordBox, userloginPassword);
        }
        public void verifySuccessfullLogin () throws InterruptedException {
            Thread.sleep(1000);
            clickOn(profileButton);
            String actual = getTextFromElement(logOutButton);
            String expected = "Logout";
            Assert.assertEquals(expected, actual);
        }
    }



package framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;

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
        private By searchBox = By.xpath("//input[@id='aa-search-input']");
        private By searchDropDown = By.xpath("//span[@id='algolia-autocomplete-listbox-0']");
        private By numberOfPosts = By.xpath("//div[@class='gig-card']");
        private By priceTag = By.xpath("//div[@class='gig-card']//h3[1]");
        private By postTitle = By.xpath("//div[@class='gig-card']//h4[1]");
        private By imageLocator = By.xpath("//div[@class='gig-card']//img");

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
        public String verifySuccessfullLogin () throws InterruptedException {
            Thread.sleep(1000);
            clickOn(profileButton);
//            String actual = getTextFromElement(logOutButton);
            String expected = "Logout";
            return getTextFromElement(logOutButton);
//            Assert.assertEquals(expected, actual);
        }
        public void verifyInvalidEmailMsg () throws InterruptedException {
            Thread.sleep(1000);
        }
        public void topBarSearchUse (String searchText) {
            sendText(searchBox, searchText);
        }

        public void verifySearchAutocomplete (String expectedText) throws InterruptedException {
            Thread.sleep(1000);
            String actual = getTextFromElement(searchDropDown);
            Assert.assertEquals(expectedText, actual);
        }
        public int getNumberOfPosts () {
            List <WebElement> posts = getListOfWebElements(numberOfPosts);
//            int actualNumOfPosts = posts.size();
//            Assert.assertEquals(expectedNumOfPosts, actualNumOfPosts);
            return posts.size();
        }
        public void verifyPriceTags () {
            List<WebElement> priceTags = getListOfWebElements(priceTag);
            int tagsWithPrice = 0;
            int tagsWithoutPrice = 0;

            for (WebElement price : priceTags) {
                int length = price.getText().length();

                if (length > 1 )
                    tagsWithPrice++;
                else {
                    if (length <= 1)
                    tagsWithoutPrice++;
                }
            }
        }
        //Mohammad's code to mess around with:
    //        public void verifyPriceTags () {
//            List<WebElement> priceTags = getListOfWebElements(priceTag);
//            int tagsWithoutPrice = 0;
//            for (WebElement price : priceTags) {
//                if (price.getText().length() < 2 )
//                    tagsWithoutPrice++;
//            }
//            System.out.println("Tags without prices:" + tagsWithoutPrice);
//        }

        public void verifyTitles () {

            List<WebElement> titles = getListOfWebElements(postTitle);
            int postsWithTitle = 0;
            int postsWithoutTitle = 0;

            for (WebElement title : titles) {
                int length = title.getText().length();
                if (length >= 1)
                    postsWithTitle++;
                else {
                    if (length == 0)
                            postsWithoutTitle++;
                }
            }
        }
        public void verifyPostImages () {

            List<WebElement> images = getListOfWebElements(imageLocator);
            int totalImgDisplayed = 0;
            int uploadedImg = 0;

            for (WebElement option : images) {
                String element = option.getAttribute("src");
                totalImgDisplayed++;
                if (!element.contains("copywrite.jpg")){
                    uploadedImg++;
                }
            }
        }

    }



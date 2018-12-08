package framework;

import org.openqa.selenium.By;
import org.testng.Assert;


public class DarkSkyHomePage extends BasePage {

    private By searchTextField = By.xpath("//input[@type='text']");
    private By magnGlass = By.xpath("//a[@class='searchButton']");
    private By temp = By.xpath("//span[@class='summary swap']");
    private By lowTemp = By.xpath("//span[@class='currently']//span[2]//span[2]//span[2]");
    private By highTemp = By.xpath("//span[@class='summary-high-low']//span[3]");
    private By darkskyLogo = By.xpath("//a[@class='logo']//img");
    private By todaystimeline = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]");
    private By todaysTimelineMin = By.cssSelector("body.forecast:nth-child(2) div.center:nth-child(7) a.day:nth-child(2) span.tempRange:nth-child(2) > span.minTemp");
    private By todaysTimelineMax = By.cssSelector("body.forecast:nth-child(2) div.center:nth-child(7) a.day:nth-child(2) span.tempRange:nth-child(2) > span.maxTemp");
    private By todaysMinTemp = By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]");
    private By todaysMaxTemp = By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[2]/div[1]/span[3]/span[1]");


 public void clearTextField () {
     clickOn(searchTextField);
     clearAField(searchTextField);
 }

 public void enterAddressOrZipcode (String addressOrZipcode) {
     sendText(searchTextField, addressOrZipcode);
 }

 public void clickOnGlass () {
     clickOn(magnGlass);
 }

 public void verifyTempValue () throws InterruptedException {
     Thread.sleep(500);
     String tempNum = getTextFromElement(temp);
     tempNum.substring(0, 1);
     int currentTemp = Integer.parseInt(tempNum);

     Thread.sleep(500);
     String tempLow = getTextFromElement(lowTemp);
     tempLow.substring(5, 6);
     int lowTemp = Integer.parseInt(tempLow);

     Thread.sleep(500);
     String tempHigh = getTextFromElement(highTemp);
     tempHigh.substring(5, 6);
     int highTemp = Integer.parseInt(tempHigh);

     if (currentTemp > lowTemp && currentTemp < highTemp) {
         System.out.println("Test Passed");
     } else {
         System.out.println("Test Failed"); }
 }

 public void iAmOnDarkskyPage () {
     String logo = getTextFromElement(darkskyLogo);
     Assert.assertEquals(logo, "Dark Sky Logo");
 }
 public void expendTimeline () { clickOn(todaystimeline); }

 public void verifyTodayTimeline () {
     String minTemp = getTextFromElement(todaysTimelineMin);
     String maxTemp = getTextFromElement(todaysTimelineMax);
     String todayMin = getTextFromElement(todaysMinTemp);
     String todayMax = getTextFromElement(todaysMaxTemp);
     Assert.assertEquals(minTemp, todayMin);
     Assert.assertEquals(maxTemp, todayMax);
 }
 }


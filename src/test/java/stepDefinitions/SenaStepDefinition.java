package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TestCase04Nida;
import utilities.Driver;

import java.security.Key;

public class SenaStepDefinition {

    TestCase04Nida test =new TestCase04Nida();

    Faker faker =new Faker();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Then("Click on Test Cases button")
    public void clickOnTestCasesButton() {

        test.testCasesButton.click();

    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {

        Assert.assertTrue(test.testCasesPage.isDisplayed());


    }


    @Then("Click on Contact Us button")
    public void clickOnContactUsButton() {

        test.contactUs.click();

    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {

        Assert.assertTrue(test.getInTouch.isDisplayed());
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {

        test.enterName.sendKeys("Alice");
        test.enterEmail.sendKeys("alice@gmail.com");
        test.enterSubject.sendKeys("Dress");
        test.messages.sendKeys("Okeyto");

    }


    @And("Click Submit button")
    public void clickSubmitButton() {

        js.executeScript("arguments[0].click();", test.submitButton);
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {

        Assert.assertTrue(test.alertMessage.isDisplayed());
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {

        test.homeButtuon.click();
        Assert.assertTrue(test.homaPage.isDisplayed());

    }

    @And("close the page")
    public void closeThePage() {

        Driver.closeDriver();
    }
}

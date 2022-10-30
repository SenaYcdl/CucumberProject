package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TestCase04Nida;
import utilities.ConfigReader;
import utilities.Driver;

public class NidaStepDefinition {

    TestCase04Nida test=new TestCase04Nida();

    @Given("automation {string} page")
    public void automationPage(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {

        Assert.assertTrue(test.home.isDisplayed());
    }

    @And("Click on Signup Login button")
    public void clickOnSignupLoginButton() {

        test.login.click();
    }

    @And("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {

        Assert.assertTrue(test.newUser.isDisplayed());
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {

        test.name.sendKeys("Nida");
        test.email.sendKeys("yc@gmail.com");
    }

    @And("Click Signup button")
    public void clickSignupButton() {

        test.signup.click();
    }

    @Then("Verify error is visible")
    public void verifyErrorIsVisible() {

        Assert.assertTrue(test.error.isDisplayed());

        Driver.closeDriver();

    }


}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TestCase04Nida;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NidaStepDefinitions {

    TestCase04Nida test=new TestCase04Nida();

    @Given("automation page")
    public void automationPage() {

        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
    }

    @And("Verify that home page is visible")
    public void verifyThatHomePageIsVisible() {

        Assert.assertTrue(test.home.isDisplayed());

    }

    @And("Click on SignupLogin button")
    public void clickOnSignupLoginButton() {

        test.login.click();

    }

    @And("verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {

        Assert.assertTrue(test.loginVisible.isDisplayed());
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {


        test.email.sendKeys("yc@gmail.com");
        test.pass.sendKeys("12345");
    }

    @And("Click login button")
    public void clickLoginButton() {

        test.log.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {

        Assert.assertTrue(test.uservisible.isDisplayed());
    }

    @And("Click Logout button")
    public void clickLogoutButton() {

        test.logout.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {

        Assert.assertTrue(test.loginVisible.isDisplayed());
    }
}

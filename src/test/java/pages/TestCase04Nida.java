package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestCase04Nida {

    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Logout' button
10. Verify that user is navigated to login page
     */

    public TestCase04Nida() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement home;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement login;

    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    public WebElement loginVisible;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement pass;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement log;

    @FindBy(xpath = "//header[@id='header']//li[1]")
    public WebElement uservisible;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logout;
}


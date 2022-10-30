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



    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    public WebElement newUser;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;


    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement signup;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement error;


    //sena
    @FindBy (xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testCasesButton;

    @FindBy(xpath = "//h2")
    public WebElement testCasesPage;

    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement contactUs;

    @FindBy(xpath = "(//*[@class='title text-center'])[2]")
    public WebElement getInTouch;

    @FindBy(xpath= "(//input[@type='text'])[1]")
    public WebElement enterName;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement enterEmail;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement enterSubject;

    @FindBy (xpath = "//*[@id='message']")
    public WebElement messages;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement file;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@class='status alert alert-success']")
    public WebElement alertMessage;

    @FindBy(xpath = "//*[@class='fa fa-angle-double-left']")
    public WebElement homeButtuon;

    @FindBy(xpath = "//h2")
    public WebElement homaPage;
}


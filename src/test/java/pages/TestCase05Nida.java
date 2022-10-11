package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestCase05Nida {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and already registered email address
7. Click 'Signup' button
8. Verify error 'Email Address already exist!' is visible
     */

    public TestCase05Nida(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement home;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement login;

    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    public WebElement newUser;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement signup;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement error;



}

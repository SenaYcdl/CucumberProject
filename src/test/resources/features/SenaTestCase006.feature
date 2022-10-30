# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Contact Us' button
#5. Verify 'GET IN TOUCH' is visible
#6. Enter name, email, subject and message
#8. Click 'Submit' button
#10. Verify success message 'Success! Your details have been submitted successfully.' is visible
#11. Click 'Home' button and verify that landed to home page successfully

Feature: TC006

  Scenario: TC006 Automation Exercise

    Given automation "automationUrl" page
    And Verify that home page is visible successfully
    Then Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And  Enter name, email, subject and message
    And  Click Submit button
    Then  Verify success message Success! Your details have been submitted successfully. is visible
    And  Click Home button and verify that landed to home page successfully
    And close the page




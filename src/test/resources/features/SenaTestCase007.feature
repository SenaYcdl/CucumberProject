# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Test Cases' button
#5. Verify user is navigated to test cases page successfully

  Feature: TC007

    Scenario: TC007 Automation Exercise

      Given automation "automationUrl" page
      And Verify that home page is visible successfully
      Then  Click on Test Cases button
      And Verify user is navigated to test cases page successfully
      And close the page

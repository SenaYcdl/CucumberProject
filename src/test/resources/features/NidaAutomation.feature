#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfullyy
#4. Click on 'Signup / Login' button
#5. Verify 'Login to your account' is visible
#6. Enter correct email address and password
#7. Click 'login' button
#8. Verify that 'Logged in as username' is visible
#9. Click 'Logout' button
#10. Verify that user is navigated to login page

Feature: US001 AutomationExercise register

  @atm
  Scenario: TC01 Valid test data register

    Given automation page
    And Verify that home page is visible
    And Click on SignupLogin button
    And verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible
    And Click Logout button
    Then Verify that user is navigated to login page
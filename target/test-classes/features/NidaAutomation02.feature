#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'New User Signup!' is visible
#6. Enter name and already registered email address
#7. Click 'Signup' button
#8. Verify error 'Email Address already exist!' is visible

  Feature: US001 AutomationExercise new  user
    Scenario: TC02 Valid new user register

      Given automation "automationUrl" page
      And Verify that home page is visible successfully
      And Click on Signup Login button
      And Verify New User Signup is visible
      And Enter name and already registered email address
      And Click Signup button
      Then Verify error is visible

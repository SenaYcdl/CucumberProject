# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Products' button
#5. Verify user is navigated to ALL PRODUCTS page successfully
#6. Enter product name in search input and click search button
#7. Verify 'SEARCHED PRODUCTS' is visible
#8. Verify all the products related to search are visible

  Feature: Automation Exercise

    Scenario: TC009 Search Product

      Given automation "automationUrl" page
      And Verify that home page is visible successfully
      Then Click on Product button
      And Verify user is navigated to ALL PRODUCTS page successfully
      And Enter product name in search input and click search button
      Then Verify SEARCHED PRODUCTS is visible
      And Verify all the products related to search are visible
